package Day23;
import java.util.*;
public class Sort_Array_Collection {
    public static void main(String[] args) {
        ArrayList<Integer> ai = new ArrayList<Integer>();
        ai.add(16);//add method is used to add elements in the end of the list.
        ai.add(38);
        ai.add(15);
        ai.add(401);
        ai.add(59);
        ai.add(10);
        ai.add(27);

        System.out.println("Without sorting: "+ai);

        Collections.sort(ai);//sort method is used to sort the elements in the list.
        System.out.println("After sorting: "+ai);

        Collections.sort(ai,Collections.reverseOrder());//reverseOrder method is used to sort the elements in the reverse order.
        System.out.println("Reverse order: "+ai);

        System.out.println("Cloning: "+ai.clone());//clone method is used to clone the elements in the list.

        System.out.println("Exist or not: "+ai.contains(10));//contains method is used to check whether the element is present or not.

        System.out.println("Exist or not: "+ai.contains(401));

        System.out.println("Particular Index: "+ai.indexOf(59));//indexOf method is used to find the index of the element.

        ai.clear();//clear method is used to clear the elements in the list.
        System.out.println("After clearing: "+ai);

        for(int i=0;i<5;i++){
            ai.add(i);
        }
        if(ai.isEmpty()){//isEmpty method is used to check whether the list is empty or not.
            System.out.println("List is empty"+ai.isEmpty());
            System.out.println("Add some elements");
        }
        else{
            System.out.println("It is not empty"+ai.isEmpty());
            System.out.println(ai);

        }
    }
}
