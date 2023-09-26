package Day24;
//Write a java program to sort elements in reverse order but print elements alternately.
import java.util.*;
public class Task_4 {
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
        System.out.println("Reverse Iterator: ");
        ListIterator litr = li.listIterator(li.size());
        while(litr.hasPrevious()){
            System.out.print(litr.previous()+" ");
        }
        System.out.println();
        System.out.println("Elements in alternate positions:");
        while(litr.hasNext()){
            System.out.print(litr.next()+" ");
            if(litr.hasNext()){
                litr.next();
            }
        }
    }
}
