package lesson23;

public class OverridingLearning2 {

    public static void main(String[] args) {
        Employee2 e = new Employee2();
        Teacher2 t = new Teacher2();
        e.eat();
        t.eat();
        e.eat2();
        t.eat2();

        Employee2 e2 = new Teacher2();
        e2.eat();
    }
}

class Food {}
class Fruit extends Food {}

class Employee2 {
    String name;
    int age;
    int experience;
    double salary = 100;

    void eat() {
        System.out.println("Employee is eating");
    }

    Food eat2(){
        System.out.println("Employee is eating food");
        Food food = new Food();
        return food;
    }

    void sleep() {
        System.out.println("Sleeping");
    }
}


class Teacher2 extends Employee2 {
    int numberOfPupils;

    void eat() {
        System.out.println("Teacher is eating");
    }

    public Fruit eat2(){
        System.out.println("Teacher is eating fruit");
        Fruit fruit = new Fruit();
        return fruit;
    }

    void teach() {
        System.out.println("Teaching");
    }
}
