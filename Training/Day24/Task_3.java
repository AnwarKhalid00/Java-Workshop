package Day24;
//Write a java code to implement odd elements by using linked list.
import java.util.*;
public class Task_3 {
    public static void main(String[] args) {
        LinkedList<Integer> li = new LinkedList<Integer>();
        li.add(16);
        li.add(15);
        li.add(401);
        li.add(59);
        li.add(10);
        li.add(27);
        System.out.println("Elements: "+li);
        System.out.println();
        System.out.println("For each loop: ");
        for(Integer i:li){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.print("Elements at odd positions: ");
        for(int i=0;i<li.size();i++){
            if(i%2!=0){
                System.out.print(li.get(i)+" ");
            }
        }
    }
}
