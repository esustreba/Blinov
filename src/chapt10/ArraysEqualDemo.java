package chapt10;


import java.util.Arrays;

public class ArraysEqualDemo {
    public static void main(String[] args) {
        char m1[] = new char[3];
        char m2[] = {'a', 'b', 'c'}, i;
        Arrays.fill(m1, 'a');
        System.out.print("Array m1: ");
        for(i = 0; i < 3; i ++)
            System.out.print(" " + m1[i]);
        m1[1] = 'b';
        m1[2] = 'c';
        if (Arrays.equals(m1, m2))
            System.out.print("\nm1 and m2 equal");
        else
            System.out.print("\nm1 and m2 not equal");
        m1[0] = 'z';
        Arrays.sort(m1);
        System.out.print("\narray m1:");
        for(i = 0; i < 3; i ++)
            System.out.print(" " + m1[i]);
        System.out.print("\n value 'c' at index- " + Arrays.binarySearch(m1, 'c'));
        Integer arr[] = {35, 71, 92};
        System.out.println(Arrays.deepToString(arr));
        System.out.println(Arrays.deepHashCode(arr));
        Integer arr2[] = {35, 71, 92};
        System.out.println(Arrays.deepEquals(arr, arr2));
        char m3[] = new char[5];
        m3 = Arrays.copyOf(m1, 5);
        System.out.print("array m3:");
        for(i = 0; i < 5; i ++)
            System.out.print(" " + m3[i]);
    }
}
