package lesson20;

import java.util.HashMap;
import java.util.Map;

public class CollectionsLearning {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(777, "Mikhail");
        map.put(778, "Vladimir");
        map.put(779, "Sofia");
        map.put(780, "Maria");
        map.put(777, "Roberto");
        map.put(781, "Mikhail");
        System.out.println(map);

        map.remove(777);
        System.out.println(map);
    }
}
