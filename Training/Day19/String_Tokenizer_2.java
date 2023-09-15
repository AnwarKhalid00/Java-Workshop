package Day19;
import java.util.*;
public class String_Tokenizer_2 {
    public static void main(String[] args) {
        StringTokenizer s = new StringTokenizer("He@Welcome@To@Java@Tokenizer@!!");
        while(s.hasMoreTokens()){
            System.out.println(s.nextToken("@"));
        }
    }
}
