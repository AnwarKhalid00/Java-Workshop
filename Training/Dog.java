/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author E-LAB-PC33
 */
public class Dog 
{
    String breed;
    String size;
    int age;
    String color;
    
    public String getinfo()
    {
        return("Breed is:"+breed+"Size is:"+size+"Age is :"+age+"Color is :"+color);
    }
    public static void main(String[] args) 
    {
        Dog maltese = new Dog();
        maltese.breed="Maltese";
        maltese.size="Small";
        maltese.age=2;
        maltese.color="White";
        System.out.println(maltese.getinfo());
        
        
    }
}
