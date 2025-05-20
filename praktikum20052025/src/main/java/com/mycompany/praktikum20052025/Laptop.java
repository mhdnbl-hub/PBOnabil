/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikum20052025;

/**
 *
 * @author Acer
 */
public class Laptop extends Elektronik {
    private int ukuranLayar;
    private int kapasitasRAM;

    public Laptop(String merek, int tahunProduksi, int garansi, int ukuranLayar, int kapasitasRAM) {
        super(merek, tahunProduksi, garansi);
        this.ukuranLayar = ukuranLayar;
        this.kapasitasRAM = kapasitasRAM;
    }

    public int getUkuranLayar() { return ukuranLayar; }
    public int getKapasitasRAM() { return kapasitasRAM; }
}