package lesson29;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class DateTimeLearning3 {

    public static void main(String[] args) {
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());
        LocalDate ld1 = LocalDate.of(2014, 5, 15);
        System.out.println(ld1);
        LocalDate ld2 = ld1.plusDays(5);
        System.out.println(ld2);
        LocalDate ld3 = ld1.minusDays(5);
        System.out.println(ld3);
        LocalDate ld4 = ld1.plusWeeks(2);
        System.out.println(ld4);
        LocalDate ld5 = ld1.minusWeeks(2);
        System.out.println(ld5);
        LocalDate ld6 = ld1.plusMonths(3);
        System.out.println(ld6);
        LocalDate ld7 = ld1.minusMonths(3);
        System.out.println(ld7);
        LocalDate ld8 = ld1.plusYears(2);
        System.out.println(ld8);
        LocalDate ld9 = ld1.minusYears(2);
        System.out.println(ld9);
        System.out.println("___________________________________________________");

        LocalTime lt1 = LocalTime.of(15, 30);
        System.out.println(lt1);

        lt1 = lt1.plusHours(2).minusMinutes(23).plusSeconds(60).minusNanos(600);
        System.out.println(lt1);
        System.out.println("___________________________________________________");

        LocalDateTime ldt1 = LocalDateTime.of(2014, 5, 15, 10, 30);
        System.out.println(ldt1);

        ldt1 = ldt1.plusYears(3).minusMonths(2).plusMinutes(3).minusSeconds(30);
        System.out.println(ldt1);
    }
}
