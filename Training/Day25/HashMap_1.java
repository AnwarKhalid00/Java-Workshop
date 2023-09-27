package Day25;
import java.util.*;
public class HashMap_1 {
    public static void main(String[] args) {
        Map<String,Integer> hm = new HashMap<String,Integer>();
        hm.put("Rajeev", 98);
        hm.put("Shagun", 97);
        hm.put("Khalid", 89);
        hm.put("Mayank", 90);
        hm.put("Pranay", 80);
        System.out.println("Map values: "+hm);
        System.out.println("KeySet: "+hm.keySet());//returns a set of keys
        System.out.println("Values: "+hm.values());//returns a collection of values
        System.out.println("Implementingby using iterator");
        for(String i:hm.keySet()){
            System.out.println("Key: "+i+" Value: "+hm.get(i));
        }
    }
}
