package Day18;

import java.io.FileWriter;
import java.io.IOException;

public class File_writer {
    public static void main(String[] args)throws IOException {
        FileWriter fw = new FileWriter("Khalid.txt");
        String str = ("WE ARE DATA SCIENCE STUDENTS!!\n");
        for(int i = 0;i<str.length();i++){
            fw.write(str.charAt(i));
        }
        fw.write("\nKHALID\n");
        fw.write("\nWE ALL ARE LEARNING JAVA!!");
        

        System.out.println("SUCCESSFUL!!");
        fw.close();
    }
    
}
