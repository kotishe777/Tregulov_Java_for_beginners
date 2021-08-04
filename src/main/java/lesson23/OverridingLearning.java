package lesson23;

public class OverridingLearning {
    public static void main(String[] args) {
        Doctor d = new Doctor();
        Teacher t = new Teacher();
        Driver dr = new Driver();
        Employee e = new Employee();
        Surgeon s = new Surgeon();

        Employee e2 = new Doctor();
        System.out.println(e2.salary);
        System.out.println(e2.name);
        System.out.println(e2.age);
        System.out.println(e2.experience);
        e2.eat();
        e2.sleep();
//        e2.cure();

        Employee e3 = new Teacher();
        Employee e4 = new Driver();

        Employee s2 = new Surgeon();
        s2.sleep();
//        s2.operation();

        Doctor s3 = new Surgeon();
        System.out.println(s3.age);
        s3.eat();
        s3.cure();
//        System.out.println(s3.scalpel);

    }
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

class Doctor extends Employee {
    String specialization;

    void cure() {
        System.out.println("Treatment");
    }
}

class Surgeon extends Doctor {
    String scalpel;

    void operation() {
    }
}

class Dentist extends Doctor {
}

class Teacher extends Employee {
    int numberOfPupils;

    void teach() {
        System.out.println("Teaching");
    }
}

class Driver extends Employee {
    String carName;

    void drive() {
        System.out.println("Driving");
    }
}

class TestEmployees {
    public static void main(String[] args) {
        Doctor doctor = new Doctor();
        doctor.name = "Ivan";
        doctor.age = 50;
        doctor.experience = 25;
        doctor.specialization = "surgeon";
        doctor.eat();
        doctor.sleep();
        doctor.cure();
    }

    void increaseSalary(Employee e) {
        e.salary = e.salary + 100;
    }
}

