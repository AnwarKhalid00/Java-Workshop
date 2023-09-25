package Day22;                 
import java.util.*;
public class Generic {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        Integer s = list.get(0);
        System.out.println(s);
        System.out.println(list);
    }
}
