package lesson15;

public class NestedLoops {
    public static void main(String[] args) {

        int hour = 0;

        OUTER:
        do {
            int minute = 0;

            INNER:
            while (minute < 60) {

                if (minute == 20){
                break OUTER;
                }

                System.out.println(hour + ":" + minute);
                minute++;
            }
            hour++;
        } while (hour<24);
    }
}
