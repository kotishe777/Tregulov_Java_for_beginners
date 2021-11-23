package lesson30;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class LambdaLearning7 {

    public static void main(String[] args) {
        List <String> list = List.of("hi", "bye", "what's up?", "ok");

        list.forEach(s -> System.out.println(s));

        ArrayList<Integer> al = new ArrayList<>();
        al.add(7);
        al.add(1);
        al.add(6);
        al.add(2);
        al.add(5);
        al.add(3);
        al.add(4);

        al.removeIf(element -> element%3 == 0);
        System.out.println(al);

        Predicate<Integer> p = element -> element%2 == 0;
        al.removeIf(p);
        System.out.println(al);

        al.sort((x, y) -> x.compareTo(y));
        System.out.println(al);

        al.sort((x, y) -> -x.compareTo(y));
        System.out.println(al);
    }
}



