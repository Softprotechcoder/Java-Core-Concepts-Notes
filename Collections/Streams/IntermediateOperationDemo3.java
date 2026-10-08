package Collections.Streams;

import java.util.*;
import java.util.stream.Stream;

public class IntermediateOperationDemo3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(8,0,7,3,1,2,43,12,65,69,65,69,11,10,11));
        //Intermediate Functions
        // filter , map  , forEach
        /* 
        list.stream()
            .filter(x -> x >= 10)
            // .filter(x -> x % 2 == 0)
            .map(x -> x*2)
            .forEach(System.out::println);

        */
       //Flatmap
        List<List<Integer>> list2 = List.of(
        List.of(1,2),
        List.of(3,4));
        // just by using map    
        System.out.println("Using Map");
        list2.stream()
            .map(x -> x.stream().map(y->y*2).toList())
            // .forEach(System.out::println); 
            .forEach(x->x.forEach(y-> System.out.println(y)));
        
        // To avoid the complexity we have Flatmap -> it flatans the 2D List into 1D
        System.out.println("Using Flat Map");
            list2.stream()
                .flatMap(x->x.stream()).map(y->y*2)
                .forEach(System.out::println);

        // Use of Sorted
        /*
        Sorted is a StateFull function: 
        for sorted we can also sort in descending order by passing comparator
        .sorted((a,b)->b-a)
        */
        System.out.println("***Sorting by use of Sorted***");
        list.stream()
            .filter(x -> x > 10) // stateless function 
            .map(x->x*2)
            .sorted((a,b)->b-a) // at this stage all element will stop and it will perform sorting : Statefull
            .forEach(x-> System.out.print("\t"+ x));
        

        /*
        Use of Distinct : Keep uniquie Value 
        Internally uses -> Hassing to keep track of elements
        Statefull
        */    
        System.out.println("\n***Use of Distinct***");
            list.stream()
            .filter(x -> x > 10) // stateless function 
            .map(x->x*2)
            .sorted((a,b)->b-a) // at this stage all element will stop and it will perform sorting : Statefull
            .distinct()
            .forEach(x-> System.out.print("\t"+ x));

        /*
        Limit and Skip
        peek : used for depugging here, it will show how the elements were before skip
        */    
       System.out.println("\n\n\t***Use of Limit and Skip****\n");
         Stream.iterate(1, x->x+1)
                .limit(25)
                .peek(x -> System.out.print(x+", "))
                .skip(9) // it will skip first 9 elements
                .forEach(x -> System.out.print(x+", "));   
        
    }
    
}
