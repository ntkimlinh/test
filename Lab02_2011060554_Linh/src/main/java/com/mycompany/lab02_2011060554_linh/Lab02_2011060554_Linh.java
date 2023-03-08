/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lab02_2011060554_linh;

/**
 *
 * @author ASUS
 */
public class Lab02_2011060554_Linh {

    public static void main(String[] args) {
        
        //lab02_JFraction
        JFraction PS= new JFraction(9,4);
        PS.OutputFrac();
        JFraction PS1= new JFraction(4,5);
        PS1.OutputFrac();
        
        
        JFraction PS2 = new JFraction();
        PS2 = PS2.AddFrac(PS);
        System.out.println("Add: ");
        PS2.OutputFrac();
        
        JFraction PS3 = new JFraction();
        PS3 = PS3.SubtractFrac(PS);
        System.out.println("Sub: ");
        PS3.OutputFrac();
        
        JFraction PS4 = new JFraction();
        PS4 = PS4.MultiFrac(PS);
        System.out.println("Multi: ");
        PS4.OutputFrac();
        
        
        JFraction PS5 = new JFraction();
        PS5 = PS5.DivideFrac(PS);
        System.out.println("Div: ");
        PS5.OutputFrac();

        //lab02_JDate 
        
//        System.out.print("Date 1: ");
//        JDate JD= new JDate();
//        JD.OutputDate();
//        System.out.print("Date 2: ");
//        JDate JD1= new JDate(17,04,1985);
//        JD1.OutputDate();
//        
//        System.out.println("Compare two date: ");
//        if(null != JD1.Compare(JD))switch (JD1.Compare(JD)) {
//            case "<" -> System.out.println("Date2 < Date1");
//            case ">" -> System.out.println("Date2 > Date1");
//            case "=" -> System.out.println("Date2 = Date1");
//            default -> {
//            }
//        }
        
//        System.out.println("The next date of Date2: ");
//        JDate date3;
//        date3 = JD1.Nextdate();
//        date3.OutputDate();
//        
//        //lab02_Pupil
//        Pupil PP= new Pupil();
//        PP.OutputPupil();
//
//        //lab02_FMonster
//        FMonster FM= new FMonster();
//        FM.Output();
        
        
   }    
}
