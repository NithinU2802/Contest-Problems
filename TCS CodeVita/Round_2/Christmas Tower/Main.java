import java.util.*;

public class Main {

    public static void christmasTower(int[] a, int n, int mx) {
        for (int i = 1; i < n; i++)
            if (a[i - 1] > a[i]) {
                int t = a[i - 1];
                a[i - 1] = a[i];
                a[i] = t;
            }
        Map<Integer, Integer> fq = new HashMap<>();
        int[] tw = new int[10001];
        Arrays.fill(tw, -1);
        tw[0] = 0;
        for (int i : a)
            for (int j = i; j <= mx; j++)
                if (tw[j - i] != -1)
                    tw[j] = Math.max(tw[j], tw[j - i] + 1);

        if (tw[mx] == -1) {
            System.out.println("Impossible");
            return;
        }
        int k = mx;
        while (k > 0)
            for (int i : a)
                if (k - i >= 0 && tw[k] == tw[k - i] + 1) {
                    fq.put(i, fq.getOrDefault(i, 0) + 1);
                    k -= i;
                    break;
                }
        List<Map.Entry<Integer, Integer>> res = new ArrayList<>(fq.entrySet());
        int sz = res.size(), c = 0;
        res.sort(Comparator.comparing(Map.Entry<Integer, Integer>::getValue).reversed()
                .thenComparing(Map.Entry<Integer, Integer>::getKey));
        for (Map.Entry<Integer, Integer> i : res) {
            c++;
            if (c < sz)
                System.out.print(i.getKey() + " ");
            else
                System.out.print(i.getKey());
        }
    }

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int mx = x.nextInt();
        int[] a = new int[5];
        for (int i = 0; i < 5; i++)
            a[i] = x.nextInt();
        christmasTower(a, 5, mx);
    }

}