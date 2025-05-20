/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikum20052025;

/**
 *
 * @author Acer
 */
public class Elektronik {
    private String merek;
    private int tahunProduksi;
    private int garansi;

    public Elektronik(String merek, int tahunProduksi, int garansi) {
        this.merek = merek;
        this.tahunProduksi = tahunProduksi;
        this.garansi = garansi;
    }

    public String getMerek() { return merek; }
    public int getTahunProduksi() { return tahunProduksi; }
    public int getGaransi() { return garansi; }
}


