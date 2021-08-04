package lesson14;

public class NestedLoop {
    public static void time(){
        OUTER: for (int hour = 0; hour <= 23; hour++){
            System.out.println("Start of outer loop");
            INNER: for (int minute = 0; minute <=59; minute++){
                System.out.println(hour+":"+minute);
                if(minute == 30){
                    break OUTER;
                }
            }
            System.out.println("Finish of outer loop");
        }
    }

    public static void main(String[] args) {
        time();
    }
}
