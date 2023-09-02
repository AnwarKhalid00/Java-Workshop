package Day6;

import java.util.*;
public class Parameterized
{
    String name;
    int roll_no;
    int age;
    Parameterized(String name,int roll_no,int age){
        this.name = name;
        this.roll_no = roll_no;
        this.age = age;
        
    }
    
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name:");
        String name = sc.nextLine();
        System.out.println("Enter roll_no:");
        int roll_no = sc.nextInt();
        System.out.println("Enter age:");
        int age = sc.nextInt();
        Parameterized p = new Parameterized(name,roll_no,age);
        System.out.println("Name;"+p.name+"Roll_no:"+p.roll_no+"Age:"+p.age);
        
    }
    
}
