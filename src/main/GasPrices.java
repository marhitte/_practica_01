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
public class GasPrices {
    private Integer price;
    
    public Double obtenerRango1(){
         return this.price*0.035;
     }
     public Double obtenerRango2(){
         return this.price*0.04;
     }
     
    //public void precioFin(){
        
    //}
     
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        GasPrices pricePerBarrel= new GasPrices();
        
        System.out.println("Ingrese el precio del barril de gasolina: ");
        pricePerBarrel.setPrice(teclado.nextInt());
        
        System.out.println("El rango del costo por galon ronda entre $"+pricePerBarrel.obtenerRango1()+"y  "+pricePerBarrel.obtenerRango2());
    }

    /**
     * @return the price
     */
    public Integer getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(Integer price) {
        this.price = price;
    }
    
    
    
}
