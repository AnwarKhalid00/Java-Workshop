package Practice1;
import java.util.*;
public class Max_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the elements in an array:");
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0;i<n;++i){
            arr[i] = sc.nextInt();
        }
        for(int i = 0;i<n;++i){
            System.out.println("Elements in "+i+": "+arr[i]);
        }
        int max = arr[0];
        for(int i = 0;i<n;++i){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("The largest element in the array:"+max);
        sc.close();
    }
}
