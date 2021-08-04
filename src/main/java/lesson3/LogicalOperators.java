package lesson3;

public class LogicalOperators {
    public static void main(String[] args) {

        boolean x=true;
        boolean y=false;
        boolean z=true;

        boolean result1=x&&y&&z;
        boolean result2=x||y||z;

        int a=5;
        int b=10;
        boolean c = !(a<b);
        boolean d = a>b;

        int f=99;
        int f1=101;
        int g=100;
        boolean h = a>b & f++==g;
        boolean j = a<b | f1--==g;

        boolean k1=false;
        boolean k2=false;
        boolean k3=false;
        boolean k4=true;

        System.out.println(!result1);
        System.out.println(h);
        System.out.println(f);
        System.out.println(j);
        System.out.println(f1);
        System.out.println(a&b);
        System.out.println(k1^k2^k3^k4);

    }
}
