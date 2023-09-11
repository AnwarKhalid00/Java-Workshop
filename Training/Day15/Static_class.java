package Day15;

public class Static_class {
    static int data  = 30;
    static class Inner_4{
        void msg(){
            System.out.println("Data is "+data);
        }
    } 
    public static void main(String[] args) {
        Static_class.Inner_4 obj = new Static_class.Inner_4();
        obj.msg();
    }
    
}
