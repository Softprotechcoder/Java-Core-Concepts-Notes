package Collections.set;

import java.util.*;

public class setConstructer {
    public static void main(String[] args) {
        // Constructer of HashSet and LinkedHashSet

        // HashSet
        System.out.println("HashSet Constructer");
        Set<Integer> hashSet = new HashSet<>();  // Default Constructer
        hashSet.add(1);
        hashSet.add(2);
        System.out.println(hashSet);

        Set<String> hashSet2 = new HashSet<>(100);  // Initial Capacity Constructer
        hashSet2.add("A");
        hashSet2.add("B");
        System.out.println(hashSet2);

        Set<Double> hashSet3 = new HashSet<>(100, 0.8f);
        hashSet3.add(1.1);
        hashSet3.add(2.2);
        System.out.println(hashSet3);

        Set<String> nameSet = new HashSet<>(List.of("Ayush", "Snajana"));
        System.out.println(nameSet);

    }
}
