package Day25;
import java.util.*;
public class Navigable_Tree_set {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<Integer>();
        ts.add(16);
        ts.add(15);
        ts.add(401);
        ts.add(59);
        ts.add(10);
        ts.add(78);
        ts.add(99);
        System.out.println("Elements in TreeSet: "+ts);//TreeSet maintains the ascending order of the elements.
        System.out.println("Accessing first element: "+ts.first());
        System.out.println("Accessing last element: "+ts.last());
        System.out.println("Accessing element higher than 59: "+ts.higher(59));
        System.out.println("Accessing element lower than 59: "+ts.lower(59));
        System.out.println("Ceiling : "+ts.ceiling(58));//returns the least element greater than or equal to the given element
        System.out.println("Floor : "+ts.floor(60));//returns the greatest element less than or equal to the given element
    }
}
