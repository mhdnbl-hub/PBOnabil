/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quiz1;

/**
 *
 * @author Acer
 */
public class Silinder extends Lingkaran {
    private double tinggi;

    public Silinder() {
        super();
        this.tinggi = 0;
    }
    public Silinder(double r, double t) {
        super(r);
        this.tinggi = t;
    }
    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
    public double getTinggi() {
        return tinggi;
    }
    public double getVolume() {
        return super.getLuas() * tinggi;
    }
    @Override
    public double getLuas(){
        double luasAlas=super.getLuas();
        double keliling=super.getKeliling();
        return 2*luasAlas*keliling*tinggi;
    } 
    @Override    
        public String toString(){
        return "Silinder dengan jari ="+getR()+
                "\n tinggi ="+ tinggi+ 
                "\n volume ="+getVolume()+
                "\n luas permukaan ="+getLuas();
    } 
}