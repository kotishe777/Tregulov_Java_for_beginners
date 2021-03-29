package lesson9;

public class Car {

  int Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa;
  int _b;
  int $c;
  int d4;

  String color;
  String engine;
  static int count;
  int a = 10;

  public Car(String color, String engine){
    this.count++;
    this.color = color;
    this.engine = engine;
  }

  public void showColor(){
    System.out.println("Car color is " + color);
    changeColor("red");
  }

  public void changeColor(String color3){
    System.out.println("Car color is changed to " + color);
    int price = 5000;
    color = color3;
    price += 1000;
  }

  public static void changeA(int b){
    Car c = new Car("black", "V8");
    c.a = b;
  }

  void abc(int a, int b){
    boolean c = true;
  }

  void abcd(int a, int b){
    boolean c = true;
  }

  void changeColor2(String color){
    System.out.println(color);
  }

  public static void main(String[] args) {

    Car c = new Car("red", "V6");
    System.out.println(c.color);
    c.changeColor2("black");
    System.out.println(c.color);
  }

}
