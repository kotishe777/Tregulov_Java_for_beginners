package lesson20;

import java.util.ArrayList;
import java.util.List;

public class ArrayListLearning2 {
    public static void main(String[] args) {

        ArrayList <String> list1 = new ArrayList<>();
        list1.add("bye");
        list1.add("hi");
        list1.add("ok");
        list1.add(1, "hello");
        for (String s : list1){
            System.out.print(s + " ");
        }
        System.out.println();
        System.out.println(list1.get(3));

        list1.set(1, "!!!");
        for (String s : list1){
            System.out.print(s + " ");
        }
        System.out.println();
        list1.remove(new String("ok"));
        for (String s : list1) {
            System.out.print(s + " ");
        }
        System.out.println();
        ArrayList <String> list2 = new ArrayList<>();
        list2.add("Petya petushok");
        list2.add("Kucheryava golovka");
        list1.addAll(list2);
        System.out.println();
        for (String s : list1) {
            System.out.print(s + " ");
        }
        System.out.println();
        list1.addAll(0, list2);
        for (String s : list1) {
            System.out.print(s + " ");
        }
        System.out.println();
        list2.set(1, "Ivanov");
        for (String s : list1) {
            System.out.print(s + " ");
        }
        System.out.println();
        list1.clear();
        for (String s : list1) {
            System.out.print(s + " ");
        }
    }
}



