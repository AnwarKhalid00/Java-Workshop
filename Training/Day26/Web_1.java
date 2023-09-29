package Day26;
import java.awt.*;
import java.awt.event.*;
public class Web_1 extends Frame{
    Frame f1;
    Label l1;
    Button b1;
    Button b2;
    public Web_1(){
        f1 = new Frame("Welcome to FrameWork");
        f1.setLayout(new FlowLayout());
        f1.setLayout(new GridLayout(2,2));
        f1.setSize(500,400);
        l1 = new Label("HELLO WORLD!!");
        b1 = new Button("Click Me");
        b2 = new Button("Exit");
        f1.add(b1);
        f1.add(l1);
        f1.add(b2);
        f1.setVisible(true);
        f1.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
        
    }
        
    public static void main(String[] args) {
        Web_1 obj = new Web_1();
        
    }
}
