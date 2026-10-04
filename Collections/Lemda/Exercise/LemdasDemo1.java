package Collections.Lemda.Exercise;

import java.util.*;
import java.util.function.*;

public class LemdasDemo1 {
    public static void main(String[] args){

        // Function interface example
        Function<Integer, Integer> square = x -> x * x;
        System.out.println(square.apply(5));

        // Consumer interface example
        Consumer<String> print = s -> System.out.println(s);
        print.accept("Welcome to Consumer Interface");

        // Supplier interface example
        Supplier <Double> randomValue = () -> Math.random()* 100;
        System.out.println("Random Value: " + randomValue.get());
       
        // Predicate interface example
        Predicate<Integer> isEven = x -> x % 2 == 0;
        System.out.println("is Even : " + isEven.test (112));

        // For Each method example
        List <Integer> numbers = new ArrayList<>
        (List.of(1, 2, 3, 4, 5,6,7,8,9,10));

        // numbers.forEach(x-> System.out.println(x)); // Lambda expression
        numbers.forEach(System.out::println);  // Method reference

        


        
    }
    
}
