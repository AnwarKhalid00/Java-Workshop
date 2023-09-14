package Day18;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class File_reader {
    public static void main(String[] args) throws IOException{
        Reader rd = new FileReader("Khalid.txt");
        int data = rd.read();
        while(data != -1){
            System.out.print((char)data+" ");
            data = rd.read();
        } 
        rd.close();
    }
}
