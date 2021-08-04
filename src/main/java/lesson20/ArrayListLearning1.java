package lesson20;

import java.util.ArrayList;
import java.util.List;

public class ArrayListLearning1 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("hello");
        Car c = new Car();
        list.add(c);
        Student s = new Student();
        list.add(s);
        list.add(new StringBuilder("ok"));

        ArrayList <String> list2 = new ArrayList<>();
        list2.add("bye");

        List<StringBuilder> list3 = new ArrayList<>(30);
        List<StringBuilder> list4 = new ArrayList<>(list3);
    }
}

class Car{}
class Student{}

