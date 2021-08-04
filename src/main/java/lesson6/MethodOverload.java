package lesson6;

public class MethodOverload {

  void showInt (int i){
    System.out.println(i);
  }

  void showBoolean (boolean b1){
    System.out.println(b1);
  }

  void showString (String s1){
    System.out.println(s1);
  }
}

class MethodOverloadTest{
  public static void main(String[] args) {
    MethodOverload mo = new MethodOverload();
    int a = 500;
    mo.showInt(a);

    boolean t = true;
    mo.showBoolean(t);

    String s2 = "MyString";
    mo.showString(s2);


  }
}
