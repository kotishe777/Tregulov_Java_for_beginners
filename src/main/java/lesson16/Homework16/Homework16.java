package lesson16.Homework16;

public class Homework16 {

    public void email(String s) {
        int a = 0;
        int b = 0;
        int c = 0;

        while(c < s.length() - 1) {
            a = s.indexOf('@', c);
            b = s.indexOf('.', c);
            c = s.indexOf(';', c + 1);
            System.out.println(s.substring(a + 1, b));
        }
    }

    public static void main(String[] args) {
        Homework16 h16 = new Homework16();
        h16.email("ya@yahoo.com; on@mail.ru; ona@gmail.com;");
    }

}
