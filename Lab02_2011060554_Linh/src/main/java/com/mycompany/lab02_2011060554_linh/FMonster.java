/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab02_2011060554_linh;

/**
 *
 * @author ASUS
 */
public class FMonster {
    private int x;
    private int y;
    private int Blood;
    
    public FMonster(){
        this.x=25;
        this.y=19;
        this.Blood=100;
    } 
    
    public FMonster(int Fx, int Fy, int FBlood){
        this.x=Fx;
        this.y=Fy;
        this.Blood=FBlood;
    }
    public int GetX(){
        return this.x;
    }       
    public void SetX(int Fx){
        this.x=Fx;
    }
    public int GetY(){
        return this.y;
    }       
    public void SetY(int Fy){
        this.x=Fy;
    }
    public int GetBlood(){
        return this.Blood;
    }       
    public void SetBlood(int FBlood){
        this.Blood=FBlood;
    }
    public void InputFMonster(int Fx, int Fy, int FBlood)
    {
        this.x=Fx;
        this.y=Fy;
        this.Blood=FBlood;
    }
    public void Output(){
        System.out.println("X: "+this.x+"\nY: "+this.y+"\nBlood: "+this.Blood+"%");
    }
}
