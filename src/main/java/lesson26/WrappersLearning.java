package lesson26;

import java.util.ArrayList;

public class WrappersLearning {
    public static void main(String[] args) {
        Long l = 50l;

        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        int a = list.get(0);

        Integer b = 10;
        int c = b;
        switch(b){};

        Number d = 20;
        int e = (int)d;

        String s1 = "50";
        String s2 = "true";
        String s3 = "xyz";
        String s4 = "3.14";
        int i1 = Integer.parseInt(s1);
        boolean b1 = Boolean.parseBoolean(s2);
        boolean b2 = Boolean.parseBoolean(s3);
        double d2 = Double.parseDouble(s4);
        System.out.println(i1);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(d2);

        Integer i2 = Integer.valueOf(10);
        System.out.println(i2);
        Integer i3 = Integer.valueOf(s1);
        System.out.println(i3);

        Byte b3 = 5;
    }
}
