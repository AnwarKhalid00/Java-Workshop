package Day17;
//WAP to create a file and create some string??
import java.util.*;
import java.io.*; 
public class Question00001 {
    public static void main(String[] args) {
        try {
            FileOutputStream ka = new FileOutputStream("Userinputfile.txt", false);
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the string: ");
            String a = sc.nextLine();
            byte k[]= a.getBytes();
            ka.write(k);
            System.out.print("Enter integer:");
            int f = sc.nextInt();
            ka.write(f);
            ka.close();
            sc.close();
            System.out.println("Success!!");


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
    
}
