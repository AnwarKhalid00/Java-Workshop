package Day17;
//For file output stream??
import java.io.*;

public class File_handling_output {
    public static void main(String[] args) {
        try {
            FileOutputStream fout = new FileOutputStream("Batch2Fileout.txt", false);
            String s = "\nWelcome to Java File Handling!!";
            byte b[] = s.getBytes();//For addition of strings!!
            fout.write(69);//Will always print ASCII value and will only take integer as an input!!
            fout.write(b);
            fout.close();
            System.out.println("Success");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
