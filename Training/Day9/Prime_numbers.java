package Day9;
import java.util.*;


public class Prime_numbers {
    static boolean prime(int n)
    {
        for(int i =2;i<=n;i++)
        {
            if(n%2==0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n,m;
        n = sc.nextInt();
        m = sc.nextInt();
        for(int i=n;i<=m;i++)
        {
            if(prime(i))
            {
                System.out.println(i+"is a prime number.");
            }
            else
            {
                System.out.println(i+"is not a prime number");
            }
        }
    }
    
}
