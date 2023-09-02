package Day6;

import java.util.Scanner;
public class Operation_class 
{
    int num1;int num2;
    public void getdata()
    {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value of a:");
    num1 = sc.nextInt();
    System.out.println("Enter the value of b:");
    num2 = sc.nextInt();
    }
    public int add()
    {
        return(num1+num2);
    }
    public static void main(String[] args) 
    {
        Operation_class op = new Operation_class();
        op.getdata();
        System.out.print("Addition:"+op.add());
       
        
    }
    
    
}
