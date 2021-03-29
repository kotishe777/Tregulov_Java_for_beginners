package lesson11.homework11;

public class Car {

  public String color;
  public String engine;
  public int doorsNumber;

  Car(String color, String engine, int doorsNumber){
    this.color = color;
    this.engine = engine;
    this.doorsNumber = doorsNumber;
  }

  Car(){}

}

class CarTest{

  public static void changeDoorsNumber(Car car, int doorsNumber){
    car.doorsNumber = doorsNumber;
    System.out.println(car.doorsNumber);
  }

  public static void replaceCarsColor(Car car1, Car car2){
    Car car3 = new Car();
    car3.color = car1.color;
    car1.color = car2.color;
    car2.color = car3.color;
    System.out.println(car1.color + ", " + car2.color);
  }

  public static void main(String[] args) {

    Car c1 = new Car("white", "V6", 4);
    Car c2 = new Car("black", "V7", 6);
    Car c3 = new Car("red", "V8", 8);

    changeDoorsNumber(c1,10);
    replaceCarsColor(c1, c2);

    System.out.println(c1.color + ", " + c1.engine + ", " + c1.doorsNumber);
    System.out.println(c2.color + ", " + c2.engine + ", " + c2.doorsNumber);
    System.out.println(c3.color + ", " + c3.engine + ", " + c3.doorsNumber);

  }

}
