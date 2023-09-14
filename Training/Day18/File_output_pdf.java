package Day18;

import java.io.FileOutputStream;

public class File_output_pdf {
      public static void main(String[] args) {
        try {
            FileOutputStream fout = new FileOutputStream("Batch2.pdf", false);
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
