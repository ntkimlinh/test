/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab02_2011060554_linh;

/**
 *
 * @author ASUS
 */
public class JDate {
    private int day;
    private int month;
    private int year;
    
    public JDate(){
        this.day = 15;
        this.month = 11;
        this.year = 2002;
    }
    
    public JDate(int JD,int JM,int JY){
        this.day = JD;
        this.month = JM;
        this.year = JY;
    }
    
     public int GetNum(){
        return this.day;
    }
    public void SetNum(int JD){
        this.day = JD;
    }
    
    public int GetDemo(){
        return this.month;
    }
    public void SetDemo(int JM){
        this.month = JM;
    }
    
    public int GetYear(){
        return this.year;
    }
    public void SetYear(int JY){
        this.year = JY;
    }
    public void InputDate(int JD,int JM,int JY){
        this.day = JD;
        this.month = JM;
        this.year = JY;
    }
    
    public void OutputDate(){
        System.out.println(this.day + "/" + this.month + "/"  + this.year);
    }  
    //checkDate
    public int CheckDate () {
        if (this.month > 12 || this.month < 1 || this.day < 0) {
            return 0;
        }
        if (this.day > this.TinhSoNgayTrongThang()) {
            return 0;
        }
        return 1;
    }
    //compare two date
    public String Compare(JDate a) {
        if (this.year > a.year) {
            return ">";
        }
        if (this.year < a.year) {
            return "<";
        }
        if (this.month > a.month) {
            return ">";
        }
        if (this.month < a.month) {
            return "<";
        }
        if (this.day > a.day) {
            return ">";
        }
        if (this.day < a.day) {
            return "<";
        }
        return "=";
    }
    public int TinhSoNgayTrongThang() {
        if (this.month == 1 || this.month == 3 || 
                this.month == 5 || this.month == 7 ||
                this.month == 8 || this.month == 10 || 
                this.month == 12) {
            return 31;
        }
        if (this.month == 2) {
            if (this.year % 4 == 0 && this.year % 100 == 0) {
                return 29;
            } else {
                return 28;
            }
        }
        return 30;
    }
      //Find next date
    public JDate Nextdate() {
        JDate kt = new JDate();
        kt.day = this.day + 1;
        kt.month = this.month;
        kt.year = this.year;
        if (kt.day > this.TinhSoNgayTrongThang()) {
            kt.day = 1;
            kt.month = this.month + 1;
            if (kt.month > 12) {
                kt.month = 1;
                kt.year = this.year + 1;
            }
        }
        return kt;
    }

    boolean CheckDate(JDate JD) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
