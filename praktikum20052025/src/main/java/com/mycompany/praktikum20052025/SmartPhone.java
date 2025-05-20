/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikum20052025;

/**
 *
 * @author Acer
 */
public class SmartPhone extends Elektronik {
    private int kapasitasBaterai;
    private int jumlahKamera;

    public SmartPhone(String merek, int tahunProduksi, int garansi, int kapasitasBaterai, int jumlahKamera) {
        super(merek, tahunProduksi, garansi);
        this.kapasitasBaterai = kapasitasBaterai;
        this.jumlahKamera = jumlahKamera;
    }

    public int getKapasitasBaterai() { return kapasitasBaterai; }
    public int getJumlahKamera() { return jumlahKamera; }
}
