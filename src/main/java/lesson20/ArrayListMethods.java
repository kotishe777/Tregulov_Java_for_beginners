package lesson20;

import java.util.Arrays;

public class ArrayListMethods {
    public static void main(String[] args) {
        int [] array1 = {1,2,3,4,5};
        int [] array2 = {1,2,3,5};
        int [] array3 = {1,2,3,5};

        char [] array4 = {'s', 't', 'r', 'e', 'e', 't'};
        char [] array5 = {'s', 't', 'r', 'i', 'n', 'g'};

        System.out.println(Arrays.compare(array1, array2));
        System.out.println(Arrays.compare(array2, array1));
        System.out.println(Arrays.compare(array2, array3));
        System.out.println(Arrays.compare(array4, array5));
        System.out.println(Arrays.compare(array5, array4));
        System.out.println();
        System.out.println(Arrays.mismatch(array1, array2));
        System.out.println(Arrays.mismatch(array2, array1));
        System.out.println(Arrays.mismatch(array2, array3));
        System.out.println(Arrays.mismatch(array4, array5));
        System.out.println(Arrays.mismatch(array5, array4));
    }
}
