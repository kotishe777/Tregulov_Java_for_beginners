package lesson21;

public class OverloadedMethods {

    int a = 5;
    int b;
    //b = 4;
    int c,d,e;
    int f,g=5,h;

    public void abc(String s){
        int c;
        c = 10;
        System.out.println(s);
    }

    public void abc(boolean b){
        System.out.println(b);
    }

    private StringBuilder abc(StringBuilder sb){
        System.out.println(sb);
        return new StringBuilder("bye");
    }

    public void abc(int a, double b){
        System.out.println("hi");
    }

    public void abc(double a, int b){
        System.out.println("bye");
    }

    public static void main(String[] args) {
        OverloadedMethods overloadedMethods = new OverloadedMethods();
        //overloadedMethods.abc(1, 2);
    }

}
