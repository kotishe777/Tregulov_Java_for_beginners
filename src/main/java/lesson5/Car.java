package lesson5;

public class Car {

  String color;
  String engine;
  int speed1;

  int gas (int speed2){
    speed1 += speed2;
    return speed1;
  }

  int brake (int speed2){
    speed1 -= speed2;
    return speed1;
  }

  void showInfo(){
    System.out.println("color: " + color + " engine: " + engine + " speed1: " + speed1);
  }

  static class TestCar{

    public static void main(String[] args) {

      Car car = new Car();
      car.color = "white";
      car.engine = "V6";
      car.speed1 = 60;

      car.showInfo();
      car.gas(20);
      car.showInfo();
      car.brake(80);
      car.showInfo();
    }

  }

}
