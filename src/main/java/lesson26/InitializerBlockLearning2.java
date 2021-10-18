package lesson26;

public class InitializerBlockLearning2 {

    {
        System.out.println("This is init block 1");
    }

    {
        System.out.println("This is init block 2");
    }

    {
        System.out.println("This is init block 3");
    }

    static {
        System.out.println("This is static init block 1");
    }

    static {
        System.out.println("This is static init block 2");
    }

    InitializerBlockLearning2(){
        System.out.println("This is constructor 1");
    }

    InitializerBlockLearning2(int i){
        System.out.println("This is constructor 2");
    }

    public static void main(String[] args) {
        InitializerBlockLearning2 ibl1 = new InitializerBlockLearning2();
        InitializerBlockLearning2 ibl2 = new InitializerBlockLearning2(3);
    }
}