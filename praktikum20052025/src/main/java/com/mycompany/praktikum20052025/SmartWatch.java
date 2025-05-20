/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikum20052025;

/**
 *
 * @author Acer
 */
public class SmartWatch extends SmartPhone {
    private int ukuranLayar;
    private boolean tahanAir;

    public SmartWatch(String merek, int tahunProduksi, int garansi, int kapasitasBaterai, int jumlahKamera, int ukuranLayar, boolean tahanAir) {
        super(merek, tahunProduksi, garansi, kapasitasBaterai, jumlahKamera);
        this.ukuranLayar = ukuranLayar;
        this.tahanAir = tahanAir;
    }

    public int getUkuranLayar() { return ukuranLayar; }
    public boolean isTahanAir() { return tahanAir; }
}