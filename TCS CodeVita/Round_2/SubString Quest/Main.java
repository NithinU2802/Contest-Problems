import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        String a = x.nextLine();
        String b = x.nextLine();
        System.out.print(stringQuest(a, b));
    }

    private static String reverse(String r) {
        String s = "";
        for (int i = r.length() - 1; i >= 0; i--)
            s += r.charAt(i);
        return s;
    }

    private static String stringQuest(String a, String b) {
        int i = 0;
        String res = "";
        while (i < a.length()) {
            boolean flag = false;
            for (int j = a.length(); j >= i + 1; j--) {
                String s = a.substring(i, j);
                if (b.contains(s) || b.contains(reverse(s))) {
                    if (!res.equals(""))
                        res += "|" + s;
                    else
                        res += s;
                    i = j;
                    flag = true;
                    break;
                }
            }
            if (!flag)
                return "Impossible";
        }
        return res;
    }
}
