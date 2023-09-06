package Day14;
class Niet_1{
    void div(int a,int b)throws ArithmeticException,NullPointerException{
        if(b==0){
            throw new ArithmeticException();
        }
        else{
            throw new NullPointerException();
        }
    }
}
public class Null_Point_Exception {
    public static void main(String[] args) {
        Niet_1 nn = new Niet_1();
        try{
            nn.div(20, 0);
        }
        catch(ArithmeticException ae){
            System.out.println(ae);

        }
    }
    
}
