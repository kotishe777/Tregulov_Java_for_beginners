package lesson18;

public class ArrayLearning {
    public static void main(String[] args) {
        int [] array1;
        String [] array2;
        double [][] array3;
        int [][] array4;

        array1 = new int[8];
        array2 = new String[3];
        array3 = new double[4][2];
        array4 = new int[4][];

        System.out.println(array2.length);
        array2[0] = "hello";
        array2[1] = "bye";
        array2[2] = "ok";

        array3[2][1] = 3.14;

        double [] array5;
        array5 = new double[2];
        array5[0] = 2.5;
        array5[1] = 3.5;

        array3[1] = array5;
        System.out.println(array3[1][0]);

        double [] array6;
        array6 = new double[2];
        array6 = array5;
        array6[5-4] = 8;
        array6[array6.length-1] = 9;

        int array7 [] = {1,2,3};
        int array8 [] = {1,2,3};
        int array9 [] = array7;
        System.out.println(array7 == array8);
        System.out.println(array7.equals(array8));
        System.out.println(array7 == array9);
        System.out.println(array7.equals(array9));






    }
}
