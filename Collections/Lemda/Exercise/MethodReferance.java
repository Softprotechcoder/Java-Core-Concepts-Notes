package Collections.Lemda.Exercise;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.*;


public class MethodReferance {
    public static void main(String[] args) {
        // Function<Double,Double> printAbs = x-> Math.abs(x); // abs return +ve value absolute value
        Function<Double,Double> printAbs = (Math::abs); // using Referance Operator
        System.out.println(printAbs.apply(-9878.89));


        // Consumer<String> str = (System.out::println);
        // str.accept("Snajana");

        Predicate <String> str2 = (String::isEmpty);
        System.out.println(str2.test(""));

        Supplier<ArrayList<String>> s = ()-> new ArrayList<>(List.of("Ayush","Snajana","Kriti"));
        s.get().forEach(System.out::println);
    }
    
}
