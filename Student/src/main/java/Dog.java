
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class Dog {
    String name;
    String DOB;
    String weight;
    String species;
    String color;
    String act;
    
    void input() throws IOException{
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Input name: ");        
        this.name = sc.next();
        System.out.println("Input DoB: ");        
        this.DOB = sc.next();
        System.out.println("Input weight: ");        
        this.weight = sc.next();
        System.out.println("Input species: ");        
        this.species = sc.next();
        System.out.println("Input color: ");        
        this.color = sc.next();
        System.out.println("Input activity: ");
        this.act= sc.next();
    }
    
    void output()
    {
        System.out.println("Output Dog");
        System.out.println("Name: " + this.name);
        System.out.println("DOB: " + this.DOB);
        System.out.println("Weight: " + this.weight);
        System.out.println("Species: " + this.species);
        System.out.println("Color: " + this.color);
        System.out.println("Act: " + this.act);
    }
}
