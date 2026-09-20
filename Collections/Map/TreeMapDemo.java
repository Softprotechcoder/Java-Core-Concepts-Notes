package Collections.Map;

import java.util.*;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        
        treeMap.put(103, "Three");
        treeMap.put(101, "One");
        treeMap.put(102, "Two");
        System.out.println(treeMap);

        System.out.println("First entry: " + treeMap.firstEntry());
        System.out.println("Last entry: " + treeMap.lastEntry());

        System.out.println("Ceiling entry (100): " + treeMap.ceilingEntry(100));
        System.out.println("Floor entry (104): " + treeMap.floorEntry(104));

        System.out.println("Higher entry (102): " + treeMap.higherEntry(102));
        System.out.println("Lower entry (102): " + treeMap.lowerEntry(102));

        System.out.println("SubMap (101 to 103): " + treeMap.subMap(101, true, 103, true));
        System.out.println("SubMap (101 to 103): " + treeMap.subMap(101, false, 103, false));

        System.out.println("HeadMap (102): " + treeMap.headMap(102, true));
        System.out.println("TailMap (102): " + treeMap.tailMap(102, true));
        System.out.println("Descending Map: " + treeMap.descendingMap());
        System.out.println("Descending Key Set: " + treeMap.descendingKeySet());
        System.out.println("Navigable Key Set: " + treeMap.navigableKeySet());

        System.out.println("Poll First Entry: " + treeMap.pollFirstEntry());
        System.out.println("Poll Last Entry: " + treeMap.pollLastEntry());
        System.out.println("TreeMap after polling: " + treeMap);

        System.out.println("Size of TreeMap: " + treeMap.size());
        System.out.println("Is TreeMap empty? " + treeMap.isEmpty());
        System.out.println("Contains key 101? " + treeMap.containsKey(101));
        
        System.out.println(treeMap.lowerKey(102));
        System.out.println(treeMap.higherKey(102));

        System.out.println("Navigable Map: " + treeMap);
        System.out.println("Navigable Map descending: " + treeMap.descendingMap());
        System.out.println("Navigable Map headMap (102): " + treeMap.headMap(102, true));
        System.out.println("Navigable Map tailMap (102): " + treeMap.tailMap(102, true));
        System.out.println("Navigable Map subMap (101 to 103): " + treeMap.subMap(101, true, 103, true));

    }
}
