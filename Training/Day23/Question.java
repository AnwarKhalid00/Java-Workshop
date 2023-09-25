//WAP to read floating values using ArrayList and display it for using for each loop??
package Day23;
import java.util.*;
public class Question {
    public static void main(String[] args) {
        ArrayList<Float> al = new ArrayList<Float>();
        al.add(10.0f);//add method is used to add elements in the end of the list.
        al.add(227.0f);
        al.add(38.0f);
        al.add(409.0f);
        al.add(5000.0f);
        System.out.println("With Generic: ");
        for(Float s:al){
            System.out.println(s+" ");
        }
        
    }
}
