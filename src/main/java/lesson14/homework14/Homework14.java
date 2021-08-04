package lesson14.homework14;

public class Homework14 {
    public static void time() {
        HOUR:
        for (int hour = 0; hour <= 6; hour++) {
            MINUTE:
            for (int minute = 0; minute <= 59; minute++) {
                if (hour > 1 && (minute % 10) == 0) {
                    break HOUR;
                }
                SECOND:
                for (int second = 0; second <= 59; second++) {
                    System.out.println(hour + ":" + minute + ":" + second);
                    if (second * hour > minute) {
                        continue MINUTE;
                    }

                }

            }
        }
    }
    public static void main(String[] args) {
        time();
    }
}
