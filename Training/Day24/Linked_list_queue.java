package Day24;

import java.util.*;

public class Linked_list_queue {
    public static void main(String[] args) {
        Queue<String> q = new LinkedList<String>();
        q.add("Java");
        q.add("Python");
        q.add("C++");
        q.add("C");
        System.out.println("Queue: "+q);
        String str = q.peek();//peek method returns the top element of the queue.
        System.out.println("Top element: "+str);
        String str1 = q.poll();//poll method returns the top element of the queue and removes it from the queue.
        System.out.println("Removed element: "+str1);
        System.out.println("Queue after poll: "+q);
        q.add("HTML");
        q.add("CSS");   
        System.out.println("Queue after adding elements: "+q);
        q.offer("JavaScript");//offer method adds the element in the queue in the end.
        System.out.println("Queue after offer: "+q);

       
    }
    
}
