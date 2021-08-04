package lesson22.homework22;

public class Animal {
    Animal() {
        System.out.println("I am an animal");
    }

    int eyes;

    public void eat() {
        System.out.println("Animal eats");
    }

    public void drink() {
        System.out.println("Animal drinks");
    }
}

class Pet extends Animal {
    Pet(){
        System.out.println("I am a pet");
        eyes = 2;
    }
    String name;
    int tail = 1;
    int paw = 4;

    public void run() {
        System.out.println("Pet runs");
    }

    public void jumps() {
        System.out.println("Pet jumps");
    }
}

class Dog extends Pet{
    Dog(String name){
        this.name = name;
        System.out.println("I am dog and my name is: " + name);
    }

    public void play() {
        System.out.println("Dog plays");
    }
}

class Cat extends Pet{
    Cat(String name){
        this.name = name;
        System.out.println("I am cat and my name is: " + name);
    }

    public void sleep() {
        System.out.println("Cat sleeps");
    }
}

class Test{
    public static void main(String[] args) {
        Dog dog = new Dog("Bandit");
        System.out.println(dog.paw);
        Cat cat = new Cat("Stepan");
        cat.sleep();
    }
}
