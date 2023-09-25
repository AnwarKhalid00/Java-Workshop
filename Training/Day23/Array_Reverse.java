package Day23;
import java.util.*;
public class Array_Reverse {
    public static void main(String[] args) {
        List<Integer> al = new ArrayList<Integer>();
        al.add(16);//add method is used to add elements in the end of the list.
        al.add(22);
        al.add(38); 
        al.add(40);
        al.add(78);
        System.out.println("Elements: "+al);
        ListIterator<Integer> itr = al.listIterator(al.size());
        System.out.println("Reverse Elements: ");
        while(itr.hasPrevious()){
            System.out.println(itr.previous());
        }
        
    }
    
}
