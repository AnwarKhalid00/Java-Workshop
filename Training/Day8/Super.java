package Day8;
class Parent{
    void eat(){
        System.out.println("Team pay attention!!!");
    }
}
class Child extends Parent{

    void eat(){
        
        super.eat();
        System.out.println("Everyone listen to the class.....");

    }
}
public class Super {
    public static void main(String[] args) {
        Child cc = new Child();
        cc.eat();
    }
    
}
