import java.util.*;

class Element {
    int dm;
    int size;
    int cat;

    Element(int damage, int size, int category) {
        this.dm = damage;
        this.size = size;
        this.cat = category;
    }
}

public class Main {

    public static int maxDamage(List<Integer> dm, List<Integer> sz, List<Integer> cat, int bar) {

        List<Element> list = new ArrayList<>();
        for (int i = 0; i < sz.size(); i++)
            list.add(new Element(dm.get(i), sz.get(i), cat.get(i)));

        Collections.sort(list, (t1, t2) -> Integer.compare(t2.dm, t1.dm));
        Set<Integer> check = new HashSet<>();
        int res = 0;
        for (Element i : list)
            if (i.size <= bar && !check.contains(i.cat)) {
                check.add(i.cat);
                bar -= i.size;
                res += i.dm;
            }
        return res;
    }

    public static void main(String[] args) {
        String[] dam = x.nextLine().split(" ");
        String[] sz = x.nextLine().split(" ");
        String[] cat = x.nextLine().split(" ");
        List<Integer> damages = new ArrayList<>();
        for (String i : dam)
            damages.add(i);
        List<Integer> sizes = new ArrayList<>();
        for (String i : sz)
            sizes.add(i);
        List<Integer> categories = new ArrayList<>();
        for (String i : cat)
            categories.add(i);
        int b = x.nextInt();
        System.out.print(maxDamage(damages, sizes, categories, b));
    }
}
