package Day12;
interface Pyramid
{
    public void show();
}
interface Trainer
{
    public void show();
}
class Shahram implements Pyramid,Trainer
{
    public void show()
    {
        System.out.println("Its working!!!");
    }
    public void show1()
    {
        System.out.println("We can also put our own child class method!!!");
    }

}
public class Interface {
    public static void main(String[] args) {
        Shahram ka = new Shahram();
        ka.show();
        ka.show1();
    }
    
}
