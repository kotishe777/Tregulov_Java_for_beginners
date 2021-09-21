package lesson24;

interface Int1 {
    int A = 5;

    private static void method1() {
        System.out.println("Static method");
    }
    private void method2(){
        System.out.println("Non-static method");
    }
    default void method3(){
        method1();
        method2();
    }
    static void method4(){
        method1();
//        method2();
    }
}

interface Int2{
    int A = 10;
}

public class InterfaceLearning4 implements Int1,Int2{
    public static void main(String[] args) {
//        System.out.println(A);
        System.out.println(Int1.A);
        System.out.println(Int2.A);
    }
}
