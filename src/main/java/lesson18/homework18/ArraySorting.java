package lesson18.homework18;

import java.util.Arrays;

public class ArraySorting {
    public static void main(String[] args) {
        sorting(new int[]{-4, 2, -3, 1});

        int[] array = {-3, 1, -2, 4};
        sorting2(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        showArray(new int[][]{{-4, 2, -3, 1}, {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12}, {-1, -2, -3, -4, -5, -6, -7, -8, -9, -10, -11, -12}});
        System.out.println();

        String array2[][] = {{"apple", "orange"}, {"banana", "cherry", "pine-apple"}, {"strawberry", "tangerine"}};
        showArray2(array2);
    }

    public static void sorting(int[] array) {
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static int[] sorting2(int[] array) {
        int a;
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int index = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    index = j;
                }
            }
            if (i != index) {
                a = array[i];
                array[i] = min;
                array[index] = a;
            }
        }
        return array;
    }


    public static void showArray(int[][] array) {
        System.out.println(array[0][0] + " " + array[0][1] + " " + array[1][10] + " " +
                array[2][10] + " " + array[2][11]);
        System.out.println();
    }

    public static void showArray2(String[][] array) {
        System.out.print("{  ");
        for (int i = 0; i < array.length; i++) {
            System.out.print("{");
            for (int j = 0; j < array[i].length; j++) {
                if (j != array[i].length - 1) {
                    System.out.print(array[i][j] + ", ");
                } else {
                    System.out.print(array[i][j]);
                }
            }
            if (i != array.length - 1) {
                System.out.print("}, ");
            } else {
                System.out.print("}");
            }
        }
        System.out.println("  }");
    }
}