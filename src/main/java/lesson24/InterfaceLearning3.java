package lesson24;

public class InterfaceLearning3 {
}

interface I1 {
    void abc();

    default void def() {
        System.out.println("There is default def method");
    }

    default void ghi() {
        System.out.println("There is default ghi method");
    }

    static void jkl() {
        System.out.println("There is static jkl method");
    }
}

interface I2 extends I1 {
    void def();

    static void jkl() {
        System.out.println("There is static jkl method");
    }
}

interface I3 {
    static void jkl() {
        System.out.println("There is static jkl method");
    }
}

abstract class AC1 implements I1 {
    abstract public void def();
}

abstract class AC2 {
}

class CL1 implements I3 {
}

class CL2 extends AC2 implements I3 {
    static I3 vwx(I3 i) {
        return new CL1();
    }

    public static void main(String[] args) {
        I3 i = new CL1();
            vwx(i);
    }

}

class CL3 extends AC1 implements I1 {
    public void abc() {
        System.out.println("There is abc method");
    }

    public void def(){
        System.out.println("There is def method");
    }

    public void ghi() {
        System.out.println("There is overridden default ghi method");
    }

    CL3 mno() {
        return new CL3();
    }

    AC1 pqr() {
        return new CL3();
    }

    I1 stu() {
        return new CL3();
    }

    public static void main(String[] args) {
        CL3 z = new CL3();
        z.abc();
        z.def();
        z.ghi();
//        Z.jkl();
        I1.jkl(); // not make sense implements class Z interface I1 or not
        I2.jkl();
    }
}
