package lesson29;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateTimeLearning4 {

    public static void main(String[] args) {

        LocalDate ld1 = LocalDate.of(2014, 5, 15);
        LocalDate ld2 = LocalDate.of(2012, 7, 17);
        System.out.println(ld1.isAfter(ld2));
        System.out.println(ld1.isBefore(ld2));
        System.out.println("___________________________________________________");

        LocalTime lt1 = LocalTime.of(15, 30);
        LocalTime lt2 = LocalTime.of(03, 5, 18, 976978);
        System.out.println(lt1.isAfter(lt2));
        System.out.println(lt1.isBefore(lt2));
        System.out.println("___________________________________________________");

        LocalDateTime ldt1 = LocalDateTime.of(2014, 5, 15, 10, 30);
        LocalDateTime ldt2 = LocalDateTime.of(2014, 5, 15, 10, 30, 9);
        System.out.println(ldt1.isAfter(ldt2));
        System.out.println(ldt1.isBefore(ldt2));
    }
}
