package Day16;
//Wap to check whether a number is divisible by 5 and 11 or not using a normal anonymous class??
import java.util.*;
class Divisible{
    void divi(){
        System.out.println("Wap to check whether a number is divisible by 5 and 11 or not using a normal anonymous class??");
    }
}
public class Question22 {
    public static void main(String[] args) {
        Divisible d = new Divisible(){
            void divi(){
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter the number to be divided: ");
                int a = sc.nextInt();
                if(a%5==0 & a%11==0){
                    System.out.println(a+" is divisible by 5 and 11!");
                }
                else{
                    System.out.println(a+" is not divisible by 5 and 11!");
                }
                sc.close();
            }
        };
        d.divi();
    }
}
