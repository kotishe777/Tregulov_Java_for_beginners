package lesson23;

public class D {
    String s1 = "Hi";
    static double d = 3.14;

    int sum (int... i) {
        int result = 0;
        for (int a : i) {
            result += a;
        }
        return result;
    }

    static void abc(){
        System.out.println("static method");
    }
}

class E extends D{
//    String s1 = super.s1 + ", friend!";
//    static String s1 = super.s1;
    boolean s1 = true;
    double d = super.d;

    int sum (int... i) {
        int result;
        result = super.sum(i);
        System.out.println(result);
        super.abc();
        return result;
    }

    public static void main(String[] args) {
        E e = new E();
        System.out.println(e.s1);
//        System.out.println(super.s1);
    }
}
