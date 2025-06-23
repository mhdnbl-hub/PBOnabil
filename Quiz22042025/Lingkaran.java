/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Quiz22042025;

/**
 *
 * @author ARKAN_AUVA
 */
public class Lingkaran {
    private double r;
    
    public Lingkaran(double r){
        this.r = r;
    }
    public Lingkaran(){
        
    }
    public double getR(){
        return this.r;
    }
    public double getDiameter(){
        return 2;
    }
    public double getKeliling(){
        return 2 * Math.PI * r;
    }
    public void setR(double r){
        this.r = r;
    }
    public double getLuas(){
        return Math.PI *r *r;
    }
    @Override
    public String toString(){
        return "Lingkaran memiliki jari-jari : "+r;
    }
}
