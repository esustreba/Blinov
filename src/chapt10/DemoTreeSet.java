package chapt10;

import java.util.ArrayList;
import java.util.TreeSet;

public class DemoTreeSet {
    public static void main(String[] args) {
        ArrayList<String> c = new ArrayList<>();
        boolean b;
        for (int i = 0; i < 6; i ++)
            c.add((int) (Math.random() * 71) + "Y ");
        System.out.println(c + "list");
        TreeSet<String> set = new TreeSet<>(c);
        System.out.println(set + "tree");
        b = set.add("5 Element");
        b = set.add("5 Element");

        System.out.println(set + "add");
        System.out.println(set.comparator());

        System.out.println(set.last() + " " + set.first());
    }
}
