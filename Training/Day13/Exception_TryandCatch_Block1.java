package Day13;

public class Exception_TryandCatch_Block1 
{
    public static void main(String[] args) 
    {
        String str  = null;
        try 
        {
            if(str.equals("Hello"))
            {
                System.out.println("Same!!!");
            }
            else
            {
                System.out.println("Not Same!!!");
            }
        } 
        catch (Exception ae) 
        {
            System.out.println("Catch Block!!!");
            System.out.println(ae.getMessage());
        }
        finally
        {
            System.out.println("Finally Block");
        }
    }
    
}
