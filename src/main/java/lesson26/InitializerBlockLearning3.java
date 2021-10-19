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

class B{
    static int c;
    static final int d;
    static final int e = 1;
    static final int f;

    static{
        c = 5;
        d = 3;
//        e = 2;
        f = 0;
    }
}

class C{
    String s = "ok";
    static int i = 0;

    {
        System.out.println(s);
    }

    static {
        System.out.println(i);
    }

    {
        i += 1;
        System.out.println(i);
    }

    C(){
        System.out.println("There is a constructor");
    }

    public static void main(String[] args) {
        System.out.println("Hi");
        C c = new C();
    }
}

class D{
    static{
        abc(2);
    }

    static void abc(int a){
        System.out.println(a + " ");
    }

    D(){
        abc(5);
    }

    static{
        abc(4);
    }

    {
        abc(6);
    }

    static{
        new D();
    }

    {
        abc(8);
    }

    public static void main(String[] args) {

    }
}