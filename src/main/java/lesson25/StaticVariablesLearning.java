package lesson25;

public class StaticVariablesLearning {
}

class Car{
    static int a = 5;
    int b = 10;

    public static void main(String[] args) {
        Car c = new Car();
        System.out.println(c.a);
        System.out.println(c.b);

        c = null;
        System.out.println(c.a);
//        System.out.println(c.b);
    }
}
