package Day9;
import java.util.*;

class Fact{
    int num;
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        num = sc.nextInt();
        

    }
    int fact;
    int fac(){
        fact = 1;
        for(int i = num ; i >= 1;i--){
            fact = fact*i;
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
