package lesson6;

public class Homework6 {

  static int sum(){
    int sum1 = 0;
    return sum1;
  }

  static int sum(int i1){
    int sum2 = i1;
    return sum2;
  }

  static int sum(int i1, int i2){
    int sum3 = i1 + i2;
    return sum3;
  }

  static int sum(int i1, int i2, int i3){
    int sum4 = i1 + i2 + i3;
    return sum4;
  }

  static int sum(int i1, int i2, int i3, int i4){
    int sum5 = i1 + i2 + i3 + i4;
    return sum5;
  }

  public static void main(String[] args) {
    System.out.println(sum());
    System.out.println(sum(1,1));
    System.out.println(sum(1,1,1));
    System.out.println(sum(1,1,1,1));
  }

}
