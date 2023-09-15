package Day19;
import java.util.*;
public class String_Tokenizer {
    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("Hello students of Batch 2 !!");
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
    }
}
