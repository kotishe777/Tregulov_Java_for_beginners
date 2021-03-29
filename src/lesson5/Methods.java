package lesson5;

public class Methods {

  int sum(int a, int b, int c) {
    int result1 = a + b + c;
    return result1;
  }

  int average(int d, int e, int f) {
    int result2 = sum(d, e, f) / 3;
    return result2;
  }


 static class MethodsTest{

   public static void main(String[] args) {

     Methods methods = new Methods();

     int sumOfThreeNumbers = methods.sum(1, 2, 3);
     System.out.println(sumOfThreeNumbers);

     System.out.println(methods.average(20,30,40));

   }

 }
}
