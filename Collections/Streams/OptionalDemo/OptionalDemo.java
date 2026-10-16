package Collections.Streams.OptionalDemo;

import java.util.Optional;

/**
 * OptionalDemo
 */
public class OptionalDemo {

    public static void main(String[] args) {
        Optional<String> name = getName();
        // System.out.println(name.get());
        // name.ifPresent(System.out::println);
        // System.out.println(name.orElse("NO Name Found")); // in case of null , will print default value
        // System.out.println(name.orElseGet(()->"Unknown")); // Supplier use lemda to maping
        // System.out.println(name.orElseThrow()); // it will throw exception in case no value present
        name.ifPresentOrElse(System.out::println, ()->System.out.println("Unknown"));

    }
    public static  Optional<String> getName(){
        // return Optional.of("Ayush");
        // return Optional.ofNullable("Ayush Vaibhav"); // in this case no exception even on null values
        return Optional.ofNullable(null); 
        // return Optional.empty();  // Exception "No Such Element found"
    } 
}