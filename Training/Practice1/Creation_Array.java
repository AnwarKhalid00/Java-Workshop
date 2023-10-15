package Practice1;
import java.util.*;
public class Creation_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of elements in an array:");
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0; i<n;++i){
            arr[i] = sc.nextInt();
        }
        System.out.println("Elemnts in an array are:");
        for(int i = 0;i<n;++i){
            System.out.println("Elements in "+i+": "+arr[i]);
        }
    }
}
