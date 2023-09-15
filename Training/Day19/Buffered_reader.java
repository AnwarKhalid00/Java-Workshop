package Day19;
import java.io.*;
public class Buffered_reader {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("Khalid.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("Khalid_changes.txt"));
        int w ; 
        do {
            w = br.read();
            if (w != -1){
                if(Character.isLowerCase((char)w)){
                    bw.write(Character.toUpperCase((char)w));
                }
                else if(Character.isUpperCase((char)w)){
                    bw.write(Character.toLowerCase((char)w));
                }
                else{
                    bw.write((char)w);
                }
            }
        } while (w != -1);
        System.out.println("SUCCESSFUL");
        br.close();
        bw.close();
    }
}
