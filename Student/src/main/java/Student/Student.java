package Student;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Student {
    String name;
    String ID;
    String DOB;
    String classID;
    String phone;
    float score;

    
    void inputStudent() throws IOException{
        //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        System.out.println("Input name: ");        
        this.name = sc.next();
        System.out.println("Input DOB: ");        
        this.DOB = sc.next();
        System.out.println("Input Student ID: ");        
        this.ID = sc.next();
        System.out.println("Input Class ID: ");        
        this.classID = sc.next();
        System.out.println("Input phone number: ");        
        this.phone = sc.next();
        System.out.println("Input score: ");
        String S = sc.next();
        this.score = Float.parseFloat(S);
    }
   
    void outputStudent(){
        System.out.println("Output student");
        System.out.println( "Name: " + this.name);
        System.out.println("DOB: " + this.DOB);
        System.out.println("Student_ID: " + this.ID);
        System.out.println("ClassID: " + this.classID);
        System.out.println("Phone number: " + this.phone);
        System.out.println("Score: " + Float.toString(score));
    }
}
