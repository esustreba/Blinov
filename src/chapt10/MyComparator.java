package chapt10;

import java.util.Comparator;

public class MyComparator<T>  implements Comparator<Integer> {
    public int compare(Integer n, Integer m) {
        return m.intValue() - n.intValue();
    }

}

