package Day13;
import java.util.*;
@FunctionalInterface
interface Even
{
    public void show_even();
}
class Answer implements Even
{
        public void show_even()
        {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter  the number:");
            int a = sc.nextInt();
            if(a%2==0)
            {
                System.out.println(a+" is an even number!");
            }
            else
            {
                System.out.println(a+" is a odd number!");
            }
        }

}
public class Question_Fuctional_Interface 
{
    public static void main(String[] args) 
    {
        Answer ans = new Answer();
        ans.show_even();
    }
}
