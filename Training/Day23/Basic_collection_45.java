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
        System.out.println("Index value: "+as.get(7));//get method is used to get the elements from the list.
        as.set(4,"Algo");//set method is used to update the elements in the list.
        System.out.println("Updated Elements: "+as);
        as.remove("C");
        System.out.println("Elements after removal: "+as); //remove method is used to remove the elements from the list. 
        as.remove(3);
        System.out.println("Elements after removal: "+as);
    }
}
