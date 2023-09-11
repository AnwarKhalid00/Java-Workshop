package Day15;
//WAP to print the given number in reverse order using local inner class?
import java.util.*;
class outer_2
{
    void rev(int a)
    {
        class Inner_2
        {
            void display(int a)
            {
                int reverse = 0;
                int rem = 0;
                int temp =  a;
                while(temp!=0)
                {
                    rem = temp%10;
                    reverse = (reverse*10)+rem;
                    temp = temp/10;
                }
                if(reverse>0){
                    System.out.println(reverse);
                }
                else{
                    System.out.println(reverse* -1+"-");
                }
            }
            


        }
        Inner_2 inn = new Inner_2();
        inn.display(a);
    }
}
public class Question_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int a = sc.nextInt();
        outer_2 oo = new outer_2();
        oo.rev(a);
        sc.close();
        
    }
    
}
