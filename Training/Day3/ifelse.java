package Day3;


import java.util.Scanner;

public class ifelse 
{
    public static void main(String[] args) 
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter first number;");
        int a = obj.nextInt();
        System.out.println("Enter second number;");
        int b = obj.nextInt();
        System.out.println("Enter third number;");
        int c = obj.nextInt();
        if (a>0)
        {
            System.out.println("a is a positive number");}
        else {
         
            System.out.println("a is an negative number");
        }       
        
        if (a>b && a>c)
        {
            System.out.println(a+" is greatest");
        
        }
        else if (b>a && b>c)
        {
            System.out.println(b+" is greatest ");
            
        }
        else
        {
            System.out.println(c+" is greatest");
        }
                
        
        
    }
    
}   
    
    
    
    
    

