/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author victorhugo
 */
public class Student {
    private String idnumber;
    private Integer credhours;
    private Integer points;
    
     public String getIdnumber(){
        return idnumber; 
    }
    
    public void setIdnumber(String num){
        this.idnumber=num;
    }
    
     public Integer getCredhours(){
        return credhours; 
    }
    
    public void setCredhours(Integer cred){
        this.credhours=cred;
    }
    
     public Integer getPoints(){
        return points; 
    }
    
    public void setPoints(Integer punt){
        this.points=punt;
    }
    
   public Integer gradepa(){
       return points/credhours;
   }
    
}
