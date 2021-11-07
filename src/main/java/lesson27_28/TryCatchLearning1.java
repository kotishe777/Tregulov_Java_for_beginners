package lesson27_28;

public class TryCatchLearning1 {
    public static void main(String[] args) {
        int [] array = {4, 8, 1};
        System.out.println("There is an array");

        try {
            System.out.println(array[5]);
            System.out.println("Bye");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("The exception was caught:" + e);
        }
        finally {
            System.out.println("This is finally block");
        }

        System.out.println("These kode doesn't relate to exception");
    }
}
