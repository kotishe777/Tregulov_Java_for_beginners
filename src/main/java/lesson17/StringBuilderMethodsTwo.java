package lesson17;

public class StringBuilderMethodsTwo {

    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("123");
        StringBuilder sb2 = sb1.append("45");
        sb2 = sb2.append("6").append("7");
        System.out.println(sb1);
        System.out.println(sb2);

        StringBuilder sb3 = new StringBuilder("123");
        StringBuilder sb4 = sb3;
        System.out.println(sb1 == sb3);
        System.out.println(sb1.equals(sb3));
        System.out.println(sb3 == sb4);
        System.out.println(sb3.equals(sb4));

        StringBuilder sb5 = new StringBuilder("Hello");
        String s1 = new String(sb5);

        StringBuffer sb6 = new StringBuffer("Bye");
        String s2 = new String(sb6);


    }

}
