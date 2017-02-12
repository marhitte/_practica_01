/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class MetricConversion {
 private Integer val;
 
 public void inchToCentimter(Integer v1){
     Double cent;
     this.val=v1;
     cent=this.val*2.54;
     System.out.println(this.val+" en pulgadas equivale a "+cent+" centimetros");
 }
  
 public void gallonToLiters(Integer v1){
    Double cent;
     this.val=v1;
     cent=this.val*(3.7854);
     System.out.println(this.val+" en galones equivale a "+cent+" litros");
 }
    
 public Integer getVal(){
     return val;
 }
 
 public void setVal(Integer v){
     val=v;
 }
 
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        MetricConversion v1=new MetricConversion();
        MetricConversion vf=new MetricConversion();
        
        System.out.println("Ingrese un valor: ");
        v1.setVal(teclado.nextInt());
        vf.inchToCentimter(v1.getVal());
        vf.gallonToLiters(v1.getVal());
    }
    
}
