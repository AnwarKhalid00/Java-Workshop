package Day16;
@FunctionalInterface
interface See{
    void display();
}
public class Anonymous_inner2 {
    public static void main(String[] args) {
        See A = new See() {
            public void display(){
                System.out.println("Hello Khalid!!");
            }
        };
        A.display();
    }
}

