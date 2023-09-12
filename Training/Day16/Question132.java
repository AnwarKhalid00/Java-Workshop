package Day16;
//WAP to check whether a number is negative positive or zero using abstract classes??
import java.util.*;
abstract class Check_Number{
    abstract void process();
}
public class Question132 {
    public static void main(String[] args) {
        Check_Number ch = new Check_Number() {
            void process(){
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter the number : ");
                int a = sc.nextInt();
                if(a>0){
                    System.out.println(a+" is a positve number!");
                }
                else if(a<0){
                    System.out.println(a+" is anegative number!");
                }
                else{
                    System.out.println(a+" is equals to 0!");
                }
                sc.close();
            }
        };
        ch.process();

    }
    
}
