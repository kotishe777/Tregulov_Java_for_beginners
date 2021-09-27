package lesson25;

public class PolymorphismLearning5 {
    public static void main(String[] args) {
        String[] array1 = {"hi", "bye"};
        Object[] array2 = array1;
        String[] array3 = (String[])array2;
//        array3[0] = new StringBuilder("ok");
        array2[0] = new StringBuilder("ok");
    }
}

class Test1{
    int a = 5;
    void abc(){
        System.out.println("ok1");
    }
}

class Test2 extends Test1{
    int a = 10;
    void abc(){
        System.out.println("ok2");
    }
}

class Test3 extends Test2{
    int a = 15;
    void abc(){
//        super.super.abc();
        super.abc();
        System.out.println("ok3");
    }

    public static void main(String[] args) {
        Test3 t = new Test3();
        System.out.println(((Test1)t).a);
        ((Test1)t).abc();
    }
}