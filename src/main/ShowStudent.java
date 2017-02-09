/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * 
 */
public class ShowStudent {
    public static void main(String[] args) {
        Student stud=new Student();
        stud.setIdnumber("32452");
        stud.setCredhours(10);
        stud.setPoints(20);
        stud.gradepa();
        
        System.out.println("ID:"+stud.getIdnumber());
        System.out.println("Credit hours earned: "+stud.getCredhours());
        System.out.println("Points earned: "+stud.getPoints());
        System.out.println("The Grade Point Average is: "+stud.gradepa());
    }
}
