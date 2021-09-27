package lesson25;

public class PolymorphismLearning3 {
    public static void main(String[] args) {
        HelpAble2 h = new Doctor2();
        Employee2 emp1 = new Doctor2();
        Employee2 emp2 = new Teacher2();
        Employee2 emp3 = new Driver2();
        Employee2 emp4 = new Employee2();
        Doctor2 d1 = (Doctor2) emp1;
        PolymorphismLearning3 p = new PolymorphismLearning3();
        Employee2[] array = {emp1, emp2, emp3, emp4};

        System.out.println(((Doctor2) h).specialization);
        System.out.println(((Doctor2) emp1).specialization);

        h.help();
        ((Doctor2) h).cure();
        ((Doctor2) emp1).cure();

        System.out.println(emp4 == emp1);
        System.out.println(emp4.equals(p));

        for (Employee2 e : array){
            if(e instanceof Driver2) {
                System.out.println(((Driver2) e).carName);
                ((Driver2) e).drive();
            }
        }
    }
}

    interface HelpAble2{
        void help();
    }

class Employee2 {
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

class Doctor2 extends Employee2 implements HelpAble2{
    String specialization = "Surgeon";

    void cure() {
        System.out.println("Treatment");
    }

    public void help(){
        System.out.println("Doctor helps");
    }
}

class Teacher2 extends Employee2 {
    int numberOfPupils;

    void teach() {
        System.out.println("Teaching");
    }
}

class Driver2 extends Employee2 {
    String carName = "Sonata";

    void drive() {
        System.out.println("Driving");
    }
}