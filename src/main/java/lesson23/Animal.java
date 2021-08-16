package lesson23;

public class Animal {
    void getName() {
        System.out.println("Animal");
    }

    String showName() {
        return "Animal 1";
    }

    static String showName2() {
        return "Animal 2";
    }

    void showInfo() {
        System.out.println("Name of animal 1: " + showName());
    }

    void showInfo2() {
        System.out.println("Name of animal 2: " + showName2());
    }
}

class Mouse extends Animal {
    void getName() {
        System.out.println("Mouse");
    }

    String showName() {
        return "Jerry 1";
    }

    static String showName2() {
        return "Jerry 2";
    }

    public static void main(String[] args) {
        Animal a = new Mouse();
    }
}

class Test {
    void abc(Animal a) {
        System.out.println("A");
    }

    void abc(Mouse M) {
        System.out.println("M");
    }

    public static void main(String[] args) {
        Test t = new Test();
        Animal an = new Mouse();
        an.showInfo();
        an.showInfo2();

        Mouse m = new Mouse();
        m.showInfo();
        m.showInfo2();
    }
}
