package Day15;
import java.util.*;
class Outer_1{

    void check_even11(int a)
    {
        
        if(a%2==0){
            System.out.println(a+" is a even number.");
        }
    }
    class Inner_1{
        void check_odd12(int a){
            if(a%2!=0)
            {
                System.out.println(a+" is a odd number.");
                
            }
        }
    }
}
public class Question{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the integer: ");
        int a = sc.nextInt();
        Outer_1 o = new Outer_1();
        o.check_even11(a);
        Outer_1.Inner_1 in = new Outer_1().new Inner_1();
        in.check_odd12(a);
        sc.close();

    
    }
}
