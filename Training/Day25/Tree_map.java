package Day25;
import java.util.*;
public class Tree_map {
    public static void main(String[] args) {
        TreeMap<String,Integer> hm = new TreeMap<String,Integer>();
        hm.put("Rajeev", 98);
        hm.put("Shagun", 97);
        hm.put("Khalid", 89);
        hm.put("Mayank", 90);
        hm.put("Pranay", 80);
        System.out.println("Map values: "+hm);
        System.out.println("KeySet: "+hm.keySet());//returns a set of keys
        System.out.println("Values: "+hm.values());//returns a collection of values
        System.out.println("Key/Value mapping: "+hm.entrySet());//returns a set of key/value pairs
        hm.replace("Rajeev", 79);
        System.out.println("After replacing marks: "+hm);
        hm.remove("Shagun");
        System.out.println("After removing: "+hm);
        System.out.println("Getting value: "+hm.get("Preet"));//returns the value to which the specified key is mapped, or null if this 
                                                                 //map contains no mapping for the key
        System.out.println("Getting value: "+hm.getOrDefault("Preet", 48));//returns the value to which the specified key is mapped, 
                                                                                        // or defaultValue if this map contains no mapping for the key
        System.out.println("First key: "+hm.firstKey());
        System.out.println("Last key: "+hm.lastKey());
        System.out.println("First entry: "+hm.firstEntry()); 
        System.out.println("Last entry: "+hm.lastEntry());

    }
}
