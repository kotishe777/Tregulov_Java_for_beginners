package lesson20;

import java.util.ArrayList;

public class ArrayListLearning4 {
    public static void main(String[] args) {

        ArrayList <StringBuilder> list = new ArrayList<>();
        list.add(new StringBuilder("bye"));
        list.add(new StringBuilder("hi"));
        list.add(new StringBuilder("ok"));
        list.add(1, new StringBuilder("hello"));
        for (StringBuilder sb : list){
            System.out.print(sb + " ");
        }
        System.out.println();
        System.out.println(list.indexOf(new StringBuilder("bye")));

    }
}



