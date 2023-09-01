package Day6;

import java.util.*;
public class Constructor_overload {
    String name;
    int roll_no;
    int age;
    Constructor_overload()
    {
        name = "James Gosling";
        roll_no = 99;
        age = 69;
    
    }
    Constructor_overload(String name,int roll_no,int age){
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
        Constructor_overload q = new Constructor_overload();
        Constructor_overload p = new Constructor_overload(name,roll_no,age);
        System.out.println("Name;"+q.name+"Roll_no:"+q.roll_no+"Age:"+q.age);
        System.out.println("Name;"+p.name+"Roll_no:"+p.roll_no+"Age:"+p.age);
        
    }
    
    
}
