package lesson20;

import java.util.ArrayList;

public class ArrayListLearning5 {
    public static void main(String[] args) {

        ArrayList <String> list = new ArrayList<>();
        list.add(new String("bye"));
        list.add(new String("hi"));
        list.add(new String("ok"));
        list.add(new String("bye"));
        list.add(1, new String("hello"));
        for (String s : list){
            System.out.print(s + " ");
        }
        System.out.println();
        System.out.println(list.indexOf(new String("bye")));
        System.out.println(list.lastIndexOf(new String("bye")));
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.contains("ok"));
        System.out.println(list.toString());

    }
}



