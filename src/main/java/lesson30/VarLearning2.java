package lesson30;

import java.util.ArrayList;
import java.util.function.Supplier;

public class VarLearning2 {

    public static void main(String[] args) {
    }
}

class Car{
    String model;
    String color;
    double engine;

    public Car(String model, String color, double engine) {
        this.model = model;
        this.color = color;
        this.engine = engine;
    }

    public String toString(){
        return "Our car is " + model + ", color is " + color + " and engine = " + engine + ".";
    }
}

class Test1 {

    public static ArrayList<Car> createThreeCars(Supplier<Car> carSupplier){
        ArrayList<Car> al = new ArrayList<>();
        for (int i = 0; i < 3; i++){
            al.add(carSupplier.get());
        }
        return al;
    }

    public static void main(String[] args) {
        ArrayList<Car> ourCars = createThreeCars(() -> new Car ("Nissan Tilda", "silver metallic", 1.6));
    }
}
