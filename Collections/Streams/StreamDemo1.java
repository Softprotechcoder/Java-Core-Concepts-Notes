package Collections.Streams;

import java.util.*;
import java.util.stream.*;

public class StreamDemo1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(5,23,45,67,1,7,8,46,36,74,9));
     
        /*   
         Stream <Integer> s = list.stream()
            .forEach(System.out::println);

         */  
            list.stream()
                .forEach(x->System.out.println(x));
                // or
                // .forEach(System.out::println);   // Both ways are fine 
    }
    
}
