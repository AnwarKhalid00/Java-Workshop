package Day18;
import java.io.*;
public class Print_writer {
    public static void main(String[] args)throws IOException{
        PrintWriter pw = new PrintWriter("Friends.txt");
        char c = 'A';
        pw.println(c);
        pw.println("Hello Friends!!");
        pw.println("What are you all doing!!");
        System.out.println("SUCCESSFUL!!");
        pw.close();
    }
}
