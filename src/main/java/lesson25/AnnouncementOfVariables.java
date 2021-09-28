package lesson25;

public class AnnouncementOfVariables {
    int a, b = 3, c, d = b + 5;
    int a2, b2 = 3, c2, d2 = a2 + 5;

    public static void main(String[] args) {
        AnnouncementOfVariables a = new AnnouncementOfVariables();
        System.out.println(a.d);
    }
}
