package Collections;

import java.util.*;

public class IteratorFunction {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        Iterator <Integer> it = list.iterator();

        while(it.hasNext()){
            System.out.println(it.next()+" ");
        }
        
    }
}


