package Day26;

import java.awt.*;

import javax.swing.*;

public class Gui_using_frame {
    public static void main(String[] args) {
        Abc obj = new Abc();
    }
    
}
class Abc extends JFrame{

    public Abc(){
        setLayout(new FlowLayout());
        JLabel l1 = new JLabel("Hello World");
        add(l1);
        JLabel l2 = new JLabel("Welcome to class");
        add(l2);
        setVisible(true);
        setSize(500,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
}
    