package lesson12;

public class Test {

  void max (int i1,int i2,int i3) {
    if (i1 > i2 && i1 > i3) {
      int a = 5;
      System.out.println("max = " + i1);
    } else if (i2 > i1 && i2 > i3) {
      int a = 10;
      System.out.println("max = " + i2);
    } else {
      int a = 15;
      System.out.println("max = " + i3);
    }
  }

  void max2 (){
    int a = 10;
    int b = 20;
    int max = (a > b) ? a : b;
    System.out.println(max);
  }

  void abc(){
    String str;
    int a = 10;
    if (a >= 10) {
      str = "Hi!";
    }
    if (a > 10){
      str = "Bye!";
    } else {
      str = null;
    }
    System.out.println(str);
  }

  public static void main(String[] args) {

    int a = 10;
    int salary = 300;

    if (a < 20){
      System.out.println("a < 20");
      System.out.println("Some other text");
      a++;
      System.out.println(a);
    }

    if (a < 5)
      System.out.println("a < 5");
      System.out.println("Some other text2");
      a--;
      System.out.println(a);

    if (a < 30){
      System.out.println("a < 20");
    }  else {
      System.out.println("a > 20");
    }

    if (false){
      System.out.println("a < 20");
    }  else {
      System.out.println("a > 20");
    }

    if (salary >= 500){
      System.out.println(":)");
    } else {
      System.out.println(":(");
    }

    if (salary < 200){
      System.out.println("Salary is low");
    } else if (salary < 400){
      System.out.println("Salary is average");
    } else if (salary < 600){
      System.out.println("Salary is high");
    } else {
      System.out.println("Salary is excellent");
    }

    Test t = new Test();
    t.max(4,7,0);
  }
}
