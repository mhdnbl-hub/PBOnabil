/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktek15042025;

/**
 *
 * @author Acer
 */
public class hewandemo {
    public static void main(String[]args){
        ///buat objek
        hewan hewanumum = new hewan("mahluk hidup");
        kucing kucingku = new kucing("Anto");
        anjing anjingku = new anjing("IVAN");
        
        hewanumum.tampilkanNama();
        hewanumum.Suara();
        
        System.out.println();
        kucingku.tampilkanNama();
        kucingku.Suara();
        System.out.println();
        anjingku.tampilkanNama();
        anjingku.Suara();
        
    }
    
}
