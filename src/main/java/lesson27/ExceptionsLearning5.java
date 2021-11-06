package lesson27;

public class ExceptionsLearning5 {

    public void abc() {
        int[] array = {1, 2, 3};

        try {
            System.out.println(array[7]);
        } catch (ArrayIndexOutOfBoundsException e) {
            String s = null;
            try {
                System.out.println(s.length());
            }
            catch (NullPointerException e2){
                System.out.println("This is inner catch block");
            }
        } catch (NullPointerException e) {
            System.out.println("This is outer catch block");
        }
    }

    public static void main(String[] args) {
        ExceptionsLearning5 t = new ExceptionsLearning5();
        t.abc();
    }
}
