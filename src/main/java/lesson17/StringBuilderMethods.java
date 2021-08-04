package lesson17;

class Car{}

public class StringBuilderMethods {

    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("Good day!!!");
        StringBuilder sb3 = new StringBuilder(50);
        StringBuilder sb4 = new StringBuilder(sb3);

        System.out.println(sb2.length());
        System.out.println(sb2.charAt(5));
        System.out.println(sb2.indexOf("d"));
        System.out.println(sb2.indexOf("!!!"));
        System.out.println(sb2.indexOf("d", 2));

        String s1 = sb2.substring(5);
        System.out.println(s1);

        String s2 = sb2.substring(5, 8);
        System.out.println(s2);

        System.out.println(sb2.subSequence(5, 8));

        sb2.append(22);
        System.out.println(sb2);

        sb2.append(true);
        System.out.println(sb2);

        sb2.append(sb2);
        System.out.println(sb2);

        sb2.append("Hello");
        System.out.println(sb2);

        sb2.append(new Car());
        System.out.println(sb2);

        System.out.println(sb2.insert(4, 55));
        System.out.println(sb2.insert(sb2.length(), "Hello"));

        StringBuilder sb5 = new StringBuilder("Hello world");

        sb5.delete(3, 6);
        System.out.println(sb5);

        sb5.deleteCharAt(6);
        System.out.println(sb5);

        sb5.reverse();
        System.out.println(sb5);

        StringBuilder sb6 = new StringBuilder("Hello everybody");

        sb6.replace(0, 5, "Bye");
        System.out.println(sb6);

        System.out.println(sb6.capacity());
        System.out.println(sb1.capacity());
    }
}
