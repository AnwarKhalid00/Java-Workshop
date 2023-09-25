package Day23;
import java.util.*;
public class Object_to_Array {
    public static void main(String[] args) {
        List<Integer> ai = new ArrayList<Integer>();
        ai.add(16);//add method is used to add elements in the end of the list.
        ai.add(38);
        ai.add(15);
        ai.add(401);    
        ai.add(59);
        System.out.println(ai);
        int n = ai.size();
        Object[] arr = new Object[n];
        ai.toArray(arr);
        for(int i = 0;i<n ;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
