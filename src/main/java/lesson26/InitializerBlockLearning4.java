package lesson26;

public class InitializerBlockLearning4 {

    public static void main(String[] args) {
        Lion l = new Lion();
    }

}

class Animal{
    Animal(){
        System.out.println("Constructor of Animal");
    }

    static{
        System.out.println("Static init in Animal");
    }

    {
        System.out.println("Non-static init in Animal");
    }
}

class Mammal extends Animal{
    Mammal(){
        System.out.println("Constructor of Mammal");
    }

    static{
        System.out.println("Static init in Mammal");
    }

    {
        System.out.println("Non-static init in Mammal");
    }
}

class Lion extends Mammal{
    Lion(){
        System.out.println("Constructor of Lion");
    }

    static{
        System.out.println("Static init in Lion");
    }

    {
        System.out.println("Non-static init in Lion");
    }
}