/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java_workshop;

/**
 *
 * @author E-LAB-PC33
 */
import java.util.Scanner;
import java.lang.*;
public class String_palindrome
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String pal = sc.nextLine();
        char[] s = pal.toCharArray();
        String check = "";
        for(int i=(pal.length()-1);i>=0;i--)
        {
            check = check + s[i];
            
        }
                
        char[] rev = check.toCharArray();
        for(int i = 0;i<pal.length();i++)
        {
            if(rev[i] == s[i])
            {
                System.out.println("It is a palindrome");
            }
            else
            {
                System.out.println("It is not a palindrome");
            }
        }    
        
    }
    
}
