package Day25;
import java.util.*;
public class Linked_Hash_Map {
    public static void main(String[] args) {
        Map<String,Integer> hm = new LinkedHashMap<String,Integer>();
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
            System.out.println(i + " : "+hm.get(i));
        }
        hm.replace("Rajeev", 79);
        System.out.println("After replacing marks: "+hm);
        hm.remove("Shagun");
        System.out.println("After removing: "+hm);
    }
}
