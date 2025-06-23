/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Quiz22042025;

/**
 *
 * @author ARKAN_AUVA   
 */
public class Silinder extends Lingkaran{
    private double tinggi;
    
    public Silinder(){
        super();
    }
    public Silinder(double r, double t){
        super(r);
        this.tinggi = t;
    } 
    public void setTinggi(double Tinggi){
        this.tinggi = tinggi;
    }
    public double getTinggi(){
        return tinggi;
    }
    public double getVolume(){
        double r = getR();
        double h = getTinggi();
        return getLuas() *r*r*h;
    }
    @Override
    public double getLuas(){
        return 2 * Math.PI * super.getR() * super.getLuas()*tinggi;
    }
    @Override
    public String toString(){
        return "Silinder memiliki jari-jari : "+super.getR()+ " dan tinggi : "+tinggi;
    }
}
