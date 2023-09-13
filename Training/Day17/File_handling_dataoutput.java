package Day17;
import java.io.*;
public class File_handling_dataoutput {
    public static void main(String[] args)throws IOException {
        DataOutputStream dos = new DataOutputStream(new FileOutputStream("DataFileout.txt"));
        dos.writeInt(25);
        dos.writeChar('K');
        dos.writeDouble(10.25);
        System.out.println("Successful");
        dos.close();
    }
}
