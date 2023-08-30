package Day8;

class Parent1{
    void eat(){
        System.out.println("Team pay attention!!!");
    }
}
class Child1 extends Parent1{
    
    Child1(){
        super();
        System.out.println("Everyone listen to the class.....");

    }
}
public class Super_1 {
    public static void main(String[] args) {
        Child1 cc = new Child1();
        cc.eat();
    }
    
}
