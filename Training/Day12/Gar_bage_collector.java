package Day12;
class Cricketer{
    Cricketer(){
        System.out.println("Object is created!!!!");
    }
    protected void finalize(){
        System.out.println("Object is destroyed!!!"); 
    }
}
public class Gar_bage_collector {
    public static void main(String[] args) {
        Cricketer c1 = new Cricketer();
        c1 = null;//unrefernced obj is created.
        Cricketer c2 = new Cricketer();  
        c1 = c2;
        new Cricketer();
        System.gc();//Garbage collector.             

    }
}
