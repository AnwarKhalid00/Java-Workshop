
import java.util.Scanner;
public class operators 
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter value a:");
        int a = obj.nextInt();
        System.out.println("Enter value b:");
        int b = obj.nextInt();
        
        System.out.println("Performing ADDITION");
        System.out.println(a+b);
        System.out.println("Performing SUBTRACTION");
        System.out.println(a-b);
        System.out.println("Performing MULTIPLICATION");
        System.out.println(a*b);
        System.out.println("Performing QUOTIENT");
        System.out.println(a/b);
        System.out.println("Performing REMAINDER");
        System.out.println(a%b);
    
    }
    
}

