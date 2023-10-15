package Practice1;
import java.util.*;
public class Count_integer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the integer:");
        int a = sc.nextInt();
        int count = 0;
        do{
            ++count;
            a = a/10;
        }while(a!=0);
        System.out.print("The number of elements in integer:"+count);
    }
}
