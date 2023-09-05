package Day13;
@FunctionalInterface
interface Isalnd
{
    public void show();
     
}
interface Tribe
{
    public void show();
}
class Khalid implements Isalnd,Tribe
{
    public void show()
    {
        System.out.println("Its a nice island");
    }
    public void show1()
    {
        System.out.println("Hello people!!!!");
    }

}
public class Functional_Interface {
    public static void main(String[] args) {
        Khalid ka = new Khalid();
        ka.show();
        ka.show1();
        
    }
    
}
