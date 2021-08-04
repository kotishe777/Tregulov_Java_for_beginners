package lesson20;

import java.util.*;

public class ArrayListLearning7 {

    public static void main(String[] args) {
        String s1 = "A";
        String s2 = "B";
        String s3 = "C";
        String s4 = "D";

        ArrayList<String> list1 = new ArrayList<>();
        list1.add(s3);
        list1.add(s1);
        list1.add(s4);
        list1.add(s2);

        System.out.println(list1);

        Collections.sort(list1);
        System.out.println(list1);

        ArrayList<String> list2 = list1;
        System.out.println(list2.equals(list1));

        Iterator<String> it = list1.iterator();
        while(it.hasNext()){
            System.out.print(it.next() + " ");
        }
        System.out.println();
        while(it.hasNext()){
            it.next();
            it.remove();
        }
    }
}



