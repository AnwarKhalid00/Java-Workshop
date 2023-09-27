package Day25;
import java.util.*;
public class Queue_priority {
    public static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque<Integer>();
        Collections.addAll(q, 9, 27, 56, 98, 12);
        System.out.println(q.offer(1));
        System.out.println(q);
        System.out.println(q.poll());
        System.out.println(q);
        System.out.println(q.peek());
        System.out.println(q.remove(98));
        System.out.println(q);


    }   
}
