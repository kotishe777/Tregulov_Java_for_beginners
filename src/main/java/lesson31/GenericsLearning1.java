package lesson31;

import java.util.ArrayList;

public class GenericsLearning1 {

    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();

        Info<String> info1 = new Info<>("Hi");
        System.out.println(info1);

        Info<Integer> info2 = new Info<>(100);
        System.out.println(info2);

        String s = info1.getValue();
        Integer i = info2.getValue();
    }

    public void method1(Info<String> info){
        String s = info.getValue();
    }

//    public void method1(Info<Integer> info){
//        Integer i = info.getValue();
//    }
}


class Info<T>{
    private T value;

    public Info(T value){
        this.value = value;
    }

    public String toString(){
        return "[(" + value + ")]";
    }

    public T getValue(){
        return value;
    }
}

class Parent{

    public void method1(Info<String> info){
        String s = info.getValue();
    }
}

class Child extends Parent{

//    public void method1(Info<Integer> info){
//        Integer i = info.getValue();
//    }
}