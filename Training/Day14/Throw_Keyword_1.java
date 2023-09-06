package Day14;

public class Throw_Keyword_1 {
    public static void check(int num){
        try
        {
            if(num == 0){
                throw new ArithmeticException("0 not allowed!!!");

            }
            else{
                System.out.println(num*num);
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
       check(0);
        
    }
    
}
