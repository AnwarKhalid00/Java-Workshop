package Day24;
//write a java program to print the elements which are at odd positions in the arraylist.
import java.util.*;
public class Task_2 {
    public static void main(String[] args) {
        ArrayList<Integer> ai = new ArrayList<Integer>();
        ai.add(16);
        ai.add(15);
        ai.add(401);
        ai.add(59);
        ai.add(10);
        ai.add(27);
        System.out.println("Elements: "+ai);
        System.out.print("Elements at odd positions: ");
        for(int i=0;i<ai.size();i++){
            if(i%2!=0){
                System.out.print(ai.get(i)+" ");
            }
        }
    }
}
