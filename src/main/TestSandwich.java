/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import java.util.Scanner;
/**
 *
 * 
 */
public class TestSandwich {
    public static void main(String[] args) {
    
        Sandwich s1=new Sandwich();
        s1.setIngredient("meat");
        s1.setBread("wheat");
        s1.setPrice(8.90);
        
        System.out.println(s1.getIngredient());
        System.out.println(s1.getBread());
        System.out.println(s1.getPrice());
    }
     
}
