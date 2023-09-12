package Day15;
class Outer{
    int data = 50;
    void show(){
        System.out.println("Inside outer classes!!");
    }
    class Inner{
        void show() 
        {
        System.out.println("Inside inner classes!!");
        }
        void show1(){
            System.out.println("Inner class another way");
        }       
    }
}
public class Inner_Classes {
    public static void main(String[] args) {
        Outer o = new Outer();
        System.out.println(o.data);
        o.show();
        Outer.Inner i = o.new Inner();//By creating object for outer class
        i.show();
        Outer.Inner in = new Outer().new Inner();//Without creating object for outer class                                                      
        in.show1();

    }
    
}
