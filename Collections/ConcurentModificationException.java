package Collections;

import java.util.*;

public class ConcurentModificationException {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        
        Iterator<Integer> it = list.iterator();
        while(it.hasNext()){
            int value = it.next();
            if(value == 2){
                list.remove(2); // this will throw ConcurrentModificationException
                /* it.remove(); 
                Here we are using list.remove(2) which is method of list not iterator.
                */
            }
            System.out.println(value);
        }
    }
}
/* 
ConcurrentModificationException will receive it cannot iterate as list is modified while iterating 
Fail Fast 
*/
