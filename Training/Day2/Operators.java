package Day2;



import java.util.Scanner;
public class Operators 
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
        System.out.println("Performing Division");
        System.out.println(a/b);
        System.out.println("Performing Remainder");
        System.out.println(a%b);
                
    }
    
}

