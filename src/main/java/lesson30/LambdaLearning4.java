package lesson30;

public class LambdaLearning4 {

//    static void method11(Test t){
//        System.out.println(t.method1("Hi"));
//    }
//    static void method22(Test t){
//        System.out.println(t.method2());
//    }
//    static void method33(Test t){
//        System.out.println(t.method3("Hi"));
//    }
//    static void method44(Test t){
//        System.out.println(t.method4("Hi"));
//    }
//static void method55(Test t){
//    System.out.println(t.method5("Hi", "Bye"));
//}
static void method66(Test t){
    System.out.println(t.method6(10, 20));
}

    public static void main(String[] args) {
//        method11(x -> x.length());
//        method22(() -> 5);
//        method33((x) -> x.length());
//        method44((String x) -> 5);
//        method55((x, y) -> x.length());
        method66((int x, int y) -> { int z = 30; return 40;});
    }
}

interface Test{

//    int method1(String s);
//    int method2();
//    int method3(String s);
//    int method4(String s);
//    int method5(String s1, String s2);
int method6(int i1, int i2);
}
