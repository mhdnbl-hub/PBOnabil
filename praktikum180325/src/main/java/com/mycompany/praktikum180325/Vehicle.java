/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikum180325;

/**
 *
 * @author Acer
 */
public class Vehicle {
    public double load;
    public double maxLoad;
    public Vehicle(double maxLoad){//konstruktor
        this.maxLoad = maxLoad;
    }
    public double getLoad(){
        return load;
    }
    public double getMaxLoad(){
        return maxLoad;
    }
    
}
