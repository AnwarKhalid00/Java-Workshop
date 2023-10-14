package Practice1;
import java.util.*;
import java.lang.*;
class Student_Info{ 
    String name,department;
    int age,m1,m2,m3,m4;
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print( "Enter the name of the student:");
        name = sc.nextLine();
        System.out.print( "Enter the age of the student:");
        age = sc.nextInt();
        System.out.print( "Enter the department of the student:");
        department = sc.nextLine();
        System.out.print( "Enter the marks_1 of the student:");
        m1 = sc.nextInt();
        System.out.print( "Enter the marks_2 of the student:");
        m2 = sc.nextInt();
        System.out.print( "Enter the marks_3 of the student:");
        m3 = sc.nextInt();
        System.out.print( "Enter the marks_4 of the student:");
        m4 = sc.nextInt();
        sc.close();
        
    }
    void display(){
        System.out.println("Name:" + name);
        System.out.println("Age:"+age);
        System.out.println("Department:"+department);
    }
    
    
}
class Information extends Student_Info{

    int sum() 
    {
        return(m1+m2+m3+m4);
    }

   
}

public class Average_Marks_calculator {
    public static void main(String[] args) {
        Information av = new Information();
        av.input();
        av.display();
        System.out.println("Total marks of the student:"+av.sum());
        System.out.println("Average marks of the student:"+(av.sum()/4));
        
        

    }
}
