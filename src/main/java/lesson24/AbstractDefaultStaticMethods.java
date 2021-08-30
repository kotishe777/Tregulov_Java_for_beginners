package lesson24;

public class AbstractDefaultStaticMethods {
}

class A{
    String s = "hi";

    void abc(){
        System.out.println("???");
    }
}

class B extends A{
    String s = "bye";

    void abc(){
        System.out.println("!!!");
    }
}

class C extends B{
    public static void main(String[] args) {
        C c = new C();
        c.abc();
        System.out.println(c.s);
    }
}

