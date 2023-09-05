package Day13;

public class Exception_TryCatchandFinally_Block {
    public static void main(String[] args) {
        int n = 26;
        try {
            int z = n/0;
            System.out.println(z);
        } catch (Exception ae) {
            System.out.println("Catch Block!!");
            System.out.println(ae.getMessage());
        }
        finally{
            System.out.println("Finally Block!!");
        }
    }
    
}
