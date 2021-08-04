package lesson22.p2;

public class Human {
    private String name = "John";

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public static int salary = 150;

    void work() {
        System.out.println("Working");
    }

    protected static void rest() {
        System.out.println("Chilling");
    }
}

class Student extends Human {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.getName());
        System.out.println(Student.salary);
        s.work();
        Student.rest();
    }
}
