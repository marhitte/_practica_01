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
public class ArithmeticMethods2 {
    private Integer num;

    public Integer displayNumberPlus10(){
        return getNum()+10;
    }
    public Integer displayNumberPlus100(){
        return getNum()+100;
    }
    public Integer displayNumberPlus1000(){
        return getNum()+1000;
    }
    
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        ArithmeticMethods num1=new ArithmeticMethods();
        ArithmeticMethods num2=new ArithmeticMethods();
        
        System.out.println("Ingrese el primer número: ");
        num1.setNum(teclado.nextInt());
        System.out.println("Ingrese el segundo número: ");
        num2.setNum(teclado.nextInt());
        
        System.out.println(num1.displayNumberPlus10()+","+ num1.displayNumberPlus100()+","+num1.displayNumberPlus1000());
        System.out.println(num2.displayNumberPlus10()+","+ num2.displayNumberPlus100()+","+num2.displayNumberPlus1000());
    }

    /**
     * @return the num
     */
    public Integer getNum() {
        return num;
    }

    /**
     * @param num the num to set
     */
    public void setNum(Integer num) {
        this.num = num;
    }
    
    
    
}
