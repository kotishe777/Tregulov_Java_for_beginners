package lesson13;

public class Test1 {

}

class Student{
    int grade;

    Student(int grade){
        this.grade = grade;
    }

    public static void main(String[] args) {
        Student st1 = new Student(3);

        if (st1.grade == 2) {
            System.out.println("Student is bad");
        } else if (st1.grade == 3) {
            System.out.println("Student is below the average");
        } else if (st1.grade == 4) {
            System.out.println("Student is average");
        } else if (st1.grade == 5) {
            System.out.println("Student is good");
        } else {
            System.out.println("Invalid grade");
        }

        switch (st1.grade){
            case 2 : System.out.println("Student is bad");
            break;
            case 3 : System.out.println("Student is below the average");
            break;
            case 4 : System.out.println("Student is average");
            break;
            case 5 : System.out.println("Student is good");
            break;
            default: System.out.println("Invalid grade");
        }

    }
}
