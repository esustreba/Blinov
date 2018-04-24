package chapt10;

import java.util.ArrayList;
import java.util.ListIterator;

public class DemoListMethods {
    public static void main(String[] args) {
        ArrayList<Character> a = new ArrayList<>();
        System.out.println("Array is empty: " + a.isEmpty());
        for (char c = 'a'; c < 'h'; ++c) {
            a.add(c);
        }
        char ch = 'a';
        a.add(6, ch);
        System.out.println(a);
        ListIterator<Character> it;
        it = a.listIterator(2);
        System.out.println("Add element in position " + it.nextIndex());
        it.add('X');
        System.out.println(a);
        int index = a.lastIndexOf(ch);
        a.set(index, 'W');
        System.out.println(a + "after element changed");
            if (a.contains(ch)) {
            a.remove(a.indexOf(ch));
        }
        System.out.println(a + "remove element " + ch);

    }
}
