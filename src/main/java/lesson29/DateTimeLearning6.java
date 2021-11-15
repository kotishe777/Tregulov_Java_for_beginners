package lesson29;

import java.time.*;

public class DateTimeLearning6 {

    public static void main(String[] args) {
        LocalDate start = LocalDate.of(2016, Month.SEPTEMBER, 1);
        LocalTime lt = LocalTime.of(10, 30);
        LocalDateTime ldt = LocalDateTime.of(2016, Month.SEPTEMBER, 1, 16, 40);

        Period p1 = Period.ofMonths(3).ofDays(10);
        System.out.println(start.plus(p1));

        Period p2 = Period.ofMonths(3);
        p2 = Period.ofDays(10);
        System.out.println(start.plus(p2));

        Duration d = Duration.ofHours(3);
        System.out.println(lt.plus(d));

        System.out.println(ldt.plus(d).plus(p1));
    }
}
