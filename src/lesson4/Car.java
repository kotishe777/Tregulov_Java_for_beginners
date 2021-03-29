package lesson4;

public class Car {
    Car(String color2, String engine2){

        System.out.println("Object is created");
        color = color2;
        engine = engine2;
        speed = 60;
    }

    String color = "red";
    String engine = "V6";
    int speed;

}

class CarTest {
    public static void main(String[] args){

        Car car1 = new Car("yellow", "V4");
        System.out.println("Color: " + car1.color);
        System.out.println("Engine: " + car1.engine);

        Car car2 = new Car("yellow", "V4");
        car2.color = "white";
        car2.engine = "V7";
        car2.speed = 100;
        System.out.println(car2.color);
        System.out.println(car2.engine);
        System.out.println(car2.speed);
    }

}