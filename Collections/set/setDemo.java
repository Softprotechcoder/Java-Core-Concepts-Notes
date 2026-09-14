package Collections.set;

import java.util.*;

public class setDemo {
    public static void main(String[] args){
        Set<String> set = new HashSet<>();
        set.add("Ayush");
        set.add("Sanjana");
        set.add("Aryan");
        set.add("Rohit");
        System.out.println("Attempting to add Duplicate Value");
        System.out.println(set.add("Ayush")); // returns false because "Ayush" is already in the set.
        

        // System.out.println("Set elements: " + set);
        System.out.println(set.contains("Ayush"));
        System.out.println(set.contains("Zara"));
        
        // Iterator<String> iterator = set.iterator();
        // while (iterator.hasNext()) {
        //     String element = iterator.next();
        //     System.out.println("HashCode : "+element.hashCode()+ " : "+element);
        // }
        
        Map<Integer, String> map = new HashMap<>();
        map.put(25, "Ayush");
        map.put(30, "Sanjana");
        map.put(35, "Aryan");
        System.out.println("Map Contains value : "+map.containsKey(25));
        System.out .println("Map Get Value : "+map.get(30));

        System.out.println("Adding Duplicate Key");
        // map.put(25, "Ayush"); // This will replace the existing value associated with key 25 ("Ayush") with the new value

        System.out.println(map.put(25,"Ayush")); // This will print "Rohit" instead of "Ayush"

    }
}
