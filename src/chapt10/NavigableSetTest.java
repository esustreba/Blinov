package chapt10;

import java.util.HashSet;
import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetTest {
    public static void main(String[] args) {
        HashSet<String> city = new HashSet<>();
        city.add("Minsk");
        city.add("Moscow");
        city.add("Polotsk");
        city.add("Brest");
        NavigableSet<String> ns = new TreeSet<String>(city);
        System.out.println("All: " + ns);
        System.out.println("First: " + ns.first());
        System.out.println("Between Minsk and Polotsk: " + ns.subSet("Minsk", "Polotsk"));
        System.out.println("Before Minsk: " + ns.headSet("Minsk"));
        System.out.println("After Minsk: " + ns.tailSet("Minsk", false));
    }
}
