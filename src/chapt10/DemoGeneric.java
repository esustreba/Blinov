package chapt10;

import java.util.ArrayList;

public class DemoGeneric {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Fortress");
        String res = list.get(0);
        System.out.println(list);
    }
}
