/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab02_2011060554_linh;

/**
 *
 * @author ASUS
 */
public class JFraction {
    private int Numerator;
    private int Denominator;
    
    public JFraction(){
        this.Numerator = 0;
        this.Denominator = 1;
    }
    
    public JFraction(int pNum, int pDe){
        this.Numerator = pNum;
        this.Denominator = pDe;
    }
    
    public int GetNum(){
        return this.Numerator;
    }
    public void SetNum(int pNum){
        this.Numerator = pNum;
    }
    
    public int GetDemo(){
        return this.Denominator;
    }
    public void SetDemo(int pDe){
        this.Denominator = pDe;
    }
    
    public void InputFrac(int pNum,int pDe){
        this.Numerator = pNum;
        this.Denominator = pDe;
    }
    
    public void OutputFrac(){
        System.out.println(this.Numerator + "/" + this.Denominator);
    }
    public JFraction AddFrac(JFraction PS){
        JFraction PS2 = new JFraction();
        
        PS2.Numerator = PS2.Numerator * PS.Denominator + PS.Numerator * PS2.Denominator;
        PS2.Denominator = PS2.Denominator * PS.Numerator;
        
        return PS2;
    }
    
     public JFraction MultiFrac(JFraction PS){
        JFraction PS3 = new JFraction();
        PS3.Numerator= this.Numerator * PS.Numerator; 
        PS3.Denominator = this.Denominator * PS.Denominator;
        
        return PS3;
    }
   
    public JFraction SubtractFrac(JFraction PS) {
        JFraction PS4 = new JFraction();
        PS4.Numerator = PS4.Numerator * PS.Denominator - PS.Denominator * PS4.Denominator;
        PS4.Denominator = PS4.Denominator * PS.Denominator;
        return PS4;
    }
    
    public JFraction DivideFrac(JFraction PS){
        JFraction PS5 = new JFraction();
        
        PS5.Numerator = this.Numerator * PS.Denominator; 
        PS5.Denominator = this.Denominator * PS.Numerator;
        
        return PS5;
    }
}
