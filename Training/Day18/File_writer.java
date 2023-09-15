package Day18;

import java.io.FileWriter;
import java.io.IOException;

public class File_writer {
    public static void main(String[] args)throws IOException {
        FileWriter fw = new FileWriter("Khalid.txt");
        String str = ("We are students of Data Science!!\n");
        for(int i = 0;i<str.length();i++){
            fw.write(str.charAt(i));
        }
        fw.write("\nKhalid Anwar\n");
        fw.write("\nWe all are learning java!!\n");
        fw.write(str.charAt(4));
        System.out.println("SUCCESSFUL!!");
        fw.close();
    }
    
}
