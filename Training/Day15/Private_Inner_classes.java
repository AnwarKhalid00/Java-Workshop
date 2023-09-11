package Day15;
class Outer_demo{
    private int num = 1612;
    class Inner_demo{
        public int getnum(){
            System.out.println("Inner class!!");
            return num;
        }

    }
}
public class Private_Inner_classes {
    public static void main(String[] args) {
    Outer_demo.Inner_demo in = new Outer_demo().new Inner_demo();
    System.out.println(in.getnum());
    }
    
}
