package lesson12;

public class Car {
    int engine;
    int doorCount;

    public Car(int engine, int doorCount) {
        this.engine = engine;
        this.doorCount = doorCount;
    }
}

class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car(3, 4);
        Car car2 = new Car(2, 5);

        if (car1.engine > car2.engine) {
            if (car1.doorCount > car2.doorCount) {
                System.out.println("First car has better engine and more doors");
            } else {
                System.out.println("First car has better engine but less doors");
            }
        } else {
            System.out.println("First car has worse engine and less doors");
        }
    }


}
