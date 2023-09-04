package Day5;
import java.util.*;
public class Arrayquestion 
{
    public static void main(String[] args) 
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int n = obj.nextInt();
        int i;
        int arr[] = new int[n];
        System.out.println("Enter the element in array:");
        for(i=0;i<n;++i)
        {
        arr[i] = obj.nextInt();
        }
        int max = arr[0];
        for(i=1;i<n;++i)
        {
            if(arr[i]>max)
            {
                max = arr[i];
            }
        }
        System.out.println("Greatest value is :"+max);
        
    }
    
}
