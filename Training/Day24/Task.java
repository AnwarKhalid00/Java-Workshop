package Day24;
//write a program to print the maximum element from the arraylist.
import java.util.*;
public class Task {
    public static void main(String[] args) {
        ArrayList<Integer> ai = new ArrayList<Integer>();
        ai.add(16);
        ai.add(15);
        ai.add(401);
        ai.add(59);
        ai.add(10);
        ai.add(27);
        System.out.println("Elements: "+ai);
        int max = ai.get(0);
        for(int i=0;i<ai.size();i++){
            if(ai.get(i)>max){
                max = ai.get(i);
            }
        }
        System.out.println("Maximum element: "+max);
    }
}   
