package Day14;
class Anwar{
    public void sho(){
        System.out.println("Hello Everyone!!!");
    }
}
 class Khalid extends Anwar{  //Onlychild class,child class method can be final....
    final public void show(){
        System.out.println("Hello!!!");
    }

}
public class Final {
    public static void main(String[] args) {
        final int a = 25;//Final keyword makes an data type constant...
        System.out.println(a);
        Khalid kk = new Khalid();
        kk.show();
        kk.sho();
    }
    
}
