package Day16;
class Niet{
    void display(){
        System.out.println("We are great students of NIET!!");
    }
}

public class Anonymous_inner {
    public static void main(String[] args) {
        Niet nn = new Niet()//creating an instance of the abstract class
       {
        void display(){//overriding the method
            System.out.println("NIET");

        }
       };
       nn.display();
    }
    
}
