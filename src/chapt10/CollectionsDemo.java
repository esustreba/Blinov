package chapt10;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;


public class CollectionsDemo {
    public static void main(String[] args) {
        MyComparator<Integer> comp = new MyComparator<>();
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 2, 3, 4, 5);
        Collections.shuffle(list);
        print(list);
        Collections.sort(list, comp);
        print(list);
        Collections.reverse(list);
        print(list);
        Collections.rotate(list, 3);
        print(list);
        System.out.println("min: " + Collections.min(list, comp));
        System.out.println("max: " + Collections.max(list, comp));

        List<Integer> singl = Collections.singletonList(71);
        print(singl);
    }

    static void print(List<Integer> c) {
        for(int i : c)
            System.out.print(i + " ");
        System.out.println();

    }

}
