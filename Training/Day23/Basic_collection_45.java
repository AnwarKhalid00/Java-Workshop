package Day23;
import java.util.*;
public class Basic_collection_45 {
    public static void main(String[] args) {
        ArrayList<String> as = new ArrayList<String>();
        as.add("Java");
        as.add("Python");
        as.add("C++");
        as.add("C");
        System.out.println("Elements: "+as);
        Collections.addAll(as,"HTML","CSS","JavaScript","DSA","DBMS","DS");
        System.out.println("Elements after addition using collection: "+as);
        System.out.println("Index value: "+as.get(7));
    }
}
