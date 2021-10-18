package lesson26;

public class InitializerBlockLearning3 {
    int i = 3;

    InitializerBlockLearning3(){
        i = 4;
    }

    {
        i = 5;
    }

    public static void main(String[] args) {
        InitializerBlockLearning3 ibl1 = new InitializerBlockLearning3();
        System.out.println(ibl1.i);
    }
}

class A{
    final int a;
    final static int b;

    A(){
        a = 10;
    }

    static {
        b = 20;
    }
}