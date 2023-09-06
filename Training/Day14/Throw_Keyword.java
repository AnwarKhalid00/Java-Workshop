package Day14;

public class Throw_Keyword {
    public static void check(int num){
        try {
            if(num<18)
            {
                throw new ArithmeticException("Not Eligible!!");
            }
            else{
                System.out.println("Eligible to vote!!!");
            }
        } 
        catch (Exception e) 
        {
            System.out.println(e);

        }
    }
    public static void main(String[] args) {
        check(10);
    }
    
}
