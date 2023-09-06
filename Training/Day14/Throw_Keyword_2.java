package Day14;

public class Throw_Keyword_2 
{
     public static void main(String[] args) 
    {
        for(int i = 0;i<=10;++i)
        {
            try
            {
                if(i==5)
                {
                    throw new ArithmeticException("5 not allowed!!!");
                }
                else
                {
                    System.out.println("The number is "+i);
                }
                } 
            catch(Exception e)
            {
                System.out.println(e);
            }
        } 
            
    }
}