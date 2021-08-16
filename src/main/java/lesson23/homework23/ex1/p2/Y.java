package lesson23.homework23.ex1.p2;

import lesson23.homework23.ex2.p1.X;

public class Y extends X {
    Y(){};

    public void abc(){
        System.out.println("Y");
    }

    public static void main(String[] args) {
        Y y = new Y();
        y.abc();
    }
}
