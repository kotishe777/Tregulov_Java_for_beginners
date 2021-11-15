package lesson29;

import java.time.*;

public class DateTimeLearning7 {

    public static void main(String[] args) {
        LocalTime lt = LocalTime.of(10, 30, 50, 777);
        LocalDate ld = LocalDate.of(2016, Month.SEPTEMBER, 1);
        LocalDateTime ldt = LocalDateTime.of(2016, Month.SEPTEMBER, 1, 16, 40);

        System.out.println(ld.getDayOfWeek());
        System.out.println(ldt.getDayOfMonth());
        System.out.println(ld.getDayOfYear());
        System.out.println(ldt.getMonth());
        System.out.println(ld.getMonthValue());
        System.out.println(ldt.getYear());

        System.out.println("_______________________________________________________________");

        System.out.println(lt.getNano());
        System.out.println(lt.getSecond());
        System.out.println(ldt.getMinute());
        System.out.println(ldt.getHour());
    }
}
