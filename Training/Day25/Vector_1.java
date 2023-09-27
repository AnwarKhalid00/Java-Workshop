package Day25;
import java.util.*;
public class Vector_1 {
    public static void main(String[] args) {
        int  n = 5;
        Vector<Integer> v1 = new Vector<Integer>(n);
        v1.add(10);
        v1.add(20);
        v1.add(30);
        v1.add(40);
        v1.add(50);
        v1.add(60);
        System.out.println("Vector values: "+v1);
        List<Integer> v2 = new ArrayList<Integer>();
        v2 = v1.subList(2, 4); 
        System.out.println("Sublist: "+v2);
        /* Vector<Integer> v2 = new Vector<Integer>();
        v2.addAll(v1);
        System.out.println("copying all value of v1 to v2: "+v2); */ 

    }
}
