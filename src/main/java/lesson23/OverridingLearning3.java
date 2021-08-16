package lesson23;

public class OverridingLearning3 {
    public static void main(String[] args) {
        Employee3 emp = new Teacher3();
        Teacher3 t = new Teacher3();
        t.sleep();
        t.walk();
        System.out.println(t.salary);
    }
}

class Employee3 {
    String name;
    int age;
    int experience;
    double salary = 100;

    void eat() {
        System.out.println("Eating");
    }

    private void sleep() {
        System.out.println("Employee is sleeping");
    }

    static void walk() {
        System.out.println("Employee is walking");
    }

    final void talk() {
        System.out.println("Employee is talking");
    }
}

class Teacher3 extends Employee3 {
    int numberOfPupils;
    double salary = 200; // variables can't be overridden, variable is hidden

    void teach() {
        System.out.println("Teaching");
    }

    public void sleep() { // private methods can't be overridden, new method is created
        System.out.println("Teacher is sleeping");
    }

    static void walk() { // static methods can't be overridden, this method is hidden
        System.out.println("Teacher is walking");
    }

//    final void talk() { // final methods can't be overridden
//        System.out.println("Employee is talking");
//    }
}
