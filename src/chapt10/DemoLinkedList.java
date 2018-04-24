package chapt10;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;

public class DemoLinkedList {
    public static void main(String[] args) {
        LinkedList<Number> a = new LinkedList<>();
        for(int i = 10; i <=15; i ++)
            a.add(i);
        for(int i = 16;i <=20; i ++)
            a.add(new Float(i));
        ListIterator<Number> list = a.listIterator(10);
        System.out.println("\n" + list.nextIndex() + " - index");

        list.next();
        System.out.println(list.nextIndex() + " - index");
        list.remove();
        while (list.hasPrevious())
            System.out.print(list.previous() + "  ");
        a.removeFirst();
        a.offer(71);
        a.poll();
        a.remove();
        a.remove(1);
        System.out.println("\n" + a);

        Queue<Number> q = a;
        for (Number i : q)
            System.out.print(i + " ");
        System.out.println(" :size= " + q.size());

        for(int i = 0; i < 5; i++) {
            Number res = q.poll();
        }
        System.out.println("size= " + q.size());
        }
    }

