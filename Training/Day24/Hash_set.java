package Day24;
import java.util.*;
public class Hash_set {
    public static void main(String[] args) {
        Set<Integer> hs = new HashSet<Integer>();
        hs.add(16);
        hs.add(15);
        hs.add(401);
        hs.add(59);
        hs.add(10);
        hs.add(27);
        System.out.println("Elements in set 1: "+hs);
        Set<Integer> hs1 = new HashSet<Integer>();
        hs1.add(35);
        hs1.add(65);
        hs1.add(79);
        hs1.add(21);
        System.out.println("Elements in set 2: "+hs1);
        hs.addAll(hs1);//addAll method adds all the elements of the set passed as argument to the set.
        System.out.println("Final set after adding set 1 and set 2 togather: "+hs);
    }
}
