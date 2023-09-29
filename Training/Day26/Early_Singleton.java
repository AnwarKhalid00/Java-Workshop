package Day26;

public class Early_Singleton {
    public static void main(String[] args) {
        Khalid obj = Khalid.getInstance();
        Khalid obj2 = Khalid.getInstance();
    }
}
class Khalid{
    static Khalid obj = new Khalid();
    private Khalid(){
     System.out.println("I think I am listening!!");   
    }
    public static Khalid getInstance(){
        return obj;
    }
}