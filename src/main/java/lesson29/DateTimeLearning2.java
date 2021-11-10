package lesson29;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateTimeLearning2 {

    public static void main(String[] args) {
        Car c = Car.createCar();
    }
}

class Car {

    private Car(){}

    static Car createCar(){
        return new Car();
    }
}
