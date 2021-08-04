package lesson22;


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

class Driver {
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
