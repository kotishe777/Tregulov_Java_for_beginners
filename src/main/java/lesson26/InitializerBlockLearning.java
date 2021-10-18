package lesson26;

public class InitializerBlockLearning {
    String s;

    {
        s = "ok";
        System.out.println("hello");
        int i = 5;
        System.out.println(i);
    }

    public static void main(String[] args) {
        InitializerBlockLearning s = new InitializerBlockLearning();
    }
}