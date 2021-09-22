package lesson24.homework24;

interface SpeakAble {
    default void speak(){
        System.out.println("Somebody speaks");
    }
}

abstract class Animal {
    String name;

    Animal(String name){
        this.name = name;
    }

    abstract void eat();

    abstract void sleep();

}

abstract class Fish extends Animal{
    Fish(String name){
        super(name);
        this.name = name;
    }
    void sleep(){
        System.out.println("It's always interesting to observe how fishes sleep");
    }
    abstract void swim();
}

abstract class Bird extends Animal implements SpeakAble{
    Bird(String name){
        super(name);
        this.name = name;
    }
    abstract void fly();

    public void speak(){
        System.out.println(this + "sings");
    }
}

abstract class Mammal extends Animal implements SpeakAble {
    Mammal(String name){
        super(name);
        this.name = name;
    }
    abstract void run();
}

class Swordfish extends Fish{
    Swordfish(String name){
        super(name);
        this.name = name;
    }
    public void swim(){
        System.out.println("Swordfish is a beautiful fish which swims quickly");
    }
    public void eat(){
        System.out.println("Swordfish is not a predatory fish and it eats usual fish feed");
    }
}

class Penguin extends Bird{
    Penguin(String name){
        super(name);
        this.name = name;
    }
    public void eat(){
        System.out.println("Penguins like to eat fish");
    }
    public void sleep(){
        System.out.println("Penguins sleep hugging each other");
    }
    public void fly(){
        System.out.println("Penguins can't fly");
    }
    public void speak(){
        System.out.println("Penguins can't sing like a nightingale");
    }
}

class Lion extends Mammal {
    Lion(String name) {
        super(name);
        this.name = name;
    }
    public void eat(){
        System.out.println("Lion like any predator likes meat");
    }
    public void sleep(){
        System.out.println("Most of the day lion sleeps");
    }
    public void run(){
        System.out.println("Lion is not the fastest cat");
    }
}

class Lesson24{
    public static void main(String[] args) {
        Swordfish swordfish = new Swordfish("Nemo");
        swordfish.eat();
        swordfish.sleep();
        swordfish.swim();

        SpeakAble penguin = new Penguin("Kovalski");
        penguin.speak();

        Animal lion1 = new Lion("Simba");
        System.out.println(lion1.name);
        lion1.eat();
        lion1.sleep();

        Mammal lion2 = new Lion("Mufasa");
        System.out.println(lion2.name);
        lion2.eat();
        lion2.sleep();
        lion2.run();
        lion2.speak();
    }
}


