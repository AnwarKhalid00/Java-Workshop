package Day17;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class File_handling_datainput {
    public static void main(String[] args)throws IOException {
        DataInputStream dis = new DataInputStream(new FileInputStream("DataFileout.txt"));
        int a = dis.readInt();
        char ch = dis.readChar();
        double d = dis.readDouble();
        System.out.println(a+" "+ch+" "+d);
        dis.close();
    }
}
