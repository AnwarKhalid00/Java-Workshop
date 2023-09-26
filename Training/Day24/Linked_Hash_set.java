package Day24;
import java.util.*;
public class Linked_Hash_set {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(16);
        al.add(15);
        al.add(401);
        al.add(59);
        al.add(10);
        al.add(27);
        System.out.println("Elements in array list: "+al);
        Set<Integer> lhs = new LinkedHashSet<Integer>(al);//LinkedHashSet maintains the order of the elements.
        System.out.println("Elements in LinkedHashSet: "+lhs);

    }
}
