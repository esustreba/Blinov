package chapt10;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class DemoIterator {
    public static void main(String[] args) {
        ArrayList<Double> c = new ArrayList<>();
        for(int i = 0; i < 10; i ++){
            double z = new Random().nextGaussian();
            c.add(z);
        }
        for(Double d : c) {
            System.out.printf("%.2f", d);
        }
        int positiveNum = 0;
        int size = c.size();

        Iterator<Double> it = c.iterator();
        while (it.hasNext()) {
            if(it.next() > 0) positiveNum++;
            else it.remove();
        }
        System.out.printf("%nPositive: %d ", positiveNum);
        System.out.printf("%nNegative: %d", size - positiveNum);
        System.out.println("\nPositive collection");
        for(Double d : c) {
            System.out.printf("%.2f", d);
        }
    }
}
