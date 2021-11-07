package lesson27_28;

public class ExceptionsLearning1 {

    void abc() throws NullPointerException {
        String s = null;
        System.out.println(s.length());
    }

    public static void main(String[] args) {
        int array[] = {1, 4, 0};
        try {
            System.out.println(array[5]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("The exception is caught:" + e);
        }
    }
}
