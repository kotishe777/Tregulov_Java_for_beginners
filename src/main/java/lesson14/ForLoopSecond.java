package lesson14;

public class ForLoopSecond {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        int a = 1;
        for (; a <= 10; a++) {
            System.out.println(a);
        }
        for (int b = 10, c = 11, d = 12; b <= 10 && b > -3; b++, c++, abc(3)) {
            System.out.println(b+c);
        }
    }

    static void abc(int n) {
        System.out.println(n);
    }
}
