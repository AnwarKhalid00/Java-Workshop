package Day7;
import java.util.*;
class AA{
    int a,b;
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a:");
        a = sc.nextInt();
        System.out.println("Enter value of b:");
        b = sc.nextInt();
    }
    int add()
    {
        return(a+b);
    }
}
class BB extends AA{
    int c;
    void getdata(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of c:");
        c = sc.nextInt();
    }
    int sum()
    {
        return(a+b+c);
    }
}
public class Single_inheritance {
    public static void main(String[] args) {
        BB bb = new BB();
        bb.input();
        System.out.println("Sum of two numbers are:"+(bb.add()));
        bb.getdata();
        System.out.println("Sum of three numbers are:"+(bb.sum()));
       
    }
    
}