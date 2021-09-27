package lesson25;

public class CastingLearning {
    public static void main(String[] args) {
        byte b = 10;
        int a = b;
        System.out.println();
        final int i1 = 100;
        final int i2 = 200;
        byte b2 = 3;
        short s1 = -6;
        char c1 = i1;
        char c2 = (char)i2;
        int i3 = 10000;
        short s2 = (short)i3;
        char c3 = (char)-8;
        int i4 = (int)3.14;

        int i5 = 5;
        long l = 10;
        i5 = (int)(i5 * l);
        i5 *= l;
        System.out.println(i5 + l);

        float f = 3.14f;
        int i6 = 10;
        System.out.println(f + i6);
    }
}
