package Collections.Queue;

import java.util.*;

public class PriorityQueueDemo {
    public static void main(String[] args){

        // Min Heap is the default implementation of PriorityQueue in Java. It orders the elements in natural order (ascending order for numbers).
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        pq.offer(5);
        pq.offer(1);
        pq.offer(3);
        pq.offer(2);
        pq.offer(4);
        pq.offer(7);
        pq.offer(6);

        // System.out.println("Priority Queue: " + pq.poll());
        // System.out.println("Priority Queue: " + pq.poll());
        // System.out.println("Priority Queue: " + pq.poll());
        // System.out.println("Priority Queue: " + pq.poll());
        // System.out.println("Priority Queue: " + pq.poll());

        // Max Heap is not directly supported by Java's PriorityQueue. However, you can achieve a max heap behavior by providing a custom comparator that reverses the natural order of the elements.
        PriorityQueue<Integer> pq2 = new PriorityQueue<>((a,b)->b-a);

        pq2.offer(5);
        pq2.offer(1);
        pq2.offer(3);
        pq2.offer(2);
        pq2.offer(4);
        pq2.offer(7);

        System.out.println("Priority Queue: " + pq2.poll());
        System.out.println("Priority Queue: " + pq2.poll());
        System.out.println("Priority Queue: " + pq2.poll());
        System.out.println("Priority Queue: " + pq2.poll());
        System.out.println("Priority Queue: " + pq2.poll());

    }
}
