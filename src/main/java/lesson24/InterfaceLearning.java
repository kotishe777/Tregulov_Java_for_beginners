package lesson24;

public class InterfaceLearning {
    public static void main(String[] args) {
        HelpAble h = new Driver();
        SwimAble s = new Driver();
        Employee e = new Driver();

        System.out.println(h.a);
//        System.out.println(h.salary);
//        System.out.println(h.carName);
        h.help();
        h.extinguishTheFire("water");
//        h.eat();
//        h.drive();
        s.swim();
    }
}

interface HelpAble {
    int a = 10; // public final static by default

    void help(); // public abstract by default

    void extinguishTheFire(String subject);
}

interface SwimAble {

    void swim();
}

class Employee {
    String name;
    int age;
    int experience;
    double salary = 100;

    void eat() {
        System.out.println("Eating");
    }

    void sleep() {
        System.out.println("Sleeping");
    }
}

class Driver extends Employee implements HelpAble, SwimAble{
    String carName;

    void drive() {
        System.out.println("Driving");
    }

    public void help() {
        System.out.println("Driver helps");
    }

    public void extinguishTheFire(String s) {
        System.out.println("Driver extinguishes the fire with " + s);
    }

    public void swim() {
        System.out.println("Driver swims");
    }
}


class Teacher extends Employee implements HelpAble {
    int numberOfPupils;

    void teach() {
        System.out.println("Teaching");
    }

    public void help() {
        System.out.println("Teacher helps");
    }

    public void extinguishTheFire(String s) {
        System.out.println("Teacher extinguishes the fire with " + s);
    }
}




