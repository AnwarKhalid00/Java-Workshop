package Day15;
class Local{
    final int s = 25;
    void show(){
        class Local_nested{
            void disp(){
                System.out.println("Students dont talk!!");
            }
        }
        Local_nested l = new Local_nested();
        l.disp();
    }
}
public class Local_inner_classes {
    public static void main(String[] args) {
        Local obj = new Local();
        System.out.println(obj.s);
        obj.show();
    }
    
}
