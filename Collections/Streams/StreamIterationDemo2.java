package Collections.Streams;

import java.util.stream.*;

/**
 * StreamIterationDemo2
 */
public class StreamIterationDemo2 {

    public static void main(String[] args) {
        //Iterating using Iterator of Streams
        // Stream.iterate(2L, x->x*2)
        //                 .limit(10)
        //                 .forEach(System.out::println);

        // Iterating using generator of Streams
        Stream.generate(Math::random)
              .limit(10)
              .mapToDouble(x->x*100)
              .mapToInt(x->(int)x)
              .sorted()
              .forEach(System.out::println);
                

    }
}