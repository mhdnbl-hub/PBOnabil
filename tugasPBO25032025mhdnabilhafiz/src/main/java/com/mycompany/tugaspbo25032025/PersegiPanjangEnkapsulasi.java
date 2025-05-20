/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugaspbo25032025;

/**
 *
 * @author Acer
 */
public class PersegiPanjangEnkapsulasi {
    private int panjang;
    private int lebar;
    private static int jumlahObjek = 0 ;
    
//konstruktor default
    public PersegiPanjangEnkapsulasi(){
        this.panjang=0;
        this.lebar=0;
        jumlahObjek++;
    }
//konstruktor dengan parameter
    public PersegiPanjangEnkapsulasi(int panjangBaru, int lebarBaru){
        this.panjang=panjangBaru;
        this.panjang=panjangBaru;
        jumlahObjek++;
    }
//setter dan getter untuk panjang
    public void setPanjang(int panjangBaru){
        this.panjang=panjangBaru;
    }
    public int getPanjang(){
        return panjang;
    }
//setter dan getter untuk lebar
    public void setLebar(int lebarBaru){
        this.lebar=lebarBaru;
    }
    public int getLebar(){
        return lebar;
    }
//getter untuk jumlah objek 
    public static int getJumlahObjek(){
        return jumlahObjek;
    }
//method untuk menghitung luas
    public int getLuas(){
        return panjang * lebar;
    }
//method untuk menghitung keliling
    public int getKeliling(){
        return 2*(panjang+lebar);
    }
    
}
