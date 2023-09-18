package Day20;
import java.util.*;
public class Assertion {
    public static void main(String[] args) {
        int val;
        Scanner sc = new Scanner(System.in);
        val = sc.nextInt();
        assert val>=18:"Not Valid";
        System.out.println("Value is "+val);
        sc.close();
    }
}
