/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author E-LAB-PC33
 */
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
    int sum()
    {
        return(a+b+c);
    }
}
class C extends B{
    int d;
    void getinfo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of d:");
        d = sc.nextInt();
    }
    int mult(){
        return(a*c*d);
    }
}
public class Multilevel_Inheritance {
    public static void main(String[] args) {
        C cc = new C();
        cc.input();
        System.out.println("Sum of two numbers are:"+(cc.add()));
        cc.getdata();
        System.out.println("Sum of three numbers are:"+(cc.sum()));
        cc.getinfo();
        System.out.println("Product of a,c,d:"+(cc.mult()));
        
    }
    
}
