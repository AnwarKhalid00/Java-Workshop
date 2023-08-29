 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author E-LAB-PC33
 */
import java.lang.String;
public class String_ 
{
    public static void main(String[] args) 
    {
        String S1 = "Hello";
        String S2 = "Hello";
        String S3 = new String("Hello");
        String S4 = new String("WORLD");
        System.out.println(S1==S2);
        System.out.println(S1==S3);
        System.out.println(S1.charAt(2));
        System.out.println(S3.compareTo(S4));
        System.out.println(S3.concat(S4));
        System.out.println(S4.toLowerCase());
        System.out.println(S3.toUpperCase());
        
        
    }
    
}
