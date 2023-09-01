package Day5;

import java.util.Scanner;
import java.lang.*;
public class Vowel_Consonants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter new string:");
        String a = sc.nextLine();
        char[]c = a.toCharArray();
        int vowel = 0;
        int consonant = 0;
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)=='a'||a.charAt(i)=='e'||a.charAt(i)=='i'||a.charAt(i)=='o'||a.charAt(i)=='u'||
                a.charAt(i)=='A'||a.charAt(i)=='E'||a.charAt(i)=='I'||a.charAt(i)=='O'||a.charAt(i)=='U')
            {
                vowel++;
                
            }
            else if(a.charAt(i)==' ')
            {
                continue;
            
            }
            else
            {
                consonant++;
            }
            
            
        }
        System.out.println("Vowels in the string are:"+vowel);
        System.out.println("Cnsonants in the string are:"+consonant);
        
        
    }
    
}
