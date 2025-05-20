/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikum180325;

/**
 *
 * @author Acer
 */
public class VehicleEnkapsulasi {
    private double load;
    private double maxLoad;
    
    public VehicleEnkapsulasi(){
    
}
     public VehicleEnkapsulasi(double maxLoad){//konstruktor
        this.maxLoad = maxLoad;
    }
     
    public void setMaxLoad(double maxLoad){
        this.maxLoad = maxLoad;
    } 
    public double getLoad(){
        return load;
    }
    public double getMaxLoad(){
        return maxLoad;
    }
    public boolean addload(double weight){
        if((load+weight)<=maxLoad){
            this.load=this.load+weight;
            return true;
        }else //(load+weight)>maxLoad
            return false;
        //end if
    }
    
}
    
