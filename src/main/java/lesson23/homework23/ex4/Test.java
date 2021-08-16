package lesson23.homework23.ex4;

public class Test {
    public static void abc(X x, Y y){
        System.out.println("hi");
    }

    public static void abc(Y y, X x){
        System.out.println("bye");
    }

    public static void main(String[] args) {
        Y a = new Y();
//        abc(a,a);
    }
}
