/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktek15042025;

/**
 *
 * @author Acer
 */
public class udara extends kendaraan {
    private boolean mesin;
    
    public udara(){
        
    }
    public udara(String nama, int tahunProduksi, boolean mesin,int muatan){
        super(nama,tahunProduksi);
        this.mesin=mesin;
    }
    public boolean getMesin(){
        return mesin;
        
    }
    public void setMesin(boolean mesin){
        this.mesin=mesin;
    }
    @Override
    public void cetak(){
        super.cetak();
        System.out.println("menggunakan mesin: "+(mesin?"ya":"tidak"));
        
    }
    public double getLuas() {
        return 3.14 * r * r;
    }
    @Override
    public String toString() {
        return "Lingkaran dengan jari-jari = " + r;
    }
}

