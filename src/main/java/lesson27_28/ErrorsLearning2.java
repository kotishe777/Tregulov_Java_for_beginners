package lesson27_28;

public class ErrorsLearning2 {

    static {
        int i1 = Integer.parseInt("12e");
    }

    static String s1 = null;
    int i2 = s1.length();

    static String s2 = abc();
    static String abc(){
        String [] array = {"1", "2"};
        return array[100];
    }

    public static void main(String[] args) {

    }
}
