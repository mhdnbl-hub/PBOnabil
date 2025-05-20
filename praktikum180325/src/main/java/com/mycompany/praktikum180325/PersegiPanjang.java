/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikum180325;

/**
 *
 * @author Acer
 */
public class PersegiPanjang {
    public int panjang;
    public int lebar;
    public static int jumlahObjek = 0;
    
    public PersegiPanjang(){
        jumlahObjek++;
    }
    public PersegiPanjang(int pjbaru, int lbbaru){
        panjang = pjbaru;
        lebar = lbbaru;
        jumlahObjek++;
    }
    public static int getJumlahObjek(){
        return jumlahObjek;
    }
    public int getLuas(){
        return panjang*lebar;
    }
    public int getKeliling(){
        return 2*(panjang+lebar);
    }
    
    
}
