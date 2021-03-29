package lesson8.homework8;

public class FinalStaticLearning1 {

  public static final double p = 3.14;

  public static int method1(int i1, int i2, int i3) {
    int result1 = i1 * i2 * i3;
    return result1;
  }

  public static void method2(double i1, double i2) {
    double result2 = i1 / i2;
    System.out.println(result2);
  }

  public double method3(double r){
    double areaOfACircle = p * r * r;
    return areaOfACircle;
  }

  public static double method4(double r){
    double circumference = 2 * p * r;
    return circumference;
  }

  public void method5(double r){
    System.out.println(r);
    System.out.println(method3(r));
    System.out.println(method4(r));
  }

}

  class FinalStaticLearning1Test{

    public static void main(String[] args) {

      System.out.println(FinalStaticLearning1.method1(10, 10, 10));
      System.out.println(FinalStaticLearning1.method1(20, 20, 20));
      FinalStaticLearning1.method2(31, 2);
      FinalStaticLearning1.method2(55, 2);

      FinalStaticLearning1 FSL1 = new FinalStaticLearning1();

      System.out.println(FSL1.method3(10));
      System.out.println(FinalStaticLearning1.method4(20));
      FSL1.method5(30);
    }

  }



