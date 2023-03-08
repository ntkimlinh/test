/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab02_2011060554_linh;

/**
 *
 * @author ASUS
 */
public class Pupil {
    private int code;
    private String name;
    private float MathMark;
    private float PhyMark;
    private float ChemMark;
    
    public Pupil(){
        this.code=2011060554;
        this.name="Nguyen Thi Kim Linh";
        this.MathMark = 7;
        this.PhyMark = (float) 9.5;
        this.ChemMark= 9;
    }
    public Pupil (int Pcode,String Pname,float Pmath,float Pphy,float Pchem){
        this.code=Pcode;
        this.name=Pname;
        this.MathMark=Pmath;
        this.PhyMark=Pphy;
        this.ChemMark=Pchem;
    }

     public int Getcode(){
        return this.code;
    }
    public void Setcode(int Pcode){
        this.code=Pcode;
    }
     public float Getmath(){
        return this.MathMark;
    }
    public void Setmath(int Pmath){
        this.MathMark=Pmath;
    }
    public float Getphy(){
        return this.PhyMark;
    }
    public void Setphy(int Pphy){
        this.PhyMark=Pphy;
    }   
    public float Getchem(){
        return this.ChemMark;
    }
    public void Setchem(int Pchem){
        this.ChemMark=Pchem;
    }   
     
    public void InputPupil( int Pcode,String Pname,float Pmath,float Pphy,float Pchem){
        this.code=Pcode;
        this.name=Pname;
        this.MathMark=Pmath;
        this.PhyMark=Pphy;
        this.ChemMark=Pchem;
    }
    
    public void OutputPupil(){
        System.out.println("code: "+this.code+"\n"+"Name: "+this.name+"\n"+"Math: "+this.MathMark+"\n"+"Phy: "+PhyMark+"\n"+"CheM: "+ ChemMark);
    
    //avg
    
        System.out.println("Average of mark= "+(MathMark+PhyMark+ChemMark)/3);
    }
}
