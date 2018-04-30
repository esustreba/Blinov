package chapt10;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class DemoHashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<Integer, String>(5);
        for (int i = 11; i < 15; i ++)
            hm.put(i, i + "EL");
        System.out.println(hm);
        hm.put(12, "14EL");
        System.out.println(hm + " with replaced element");
        String a = hm.get(12);
        System.out.println(a + " - found with key '12'");
        Set<Map.Entry<Integer, String>> setvalue = hm.entrySet();
        System.out.println(setvalue);
        Iterator<Map.Entry<Integer, String>> i = setvalue.iterator();
        while ( i.hasNext()) {
            Map.Entry<Integer, String> me = i.next();
            System.out.print(me.getKey()+" : ");
            System.out.println(me.getValue());
        }
    }
}
