package lesson27;

public class StaticLearning {
    public static void main(String[] args) {
        Animal an = new Tiger();
        System.out.println(an.a);
        System.out.println(an.i);
        an.abc();
        an.def();
    }

}

class Animal{
    int a = 5;
    static int i = 10;

    void abc(){
        System.out.println("Non-static method from Animal class");
    }

    static void def(){
        System.out.println("Static method from Animal class");
    }
}

class Tiger extends Animal{
    int a = 15;
    static int i = 20;

    void abc(){
        System.out.println("Non-static method from Tiger class");
    }

    static void def(){
        System.out.println("Static method from Tiger class");
    }
}


