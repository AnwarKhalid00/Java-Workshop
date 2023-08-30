package Day8;

class Parent{
    void eat(){
        System.out.println("Team pay attention!!!");
    }
}
class Child extends Parent{
    
    Child(){
        super();
        System.out.println("Everyone listen to the class.....");

    }
}
public class Super_1 {
    public static void main(String[] args) {
        Child cc = new Child();
        cc.eat();
    }
    
}
