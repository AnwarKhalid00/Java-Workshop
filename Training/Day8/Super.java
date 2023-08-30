package Day8;
class Parent_{
    void eat(){
        System.out.println("Team pay attention!!!");
    }
}
class Child_ extends Parent_{

    void eat(){
        
        super.eat();
        System.out.println("Everyone listen to the class.....");

    }
}
public class Super {
    public static void main(String[] args) {
        Child_ cc = new Child_();
        cc.eat();
    }
    
}
