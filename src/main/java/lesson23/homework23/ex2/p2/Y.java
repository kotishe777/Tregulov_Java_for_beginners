package lesson23.homework23.ex2.p2;

import lesson23.homework23.ex2.p1.X;

public class Y extends X {

    public void abc(){
        System.out.println("Y");
    }

    public void def() {
        Y y = new Y();
        y.abc();
    }

    public void ghi() {
        X x = new Y();
//        x.abc();
    }

    public static void main(String[] args) {
        Y y = new Y();
        y.abc();
        y.def();
        y.ghi();
    }
}
