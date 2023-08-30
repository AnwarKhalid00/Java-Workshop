package Day3;


import java.util.Scanner;

public class ternary {
    public static void main(String[] args) {
        Scanner zoo = new Scanner(System.in);
        System.out.println("ENter value of a:");
        int a = zoo.nextInt();
        System.out.println("Enter value of b:");
        int b = zoo.nextInt();
        int max = a>b?a:b;
        System.out.println(max);
    } 
    
}
