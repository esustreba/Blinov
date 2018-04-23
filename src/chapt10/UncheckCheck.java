package chapt10;

import java.util.ArrayList;

public class UncheckCheck {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(71);
        list.add(new Boolean("TruE"));
        list.add("Java 8");

        int i = (Integer) list.get(0);
        boolean b = (Boolean) list.get(1);
        String str = (String) list.get(2);
        for(Object ob : list)
            System.out.println("list " + ob);

        ArrayList<Integer> s = new ArrayList<>();
        s.add(71);
        s.add(92);
        for(Integer ob : s)
            System.out.println("int " + ob);
    }
}
