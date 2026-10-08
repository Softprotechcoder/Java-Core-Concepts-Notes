package Collections.Streams;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class TerminialOperationDemo4 {
    public static void main(String[] args) {
        /*
        Terminal Operations
        */
       List<Integer> list = new ArrayList<>(List.of(9,7,0,1,6,90,65,69,17,16,7,16,25));
       list.stream()
            .map(c->c+1)
            // specially used in parallel streams. in generall forEach prefered
            .forEachOrdered(System.out::println); 

        // Collecting in List using toList()
        System.out.println("******toList usecase********");
        List<Integer> result = list.stream()
                          .map(x -> x+1)
                          .toList(); // this retrun's immutable list so we cann't add any entity further.
            System.out.println(result);

    /*
    Collect : Collector is an Interface
    Collectors : Utility class multiple method returns collector
    Multiple ways to store
    can store in multiple data structrue
    */

        System.out.println("****Use case for Collector and Collectors*****");
        List<Integer> collist = new ArrayList<>(List.of(9,7,0,1,6,90,65,69,17,16,7,16,25));
                       Set<Integer> res = collist.stream()
                            .map(x->x-1)
                            // .collect(Collectors.toList()); // this returns mutuable list 
                            .collect(Collectors.toSet());  // similarly we can use Set
                            res.add(19);
                            System.out.println(res);

        /* 
        Reduce : method -> Combine stream element into single value
        */
       System.out.println("********Use Reduce method********");

            //   Optional<Integer> sum = collist.stream()
            //     .reduce((a,b)->a+b);
            
                // System.out.println(sum.get()); 


    /*We can directly achieve int value here by using 0 in argument as Identity 
    it represent base value will be 0 and hence it will avoid null point exception */
                 int sum = collist.stream()
                .reduce(0,(a,b)->a+b); // 0 as Identity
                System.out.println(sum); 

      /*count Method */
      System.out.println("*******Count Operation*******");
      long count = collist.stream()
            .filter(x->x>10)
            .count();
        System.out.println(count);

        /*Find First 
            it does short circuiting : find first break
        */
        System.out.println("***Find First**");
      Optional<Integer>first =  collist.stream()
            .filter(x->x>10)
            .findFirst(); // similarly .findAny works used in parallel stream
            System.out.println("First Element : "+first.get());

        System.out.println("***Any Match****");
        boolean isMatch = collist.stream()                                
                                .anyMatch(x->x%2==0); // takes predicate and return bool 
        // Similarly we have .allMatch : if all elements matches with conditon , returns true
        // Similarly we have .nonMatch : says non of the element should match provided condition.
                                System.out.println(isMatch);    

        /* 
        We have few more method like 
        sum()
        Avg()
        min()
        max()
        which all works with premitive
        */              System.out.println("Working on Premitive");  
       int sumPre = collist.stream()
                    .filter(x->x>10)
                    .mapToInt(x->x)
                    .sum();
                    System.out.println("Sum of Premitive : "+ sumPre);
         // Similarly we can do for rest 
         System.out.println("***Max*****");           

         OptionalInt max = collist.stream()
                    .filter(x->x>10)
                    .mapToInt(x->x)
                    .max();
                    System.out.println("Max of Premitive : "+ max.getAsInt());
        

                            
    }
                          
    
}
