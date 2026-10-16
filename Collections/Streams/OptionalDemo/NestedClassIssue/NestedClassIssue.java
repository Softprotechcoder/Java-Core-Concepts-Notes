package Collections.Streams.OptionalDemo.NestedClassIssue;

import java.util.Optional;

public class NestedClassIssue {
    public static void main(String[] args) {
        /* Traditional Approach */
        // User u = getUser();
        //     if(u != null ){
        //         Address a = u.address;
        //         if (a != null){
        //             String city = a.city;
        //             System.out.println(city);
        //         }
        //     }
/* Mordern Approach using Optional */
        Optional <User> u = getUser();
        u.map(x->x.address)
            .map(y->y.city)
            .ifPresent(System.out::println);

    }
    private static Optional< User> getUser(){
        Address a = new Address();
        a.city = "Bangalore";
        User u = new User();
        u.address = a;

        return Optional.of(u);

    }
}


class User {

 public Address address;   
}

class Address{
    public String city;
}
