package Day13;

public class Exception_TryandCatch_Block {
    public static void main(String[] args) {
        try{
            int a = 5/0;
            System.out.println(a);
        }
        catch(ArithmeticException ae){
            System.out.println("Exception Caught!!");
            System.out.println(ae.getMessage());
        }
    }
}
