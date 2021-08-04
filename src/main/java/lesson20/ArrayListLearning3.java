package lesson20;

import java.util.ArrayList;
import java.util.List;

public class ArrayListLearning3 {
    public static void main(String[] args) {
        ArrayList <StringBuilder> list = new ArrayList<>();
        StringBuilder sb1 = new StringBuilder("hello");
        StringBuilder sb2 = new StringBuilder("ok");
        StringBuilder sb3 = new StringBuilder("hi");
        StringBuilder sb4 = new StringBuilder("bye");
        list.add(sb1);
        list.add(sb2);
        list.add(sb3);
        list.add(sb4);
        for (int i = 0; i < list.size(); i++){
            list.get(i).append("!!!");
        }
        for (StringBuilder sb : list){
            System.out.print(sb + " ");
        }
        System.out.println();
        list.remove(2);
        for (StringBuilder sb : list){
            System.out.print(sb + " ");
        }

    }
}


