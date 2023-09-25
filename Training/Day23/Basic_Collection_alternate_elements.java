package Day23;
import java.util.*;
public class Basic_Collection_alternate_elements {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("Batch 2");//add method is used to add elements in the end of the list.
        al.add("Khalid");
        al.add("Mayank");
        al.add("Rajeev");
        al.add("Kashif");
        System.out.println("Elements: "+al);
        Iterator it = al.iterator();
        System.out.println("Elements in alternate positions:");
        while(it.hasNext()){
            System.out.println(it.next());
            if(it.hasNext()){
                it.next();
            }
        }
    }
}
