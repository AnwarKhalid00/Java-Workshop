package Day13;

public class Exception_TryandCatch_Block_1 
{
    public static void main(String[] args) 
    {
        try  
        {
            int number[] = new int[10];
            number[12] = 30/10;
        } 
        catch (Exception ae)
        {
            System.out.println(ae.getMessage());
        }       
    }
}
