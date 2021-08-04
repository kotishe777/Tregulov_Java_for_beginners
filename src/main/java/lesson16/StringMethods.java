package lesson16;

import java.util.Locale;

public class StringMethods {
    public static void main(String[] args) {
        String s1 = new String(" Hello, Dolly ");

        int i = s1.length();
        System.out.println(i);

        char c1 = s1.charAt(3);
        System.out.println(c1);

        int i1 = s1.indexOf('l');
        System.out.println(i1);

        int i2 = s1.indexOf("ll");
        System.out.println(i2);

        int i3 = s1.indexOf("z");
        System.out.println(i3);

        int i4 = s1.indexOf("o", 5);
        System.out.println(i4);

        boolean b1 = s1.startsWith("abc");
        System.out.println(b1);

        boolean b2 = s1.startsWith("Dol", 8);
        System.out.println(b2);

        boolean b3 = s1.endsWith("ly");
        System.out.println(b3);

        String s2 = s1.substring(3);
        System.out.println(s2);

        String s3 = s1.substring(3,7);
        System.out.println(s3);

        String s4 = s1.trim();
        System.out.println(s4);

        String s5 = s1.replace('D', 'M');
        System.out.println(s5);

        String s6 = s1.replace("Dolly", "Kitty");
        System.out.println(s6);

        String s7 = new String("Hello, Dolly");
        String s8 = s7.replace('H', 'H');
        System.out.println(s7==s8);

        String s9 = new String("Hello, ");
        String s10 = new String("Dolly");
        System.out.println(s9.concat(s10));

        int a = 5;
        int b = 6;
        String s = "ok";
        System.out.println(a + b + s);

        String str = null;
        str+="ok";
        System.out.println(str);

        String s11 = "HeLLo";
        String s12 = s11.toLowerCase();
        System.out.println(s12);
        String s13 = s11.toUpperCase();
        System.out.println(s13);

        boolean c = s13.contains("HELL");
        System.out.println(c);

        String s14 = "Hello world";
        String s15 = "Yeeeep!!!";
        String s16 = s14.concat(s15).trim().replace("Yeeep", "Coool").substring(6, 10);
        System.out.println(s14.substring(s14.indexOf("w")));

        String s17 = new String("ok");
        String s18 = new String("ok");
        System.out.println(s17 == s18);
        System.out.println(s17.equals(s18));

        String s19 = "ok";
        String s20 = "ok";
        System.out.println(s19 == s20);
        System.out.println(s19.equals(s20));

        String s21 = new String("ok");
        String s22 = "ok";
        System.out.println(s21 == s22);
        System.out.println(s21.equals(s22));

        String s23 = "OK";
        String s24 = "ok";
        System.out.println(s23.equals(s24));
        System.out.println(s23.equalsIgnoreCase(s24));

        String s25 = "hello";
        String s26 = "hello".trim();
        System.out.println(s25 == s26);

        String s27 = "hello";
        String s28 = " hello".trim();
        System.out.println(s27 == s28);
    }

}
