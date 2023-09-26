package Day24;
import java.util.*;
public class Linked_list_str {
    public static void main(String[] args) {
        List<String> li = new LinkedList<String>();
        li.add("Nirav Modi");
        li.add("Mehul Choksi");
        li.add("Lalit Modi");
        li.add("Vijay Mallya");
        li.add("Jatin Mehta");
        li.add("Harshad Mehta");
        System.out.print(li+" ");
        System.out.println("Particular element: "+li.get(2));
        li.set(2, "Rajeev Gandhi");
        System.out.println("Updated list: "+li);
        li.remove(3);
        li.remove("Jatin Mehta");
        System.out.println("After Removal: "+li);
    }
}
