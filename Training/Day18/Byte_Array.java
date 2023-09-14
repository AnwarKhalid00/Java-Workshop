package Day18;
import java.io.*;
public class Byte_Array {
    public static void main(String[] args)throws IOException {
        byte [] array = {1,2,3,4,5};
        ByteArrayInputStream in = new ByteArrayInputStream(array);
        System.out.print("Elements inside it:");
        for(int i = 0;i<array.length;i++){
            int data = in.read();
            System.out.print(data+" ");
        }
        in.close();
    }
}
