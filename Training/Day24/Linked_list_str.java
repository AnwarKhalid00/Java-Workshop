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
        Collections.addAll(li, "Jetha Lal", "Daya Ben", "Babita Ji", "Iyer", "Popatlal", "Bhide", "Madhavi", "Roshan Singh Sodhi"
        , "Rita Reporter", "Abdul", "Dr. Hathi", "Nattu Kaka", "Bagha", "Sundar", "Pinku", "Goli", "Sonu", "Tapu", "Bapuji", "Sonu",  "Bapuji");
        System.out.println("After adding more elements: "+li);
        System.out.println("First occurence of Sonu: "+li.indexOf("Sonu"));
        System.out.println("Last occurence of Sonu: "+li.lastIndexOf("Sonu"));
    }
}
