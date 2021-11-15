package lesson29;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateTimeFormatterLearning1 {

    public static void main(String[] args) {
        LocalDate ld = LocalDate.of(2016, Month.SEPTEMBER, 1);
        LocalTime lt = LocalTime.of(10, 30);
        LocalDateTime ldt = LocalDateTime.of(2016, Month.SEPTEMBER, 1, 16, 40);

        DateTimeFormatter dtf1 = DateTimeFormatter.ISO_LOCAL_DATE;
        System.out.println(ld);
        System.out.println(ld.format(dtf1));
        System.out.println("____________________________________________________________________________________");

        DateTimeFormatter dtf2 = DateTimeFormatter.ISO_LOCAL_TIME;
        System.out.println(lt);
        System.out.println(lt.format(dtf2));
        System.out.println("____________________________________________________________________________________");

        DateTimeFormatter dtf3 = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        System.out.println(ldt);
        System.out.println(ldt.format(dtf1));
        System.out.println(ldt.format(dtf2));
        System.out.println(ldt.format(dtf3));
        System.out.println("____________________________________________________________________________________");

        DateTimeFormatter dtf4 = DateTimeFormatter.ISO_WEEK_DATE;
        System.out.println(ldt);
        System.out.println(ldt.format(dtf4));
        System.out.println("____________________________________________________________________________________");

        DateTimeFormatter dtf5 = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        System.out.println(ldt);
        System.out.println(ldt.format(dtf5));
        System.out.println("____________________________________________________________________________________");

        DateTimeFormatter dtf6 = DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM);
        System.out.println(ldt);
        System.out.println(ldt.format(dtf6));
        System.out.println("____________________________________________________________________________________");

        DateTimeFormatter dtf7 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        System.out.println(ldt);
        System.out.println(ldt.format(dtf7));
        System.out.println("____________________________________________________________________________________");

        DateTimeFormatter dtf8 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        System.out.println(ldt);
        System.out.println(dtf8.format(ldt));
        System.out.println("____________________________________________________________________________________");

        DateTimeFormatter dtf9 = DateTimeFormatter.ofPattern("MMMM dd, yyyy, hh:mm");
        System.out.println(ldt);
        System.out.println(ldt.format(dtf9));
        System.out.println("____________________________________________________________________________________");

        DateTimeFormatter dtf10 = DateTimeFormatter.ofPattern("MM dd yyyy");
        LocalDate ld2 = LocalDate.parse("01 02 2015", dtf10);
        System.out.println(ld2);
        LocalDate ld3 = LocalDate.parse("2015-01-02");
        System.out.println(ld3);

    }
}
