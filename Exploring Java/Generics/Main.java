public class Main {
    public static void main(String[] args) {
       Box box = new Box(10);
        //  System.out.println(box.getValue());
        //  Box box2 = new Box();
        //  box2.setValue("Integer");
        /*
            So here we have a problem because we are trying to set a String value to a 
            Box object that is designed to hold an Integer value. This will result in a
            compile-time error, as the Box class is not designed to handle different data types. 
            To fix this issue, we can use generics to create a Box class that can hold any type of value. 
            Here's an example of how we can modify the Box class to use generics:  
        */

            Box_2<Integer> b2 = new Box_2<Integer>(25);
            System.out.println(b2.getValue()+25);
            Box_2<String> b3 = new Box_2<>("Sanjana");
            System.out.println(b3.getValue()+" Loves "+"Ayush");
            
    }
}