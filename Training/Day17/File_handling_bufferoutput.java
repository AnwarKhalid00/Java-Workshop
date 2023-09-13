package Day17;
import java.io.*;
public class File_handling_bufferoutput {
    public static void main(String[] args) throws IOException {
        FileOutputStream fout = new FileOutputStream("Batch2Fileout.txt", false);
        BufferedOutputStream bout = new BufferedOutputStream(fout);
        String s = "Welcome to buffer file concepts";
        byte b[] = s.getBytes();
        bout.write(b);
        bout.close();
        fout.close(); 
    }
    
}
