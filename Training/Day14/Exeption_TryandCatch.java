package Day14;
import java.io.IOException;
class Niet{
    void div(int a,int b)throws ArithmeticException{
        if(b==0){
            throw new ArithmeticException();
        }
        else{
            System.out.println((a/b));
        }
    }
}
public class Exeption_TryandCatch {
    public static void main(String[] args) {
        Niet nn = new Niet();
        try{
            nn.div(20, 0);
        }
        catch(ArithmeticException ae){
            System.out.println(ae);

        }
    }
    
}
