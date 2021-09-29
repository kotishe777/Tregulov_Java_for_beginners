package lesson26;

import java.util.ArrayList;

public class EqualsLearning {
    public static void main(String[] args) {
        Car c1 = new Car("red", "V4");
        Car c2 = new Car("red", "V4");
        Car c3 = new Car("white", "V8");
        Car c4 = new Car("white", "V8");
        Car c5 = null;

        ArrayList <Car> list = new ArrayList<>();
        list.add(c1);
        list.add(c2);
        list.add(c3);

        System.out.println(c1.equals(c2));
        System.out.println(list.contains(c4));
        System.out.println(c5.equals(c1));
    }

}

class Car {
    String color;
    String engine;

    Car(String color, String engine) {
        this.color = color;
        this.engine = engine;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Car) {
            Car c2 = (Car) obj;
            return (color.equals(c2.color) && engine.equals(c2.engine));
        } else {
            return false;
        }
    }

    public String toString(){
        return "Car's color is " + color + " and car's engine is " + engine;
    }
}
