package lesson30;

import java.util.ArrayList;

public class VarLearning1 {
//    var v = 10;

    public static void main(String[] args) {
        var tit = new TestInferenceType();
        var i = 10;
        var f = 1.5f;
        var array = new String[]{"a", "b"};
        var result = abc();
        Object obj1 = "hi";
        var obj2 = obj1;
        ArrayList<String> a1 = new ArrayList<>();
        for (var s : a1){
            System.out.println(s);
        }
//        var h;
//        var n = null;
//        var array2 = {1, 2, 3};
//        var array3 = new int[]{1, 2};
    }
    static double abc(){
        return 3.14;
    }
//    static var abc(){
//        return 3.14;
//    }
}

class TestInferenceType{ }

interface I{ // functional interface

    void method1();

    default void method2(){ }

    default void method3(){ }

    static void method4(){ }
}
