package Day8;

import java.util.*;

class A{
    int add(int a,int b){
        return(a+b);
    }
    
}
class B extends A{
    int add(int a,int b,int c){
        return(a+b+c);
    }
}

public class Method_overloading {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a:");
        a = sc.nextInt();
        System.out.println("Enter the value of b:");
        b = sc.nextInt();
        System.out.println("Enter the value of c:");
        c = sc.nextInt();
        B bb = new B();
        System.out.println("Addition of a,b:"+(bb.add(a, b)));
        System.out.println("Addition of a,b,c:"+(bb.add(a, b, c)));


    }
    
}
