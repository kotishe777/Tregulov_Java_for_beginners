package lesson29.homework29;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Homework29 {
    DateTimeFormatter f1 = DateTimeFormatter.ofPattern("yyyy, MMMM-dd !! hh:mm");
    DateTimeFormatter f2 = DateTimeFormatter.ofPattern("hh:mm, dd/MMM/yy");

    public void change(LocalDateTime ldt1, LocalDateTime ldt2, Period p, Duration d) {
        while (ldt1.isBefore(ldt2)) {
            System.out.print("Working from " + ldt1.format(f1));
            ldt1 = ldt1.plus(p);
            System.out.println(" to " + ldt1.format(f1));

            System.out.print("Chilling from  " + ldt1.format(f2));
            ldt1 = ldt1.plus(d);
            System.out.println(" to " + ldt1.format(f2));

            System.out.println("_____________________________________________________________________________________");
        }
    }

    public static void main(String[] args) {
        Homework29 h = new Homework29();
        LocalDateTime ldt1 = LocalDateTime.now();
        LocalDateTime ldt2 = ldt1.plusYears(1);
        Period p = Period.ofMonths(3);
        Duration d = Duration.ofDays(25);
        h.change(ldt1, ldt2, p, d);
    }
}
