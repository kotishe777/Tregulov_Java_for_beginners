package lesson20;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethods3 {
    public static void main(String[] args) {
        ArrayList al1 = new ArrayList();
        al1.add("one");
        al1.add("two");
        al1.add("three");
        al1.add("four");
        al1.add("five");
        al1.add(new ArrayListMethods3());
    }
}
