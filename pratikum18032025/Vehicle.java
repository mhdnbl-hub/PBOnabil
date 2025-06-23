/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pratikum18032025;

/**
 *
 * @author ARKAN_AUVA
 */
public class Vehicle {
    public double load;
    public double maxLoad;
    
    public Vehicle (double maxLoad){  //konstruktor
        this.maxLoad = maxLoad;
    }
    public double getLoad(){
        return load;
    }
    public double getMaxLoad(){
        return maxLoad;
    }
}
