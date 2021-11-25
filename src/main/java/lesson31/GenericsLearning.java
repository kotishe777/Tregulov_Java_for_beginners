package lesson31;

import java.util.ArrayList;

public class GenericsLearning {

    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();

        Info<String> info1 = new Info<>("Hi");
        System.out.println(info1);

        Info<Integer> info2 = new Info<>(100);
        System.out.println(info2);

        String s = info1.getValue();
        Integer i = info2.getValue();
    }
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