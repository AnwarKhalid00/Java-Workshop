package Day24;
import java.util.*;
public class Linked_list {
    public static void main(String[] args) {
        List<Integer> li = new LinkedList<Integer>();
        li.add(16);
        li.add(15);
        li.add(401);
        li.add(59);
        li.add(10);
        li.add(27);
        System.out.print(li+" ");
        System.out.println();
        System.out.println("For each loop: ");
        for(Integer i:li){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("Iterator: ");
        Iterator itr = li.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next()+" ");
        }
        System.out.println();
        System.out.println("Reverse Iterator: ");
        ListIterator litr = li.listIterator(li.size());
        while(litr.hasPrevious()){
            System.out.print(litr.previous()+" ");
        }



    }
}
