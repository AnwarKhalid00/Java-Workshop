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
public class Operation_class 
{
    int num1;int num2;
    public void getdata()
    {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value of a:");
    num1 = sc.nextInt();
    System.out.println("Enter the value of b:");
    num2 = sc.nextInt();
    }
    public int add()
    {
        return(num1+num2);
    }
    public static void main(String[] args) 
    {
        Operation_class op = new Operation_class();
        op.getdata();
        System.out.print("Addition:"+op.add());
       
        
    }
    
    
}
