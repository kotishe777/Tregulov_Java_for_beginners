package lesson8;

public class Test1 {

  public final int a = 10;
  public final int b;
  public static final int c = 20;

  Test1(){
    b = 20;
  }

  Test1(boolean c){
    b = 20;
  }

  public void abc(final short d){
    final byte e;
    e = 10;
    System.out.println(d+e);
  }

  public static void main(String[] args) {
    Test1 t = new Test1();
    //t.a = t.a * 2;
    System.out.println(t.a);
    System.out.println(c);
  }
}
