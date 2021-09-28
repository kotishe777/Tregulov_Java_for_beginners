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

        byte b3 = 3;
        short s3 = 4;
        char c4 = 5;
        System.out.println(b3 + s3 + c4); //all are converted to int
        System.out.println(b3++); //byte is NOT converted to int

        byte b4 = 10;
        float f1 = 7;
        double d1 = 2.0;
        System.out.println(b4 + f1 - d1);

        float f2 = 0 * 1.5f;
        float f3 = 0 * (float)1.5;
    }
}
