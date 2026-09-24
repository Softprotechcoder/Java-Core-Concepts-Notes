package Collections.Queue;

import java.util.*;

/**
 * QueueDemo
 */
public class QueueDemo {

    public static void main(String[] args){
        Queue<Integer> queue = new ArrayDeque<>();

        // Single ended queue 
        // enqueue
        queue.add(1); // add() method throws exception if queue is full
        queue.offer(2); // offer() method returns false if queue is full
        queue.offer(3);

        // Front access

        System.out.println("Front element: " + queue.peek()); // peek() method returns null if queue is empty
        System.out.println("Front element: " + queue.element()); // element() method throws exception if queue is empty

        // Remove elements
        queue.remove(); // remove() unsafe method throws exception if queue is empty
        queue.poll(); // poll() safe method returns null if queue is empty
        
    }
}