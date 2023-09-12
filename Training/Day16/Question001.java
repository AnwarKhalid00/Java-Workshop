package Day16;
//Wap to find maximum between two numbers using lambda expression??
import java.util.*;
interface Maximum{
    int show_max(int a,int b);
}
public class Question001 {
    public static void main(String[] args) {
        
        Maximum mm = (int a,int b)->{
            if(a>b){
                return(a);
            }
            else{
                return(b);
            }
            
            
        };
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number:");
        int a = sc.nextInt();
        System.out.print("Enter the second number:");
        int b = sc.nextInt();
        System.out.println("Greatest number between "+a+" & "+b+" is: "+mm.show_max(a, b));
        sc.close();
    }
}
