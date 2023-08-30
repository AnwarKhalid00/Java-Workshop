package Day7;
import java.util.*;

class A{
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
class B extends A{
    int c;
    void getdata(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of c:");
        c = sc.nextInt();
    }
    int sub()
    {
        return(a-b-c);
    }
}
class C extends B
{
    int d;
    void getinfo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of d:");
        d = sc.nextInt();
    }
    float div(){
        return(d/c);
    }
}
class D extends B{
    int e;
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of e:");
        e = sc.nextInt();
    }
    int mul(){
        return (a*e);
    }
}
public class Hybrid_inheritance {
    public static void main(String[] args) {
        C c = new C();
        D d = new D();
        c.input();
        c.getdata();
        c.getinfo();
        d.input();
        System.out.println("Addition of a,b :"+(c.add()));
        System.out.println("Subtraction of a,b,c:"+(c.sub()));
        System.out.println("Division of d,c:"+(c.div()));
        System.out.println("Multiplication of a,e:"+(d.mul()));


       

        
    }
    
}
