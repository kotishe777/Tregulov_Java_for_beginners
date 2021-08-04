package lesson20;

import java.util.ArrayList;
import java.util.Collections;

public class Homework20 {

    public ArrayList <String> abc (String... s){
        ArrayList <String> myArrayList = new ArrayList<>();
        for (String s1 : s) {
            if (!myArrayList.contains(s1)) {
                myArrayList.add(s1);
            }
        }
        Collections.sort(myArrayList);
        System.out.println(myArrayList);
        return myArrayList;
    }

    public static void main(String[] args) {
        Homework20 hw20 = new Homework20();
        hw20.abc("F", "H", "K", "M", "L", "K");
    }

}
