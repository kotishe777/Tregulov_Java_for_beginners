package lesson18;

import java.util.Arrays;

public class ArrayMethods {

    public static void maxMin(double[] array) {
        double max = array[0];
        double min = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println(min + " " + max);
    }

    public static void main(String[] args) {
        int array1[] = {1, -2, 3, 4, 5, -6, 7, -8, 9};
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
        System.out.println();

        Arrays.sort(array1);
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
        System.out.println();

        int index = Arrays.binarySearch(array1, 5);
        System.out.println(index);

        double array2[] = {1.5, -2.4, 3.3, 4.2, 5.1, -6.9, 7.5, -8.4, 9.4};
        maxMin(array2);
        maxMin(new double [] {2.5, 3.5});

        char [] array3 = {'h', 'e', 'l', 'l', 'o'};
        String s = new String(array3);
        System.out.println(s);

        StringBuilder sb = new StringBuilder("aaaaaaaaaa");
        sb.append(array3, 2, 3);
        System.out.println(sb);
        sb.insert(2, array3, 2, 3);
        System.out.println(sb);

    }

}
