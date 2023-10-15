package Day16;
//write a code for a square of a number using anonymous inner class using interface concept?
import java.util.*;
//@FunctionalInterface
interface  Square_of_num{

    void claculate();
}
public class Question00 {
    public static void main(String[] args) {
        Square_of_num ss = new Square_of_num() {
            public void claculate(){
                Scanner sc = new Scanner(System.in);
                System.out.print("Entter  the number:");
                int a = sc.nextInt();
                System.out.println("Square of "+a+" is : "+(a*a));
                sc.close();
            }
        };
        ss.claculate();
    }
    
}
