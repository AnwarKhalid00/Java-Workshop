package Day25;
import java.util.*;
public class Priority_queue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        pq.offer(4);
        pq.add(6);
        pq.offer(5);
        pq.add(1);
        System.out.println("Priority Queue implementation: " + pq);
        PriorityQueue<Integer> pq2 = new PriorityQueue<Integer>(Collections.reverseOrder());  
        pq2.offer(4);
        pq2.add(6);
        pq2.offer(5);
        pq2.add(1);
        System.out.println("Priority Queue implementation: " + pq2);

    }
}