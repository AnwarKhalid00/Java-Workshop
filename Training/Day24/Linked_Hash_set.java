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
        Set<Integer> lhs = new LinkedHashSet<Integer>();//LinkedHashSet maintains the order of the elements.
        lhs.addAll(al);
        lhs.add(35);
        lhs.add(65);
        System.out.println("Elements in LinkedHashSet after adding elements: "+lhs);
        boolean b = lhs.remove(59);
        System.out.println("LinkedHashSet after removing element : "+lhs);
        lhs.removeAll(lhs);
        System.out.println("LinkedHashSet after removing all elements: "+lhs);

    }
}
