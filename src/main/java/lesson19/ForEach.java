package lesson19;

public class ForEach {
    public static void main(String[] args) {
        int [] array = {0,6,4,1};
        for(int a : array){
            System.out.print(a + " ");
        }
        System.out.println();

        int sum = 0;
        for(int a : array){
            sum += a;
        }
        System.out.println(sum);

        String [] students = {"Ivanov", "Petrov", "Sidorov"};
        String [] exams = {"math", "language"};

        for (String s1 : students){
            for (String s2 : exams){
                System.out.println(s1 + " " + s2);
            }
        }
        System.out.println();

        int [][] array2 = {{3,7,8},{4,5},{9,4,4,6,8,3}};
        for (int[] array3 : array2){
            for(int a : array3) {
                System.out.print(a + " ");
            }
        }
        System.out.println();

        for(int a : array){
            a = 3;
        }
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i]+ " ");
        }
        System.out.println();

        StringBuilder sb1 = new StringBuilder("hi");
        StringBuilder sb2 = new StringBuilder("bye");
        StringBuilder sb3 = new StringBuilder("ok");
        StringBuilder [] array4 = {sb1, sb2, sb3};

        for(StringBuilder s : array4){
//            s = new String("new");
            s.append(" Java");
        }
        for(int i = 0; i < array4.length; i++){
            System.out.print(array4[i]+ " ");
        }
        System.out.println();

        int [] array5 = new int[4];
        for(int i = 0; i < array5.length; i++){
            array5[i] = i * 10;
        }
        for(int a : array5){
            System.out.print(a + " ");
        }
        for(int b : array5){
            b = 10;
        }
        for(int a : array5){
            System.out.print(a + " ");
        }


    }
}
