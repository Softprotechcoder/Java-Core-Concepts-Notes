package Collections.Map;

import java.util.*;

public class MapConstructors {
    public static void main(String[] args){
        Map <Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        Map<Integer, String> map1 = new HashMap<>(100, 0.75f);
        Map<Integer, String> map2 = new HashMap<>(map);
        System.out.println(map1);
        System.out.println(map2);
    }
}
