package Day23; 
import java.util.*;
public class Basic_Collection_4 {
    public static void main(String[] args) {
        ArrayList li = new ArrayList();
        li.add(10);
        li.add("Niet");
        li.add("Pyramid");
        li.add(275);
        li.add(456);
        System.out.println("Without Generic: ");
        for(Object s:li){
            System.out.println(s+" ");
        }
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(10);
        al.add(227);
        al.add(38);
        al.add(409);
        al.add(5000);
        System.out.println("With Generic: ");
        for(Integer s:al){
            System.out.println(s+" ");
        }


    }
    
}
