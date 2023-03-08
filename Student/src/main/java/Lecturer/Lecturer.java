package Lecturer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lecturer {
    String name;
    String ID;
    String DOB;
    String salary;
    String phone;
    String major;
    
    void inputLecturer() throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input name: ");        
        this.name = reader.readLine();
        System.out.println("Input DOB: ");        
        this.DOB = reader.readLine();
        System.out.println("Input Lecturer ID: ");        
        this.ID = reader.readLine();
        System.out.println("Input salary: ");        
        this.salary = reader.readLine();
        System.out.println("Input phone number: ");        
        this.phone = reader.readLine();
        System.out.println("Input major: ");        
        this.major = reader.readLine();
    }
    void modify() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input salary: ");        
        this.salary = reader.readLine();
        System.out.println("Salary: " + this.salary);
    }
    void outputLecturer(){
        System.out.println("Output Lecturer:");
        System.out.println( "Name: " + this.name);
        System.out.println("DOB: " + this.DOB);
        System.out.println("Lecturer_ID: " + this.ID);
        System.out.println("Salary: " + this.salary);
        System.out.println("Phone number: " + this.phone);
        System.out.println("Major: " + this.major);
    }
}
