/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author pc
 */
public class Percentages {
    private Double val1;
    private Double val2;
    
    
    public void computePercent(Double v1, Double v2){
        Double percent;
        this.val1=v1;
        this.val2=v2;
        percent=(this.val1*100)/this.val2;
        System.out.println(this.val1+" is "+percent+"% of "+this.val2);
    }
    
    public static void main(String[] args) {
        Percentages v1=new Percentages();
        Percentages v2=new Percentages();
        Percentages vf=new Percentages();
        
       v1.setVal1(2.0);
       v2.setVal2(5.0);
       vf.computePercent(v1.getVal1(),v2.getVal2());
       
    }

    /**
     * @return the val1
     */
    public Double getVal1() {
        return val1;
    }

    /**
     * @param val1 the val1 to set
     */
    public void setVal1(Double val1) {
        this.val1 = val1;
    }

    /**
     * @return the val2
     */
    public Double getVal2() {
        return val2;
    }

    /**
     * @param val2 the val2 to set
     */
    public void setVal2(Double val2) {
        this.val2 = val2;
    }
    
    
}
