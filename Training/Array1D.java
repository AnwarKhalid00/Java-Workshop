/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author E-LAB-PC33
 */
import java.util.Scanner;
public class Array1D 
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
        System.out.println("Elements in array are:");
        for(i=(n-1);i>=0;--i)
        {
            System.out.println("Elements in"+i+": "+arr[i]);
        }
        
    }
    
}
