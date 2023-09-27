package Day25;
import java.util.*;
public class Tree_Set {
    public static void main(String[] args) {
        Set<Integer> ts = new TreeSet<Integer>();
        ts.add(16);
        ts.add(15);
        ts.add(401);
        ts.add(59);
        ts.add(10);
        System.out.println("Elements in TreeSet: "+ts);//TreeSet maintains the ascending order of the elements.
        System.out.println("Accessing Elemnets in TreeSet: ");
        Iterator<Integer> itr = ts.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next()+" ");
        }
    }
}
