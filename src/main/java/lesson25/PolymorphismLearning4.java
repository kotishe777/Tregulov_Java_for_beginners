package lesson25;

public class PolymorphismLearning4 {
    public static void main(String[] args) {
        String[] array1 = {"hi", "bye"};
        Object[] array2 = array1;
        String[] array3 = (String[])array2;
//        array3[0] = new StringBuilder("ok");
        array2[0] = new StringBuilder("ok");
    }
}