package Day14;
import java.io.IOException;
 class Test{
        void method() throws IOException{
            System.out.println("Device is working!!!");
        }
    }
public class Exeption_3 {   
    public static void main(String[] args) throws IOException 
    {
        Test m = new Test();
        m.method();
        System.out.println("The Normal Flow");
    }
    
}
