package Day23;
import java.util.*;
public class Basic_Collection_with_integer {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(56);
        al.add(89);
        al.add(12);
        al.add(34);
        System.out.println("Elements: "+al);
        Iterator it = al.iterator();
        System.out.println("Iterating Elements: ");
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
