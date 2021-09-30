package lesson26;

public class OverloadingMethodsLearning {
    void abc(int i){
        System.out.println("int");
    }

    void abc(byte b){
        System.out.println("byte");
    }

    void abc(long l){
        System.out.println("long");
    }

    void def(Object o){
        System.out.println("Object");
    }

    void def(String s){
        System.out.println("String");
    }

    void ghi(int a, int b){
        System.out.println("1");
    }

    void ghi(long a, long b){
        System.out.println("2");
    }

    void ghi(Integer a, Integer b){
        System.out.println("3");
    }

    void ghi(int... a){
        System.out.println("4");
    }

    void jkl(long l){
        System.out.println("5");
    }

    void jkl(Integer i){
        System.out.println("6");
    }

    public static void main(String[] args) {
        OverloadingMethodsLearning o = new OverloadingMethodsLearning();
        o.abc(5);
        o.def("hi");
        o.ghi(1,2);
        o.jkl(50);
    }
}
