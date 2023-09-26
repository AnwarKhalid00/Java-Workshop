package Day24;
import java.util.*;
public class Linked_list_dequeue {
    public static void main(String[] args) {
        Deque<String> dq = new LinkedList<String>();
        dq.add("Java");
        dq.add("Python");
        dq.add("C++");
        dq.add("C");
        System.out.println("Deque: "+dq);
        dq.addFirst("HTML");
        dq.addLast("CSS");
        System.out.println("Deque after adding elements: "+dq);
        dq.removeFirst();
        System.out.println("Deque after removing first element: "+dq);
        dq.removeLast();
        System.out.println("Deque after removing last element: "+dq);
    }    
        
}