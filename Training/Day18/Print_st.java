package Day18;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Print_st {
    public static void main(String[] args)throws IOException {
        FileOutputStream fout = new FileOutputStream("Sample.txt", false);
        PrintStream ps = new PrintStream(fout);
        ps.println(2016);
        ps.println("HELLO KHALID");
        ps.println("EVERYONE LOOK AT THE SCREEN!!");
        System.out.println("SUCCESSFUL!!");
        ps.close();
        fout.close();

    }
}
