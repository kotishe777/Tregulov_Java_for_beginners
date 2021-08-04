package lesson13;

public class Employee {
    public static void main(String[] args) {
        switch ("Monday") {
            case "Monday" :
            case "Tuesday" :
            case "Wednesday" :
            case "Thursday" :
            case "Friday" : System.out.println("Work to 18:00");
            break;
            case "Saturday" :
            case "Sunday" : System.out.println("Weekend");
            break;
            default: System.out.println("Invalid day");
        }
    }
}
