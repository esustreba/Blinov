package chapt10;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class UniqSortMark {
    public static void main(String[] args) {
        ArrayList<Student> p = new ArrayList<>();
        p.add(new Student(3.9f, 52201));
        p.add(new Student(3.65f, 52224));
        p.add(new Student(3.71f, 52251));
        p.add(new Student(3.02f, 52277));
        p.add(new Student(3.81f, 52292));
        p.add(new Student(9.9f, 52271));

        try {
            Collections.sort(p, Student.class.newInstance());
        } catch (InstantiationException e1) {
            e1.printStackTrace();
        } catch (IllegalAccessException e2) {
            e2.printStackTrace();
        }
        for (Student ob : p)
            System.out.printf("%.2f ", ob.getMark());
    }
}
