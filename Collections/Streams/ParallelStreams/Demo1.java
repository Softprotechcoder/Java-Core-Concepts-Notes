package Collections.Streams.ParallelStreams;

import java.util.ArrayList;
import java.util.List;

public class Demo1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9,10,11));
        // this is called secquential stream
        /*
        / Map is stateless operation
            // it doesn't require any support from other values ex .sorted --> statefull
        */
       System.out.println("Sequencial Stream");
        list.stream()
            .map(x->x*2) 
            .forEach(System.out::println);

        /*
        Parallel Streams
        After executing we can observe Order is random 
        Why ? Because internally it uses threads and let's take an assumption of 5 thread used
        so whatever will complete first it will get executed also called Race condition.
        In case of ordered Reasult we can use .forEachOrdered instead of .forEach 
        */    
       System.out.println("Parallel Streams");
       list.parallelStream()
            .map(x->x*2)
            .forEachOrdered(System.out::println);
    }
    
}
