package Day17;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

import java.io.*;
public class File_handling_bufferinput {
    public static void main(String[] args) throws IOException{
        FileInputStream fin = new FileInputStream("Batch2Fileout.txt");
        BufferedInputStream bin = new BufferedInputStream(fin);
        int i;
        while((i = bin.read())!=-1){
            System.out.print((char)i);
        }
        bin.close();
        fin.close();
    }
}
