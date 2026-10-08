package Collections.Streams;

import java.util.*;
import java.util.stream.*;

public class collectorDemo5 {
    public static void main(String[] args) {

        /*
        collect in the List similarly we can collect into set
        */
    List<Integer> numbers = new ArrayList<>(List.of(9,7,0,1,6,90,65,69,17,16,7,16,25));
                    List<Integer> res = numbers.stream()
                                                .collect(Collectors.toList());
                    System.out.println(res);

        /*
            Collect into Map
        */
       System.out.println("***********Converting and Collecting into Map************");
        List<String> name = new ArrayList<>(List.of("Ayush","Sanjan","Ashutosh","Divya","Subhashh","Aryan","Rohit"));
                Map<String,Integer> nameLength = name.stream()
                                                .collect(Collectors.toMap(x->x ,y->y.length()));
                System.out.println(nameLength);

       /*
       GroopingBy
       Here, if we are using groupingBy value pare is optional. it determines automatically
       
       Map<Integer, String>
                ↑       ↑
                │       │
                │       └── downstream collector
                │
                └── classifier

         Internal machanism when value pair is absent

         Map<Integer, List<String>> map = new HashMap<>();
            for (String name : names) {
            Integer key = name.length();
            map.computeIfAbsent(
                key,
                k -> new ArrayList<>()
            ).add(name);
        }  

       */ 
        Map<Integer,List<String>> gpBy = name.stream()
                                         .collect(Collectors.groupingBy(x->x.length(),Collectors.toList()));  
            System.out.println(gpBy);     


        /*
        PartitioningBy : It creates only 2 Group one for True and another for False
            it returns predicate and  toList 
            similarly as in Grouping By no need to provide value argurment
        */    
       System.out.println("*********Partitioning By use case *************");
       Map<Boolean,List<Integer>> pbMap = numbers.stream()
                                                .collect(Collectors.partitioningBy(x->x%2==0));
            System.out.println(pbMap);


            /*
            Use of mapping Function within GroupingBy
            */
           System.out.println("********usnign Maping function within GroupingBy**************");

             Map<Integer,List<String>> gpByMaping = name.stream()
                                         .collect(Collectors.groupingBy(x->x.length(),
                                         Collectors.mapping(String::toUpperCase, Collectors.toList())));  
            System.out.println(gpByMaping);  

            /*
            Joining
            */
           String joinedNames = name.stream()
                                    .collect(Collectors.joining("-"));
                System.out.println(joinedNames);
    }
    
}
