package Day17;

import java.io.*;
public class File_handling_input {
    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream("Batch2Fileout.txt");
            int i = 0;
            while((i = fin.read())!=-1){//we use while loop to print the whole string at once!!
                System.out.println((char)i);//without using loop we will get only single character at once!!
            }
            fin.close();
            

        } catch (Exception e) {
            System.out.println(e.getMessage());
            
        }
    }
}
