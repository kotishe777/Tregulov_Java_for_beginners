package lesson25.homework25;

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

        System.out.println("");

        SpeakAble a1 = new Penguin("a1");
        SpeakAble a2 = new Lion("a2");

        Animal a3 = new Swordfish("a3");
        Animal a4 = new Penguin("a4");
        Animal a5 = new Lion("a5");

        Fish a6 = new Swordfish("a6");
        Bird a7 = new Penguin("a7");
        Mammal a8 = new Lion("a8");

        Swordfish a9 = new Swordfish("a9");
        Penguin a10 = new Penguin("a10");
        Lion a11 = new Lion("a11");

        SpeakAble [] array1 = {a1, a2, a7, a8, a10, a11};
        Animal [] array2 = {a3, a4, a5, a6, a7, a8, a9, a10, a11};

        for (SpeakAble s : array1){
            s.speak();
        }

        for (Animal a : array2){
            System.out.println(a.name);
            a.eat();
            a.sleep();
        }
    }
}


