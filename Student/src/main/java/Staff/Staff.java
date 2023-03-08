package Staff;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Staff {
    String name;
    String ID;
    String DOB;
    String sectionID;
    String salary;
    String phone;
    String daysoff;
    
    void inputStaff() throws IOException{
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input name: ");        
        this.name = reader.readLine();
        System.out.println("Input DOB: ");        
        this.DOB = reader.readLine();
        System.out.println("Input Staff ID: ");        
        this.ID = reader.readLine();
        System.out.println("Input section ID: ");        
        this.sectionID = reader.readLine();
        System.out.println("Input salary: ");        
        this.salary = reader.readLine();
        System.out.println("Input phone number: ");        
        this.phone = reader.readLine();
        System.out.println("Input days off: ");        
        this.daysoff = reader.readLine();
    }
    void outputStaff(){
        System.out.println( "Name: " + this.name);
        System.out.println("DOB: " + this.DOB);
        System.out.println("Staff_ID: " + this.ID);
        System.out.println("Salary: " + this.salary);
        System.out.println("Section ID: " + this.sectionID);
        System.out.println("Phone number: " + this.phone);
        System.out.println("Days off: " + this.daysoff);
    }
}
