package chapt10;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

public class SafeCollection {
    public static void main(String[] args) {
        Collection c = Collections.checkedCollection(new HashSet<String>(), String.class);
        c.add("Java");
      //  c.add(7.0); ClassCastException
    }
}
