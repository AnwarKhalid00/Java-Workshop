/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java_workshop;

import java.util.Scanner;

/**
 *
 * @author E-LAB-PC33
 */
public class Arrayquestion 
{
    public static void main(String[] args) 
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int n = obj.nextInt();
        int i;
        int arr[] = new int[n];
        System.out.println("Enter the element in array:");
        for(i=0;i<n;++i)
        {
        arr[i] = obj.nextInt();
        }
        int max = arr[0];
        for(i=1;i<n;++i)
        {
            if(arr[i]>max)
            {
                max = arr[i];
            }
        }
        System.out.println("Greatest value ius :"+max);
        
    }
    
}
