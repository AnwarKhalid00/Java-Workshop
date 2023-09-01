package Day9;
import java.util.*;
import java.lang.*;
    int num;
    void input(){
        Scanner sc = new Scanner(System.in):
        int num = sc.nextInt();
        return num ;
    }
}
class Fact{
    int num;
    int input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numner:")
        int num = sc.nextInt();
        return num;
    }
    int fact;
    int fac(){
        fact = 1;
        int i = 1;
        while(i<=num){
            fact *= i;
            i += 1;
        }
        return fact;
    }   
}
public class Factorial
 {
    public static void main(String[] args) 
    {
        Fact f = new Fact();
        f.input();
        System.out.println("Factorial :"+f.fac());

        
        
    }
    
}
