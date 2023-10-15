package Day23;
import java.util.*;
public class Basic_Collection_removing_elements {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("Batch 2");
        al.add("Khalid");
        al.add("Mayank");
        al.add("Rajeev");
        al.add("Kashif");
        System.out.println("Elements: "+al);
        Iterator i = al.iterator();
        String str = "";
        while(i.hasNext()){
            str = (String)i.next();
            if(str.equals("Batch 2")){
                i.remove();  
                System.out.println("After removing");
                break;
            }
            
        }
        System.out.println("Elements: "+al);
        
    }
}
