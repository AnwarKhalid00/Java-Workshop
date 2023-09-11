package Day7;

import java.util.*;


class Father
{
    int l,b,s;
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of length:");
        l = sc.nextInt();
        System.out.println("Enter value of breadth:");
        b = sc.nextInt();
        System.out.println("Enter value of sides:");
        s = sc.nextInt();
    }
}
class Rectangle extends Father{
    int perimeter(){
        return(2*(l+b));
        
    }
    int area(){
        return(l*b);
    }
}
class Square extends Father{
    int peri(){
        return(4*s);
    }
    int are(){
        return(s*s);
    }
        
}

public class Hierarical_inheritance {
    public static void main(String[] args) {
        Square ss = new Square();
        ss.input();
        System.out.println("Perimeter of square is:"+(ss.peri()));
        System.out.println("Area of square is:"+(ss.are()));
        Rectangle rr = new Rectangle();
        rr.input();
        System.out.println("Perimeter of Rectangle is:"+(rr.perimeter()));
        System.out.println("Area of Rectangle is:"+(rr.area()));
        

        
    }
    
}
