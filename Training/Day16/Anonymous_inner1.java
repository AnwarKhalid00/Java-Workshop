package Day16;
//Anonymous  inner class using abstract class!!
abstract class See{
    abstract void display();
}
public class Anonymous_inner1 {
    public static void main(String[] args) {
        See obj = new See() {
           void display(){
            System.out.println("Hello Khaid!!");
           } 
        };
        obj.display();
    }
}