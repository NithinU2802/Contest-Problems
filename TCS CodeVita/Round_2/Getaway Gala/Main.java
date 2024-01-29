import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        String[] s = x.nextLine().split(" ");
        Queue<String> names = new LinkedList<String>();
        for (String i : s)
            names.add(i);
        int N = 2;
        ArrayList<String> rm = new ArrayList<>();
        ArrayList<String> frontElements = new ArrayList<>();

        while (!names.isEmpty()) {
            String front = names.poll();
            String r = "" + front.charAt(0);
            ArrayList<String> ls = new ArrayList<>(names);
            if (!rm.contains(front)) {
                for (int i = 1; i < ls.size(); i++) {
                    if (isPalindrome(r + ls.get(i).charAt(0)))
                        rm.add(ls.get(i));
                    else
                        r += ls.get(i).charAt(0);
                }
                frontElements.add(front);
            }
        }
        while (frontElements.size() > N)
            frontElements.remove(N - 1);
        System.out.println(frontElements.get(0));
    }

    private static boolean isPalindrome(String str) {
        int i=0,j=str.length()-1;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}
