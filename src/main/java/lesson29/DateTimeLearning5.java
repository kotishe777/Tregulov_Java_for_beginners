package lesson29;

import java.time.*;

public class DateTimeLearning5 {

    static void changeOfDuty(LocalDate start, LocalDate finish, Period period) {

        LocalDate date = start;

        while (date.isBefore(finish)){
            System.out.println("The " + date + " has come. The duty must be changed");
            date = date.plus(period);
        }
    }

    public static void main(String[] args) {
        LocalDate start = LocalDate.of(2016, Month.SEPTEMBER, 1);
        LocalDate finish = LocalDate.of(2017, Month.MAY, 31);
        Period period1 = Period.ofWeeks(2); /* days, months, weeks, years */
        Period period2 = Period.of(1, 2, 3);
        changeOfDuty(start, finish, period1);
    }
}
