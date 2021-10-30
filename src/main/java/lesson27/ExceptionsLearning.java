package lesson27;

public class ExceptionsLearning {

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
