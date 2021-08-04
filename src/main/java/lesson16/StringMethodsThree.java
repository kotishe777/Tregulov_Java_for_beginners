package lesson16;

public class StringMethodsThree {

    public static void main(String[] args) {
        String s1 = "  " +
                " ";
        System.out.println(s1.isBlank());

        String s2 = "";
        System.out.println(s2.isEmpty());

        String s3 = "  Hello, dolly  " +
                " ";
        System.out.println(s3.strip());
        System.out.println(s3.stripLeading());
        System.out.println(s3.stripTrailing());

        String s4 = "Hello";
        String s5 = s4.strip();
        System.out.println(s4 == s5);
    }
}
