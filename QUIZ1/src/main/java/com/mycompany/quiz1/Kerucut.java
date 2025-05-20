/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quiz1;

/**
 *
 * @author Acer
 */
public class Kerucut extends Lingkaran {
    public double tinggi;
    public Kerucut() {
        super();
        this.tinggi = 0;
    }
    public Kerucut(double r, double t) {
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
        return (1.0 / 3) * super.getLuas() * tinggi;
    }
    @Override
    public double getLuas() {
        double r = getR();
        double s = Math.sqrt(r * r + tinggi * tinggi);
        double luasAlas = super.getLuas();
        double luasSelimut = 3.14 * r * s;
        return luasAlas + luasSelimut;
    }
    @Override
    public String toString() {
        return "Kerucut dengan jari-jari = " + getR()+
               "\n tinggi = " + tinggi +
               "\n volume = " + getVolume() +
               "\n luas permukaan = " + getLuas();
    }
}