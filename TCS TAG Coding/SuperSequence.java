/*
 * 
 * We are given with string P,Q and R. Given string r is supersequence if
 * Characters of P and Q are in string R also in a same order.
 * 
 * TestCase 1:
 * P="PAN"
 * Q="COT"
 * R="PANOCT"
 * 
 * Output:
 * False
 * 
 * TestCase 2:
 * P='PAN'
 * Q='MAT'
 * R='PMAANT'
 * 
 * Output:
 * True
 * 
 */

import java.util.*;

public class SuperSequence {

    public static boolean check(String p, String q, String r) {
        int i = 0, j = 0, k = 0;
        while (i < r.length()) {
            if (j < p.length() && p.charAt(j) == r.charAt(i)) {
                i++;
                j++;
            } else if (k < q.length() && q.charAt(k) == r.charAt(i)) {
                k++;
                i++;
            } else
                return false;
        }
        if (j == p.length() && k == q.length() && i == r.length())
            return true;
        return false;
    }

    public static void main(String[] arg) {
        Scanner x = new Scanner(System.in);
        String p = x.nextLine(), q = x.nextLine(), r = x.nextLine();
        if (check(p, q, r))
            System.out.println("True");
        else
            System.out.println("False");
    }
}
