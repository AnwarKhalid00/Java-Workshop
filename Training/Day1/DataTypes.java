package Day1;



import java.util.Scanner;
public class DataTypes 
{

    public static void main(String[] args) 
    {
       
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the String a:");
        String a=sc.nextLine();
        System.out.println("enter the input b:");
        int b = sc.nextInt();
        System.out.println("enter the input c:");
        char c = sc.next().charAt(2);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }
}    