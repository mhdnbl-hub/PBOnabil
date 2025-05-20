/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.praktikum20052025;

/**
 *
 * @author Acer
 */
public class Praktikum20052025 {
    public static void main(String[] args) {
        // Membuat objek tanpa input pengguna, langsung dengan constructor
        SmartPhone smartphone = new SmartPhone("Samsung", 2023, 2, 5000, 3);
        SmartWatch smartwatch = new SmartWatch("Apple", 2024, 1, 400, 0, 1, true);
        Laptop laptop = new Laptop("ASUS", 2023, 2, 15, 16);
        Gaming gamingLaptop = new Gaming("Alienware", 2022, 3, 17, 32, "RTX 4090", 240);

        // Menampilkan informasi setiap objek
        System.out.println("\n--- Informasi Smartphone ---");
        System.out.println("Merek: " + smartphone.getMerek());
        System.out.println("Tahun Produksi: " + smartphone.getTahunProduksi());
        System.out.println("Garansi: " + smartphone.getGaransi() + " tahun");
        System.out.println("Kapasitas Baterai: " + smartphone.getKapasitasBaterai() + " mAh");
        System.out.println("Jumlah Kamera: " + smartphone.getJumlahKamera());

        System.out.println("\n--- Informasi SmartWatch ---");
        System.out.println("Merek: " + smartwatch.getMerek());
        System.out.println("Tahun Produksi: " + smartwatch.getTahunProduksi());
        System.out.println("Garansi: " + smartwatch.getGaransi() + " tahun");
        System.out.println("Kapasitas Baterai: " + smartwatch.getKapasitasBaterai() + " mAh");
        System.out.println("Jumlah Kamera: " + smartwatch.getJumlahKamera());
        System.out.println("Ukuran Layar: " + smartwatch.getUkuranLayar() + " inci");
        System.out.println("Tahan Air: " + (smartwatch.isTahanAir() ? "Ya" : "Tidak"));

        System.out.println("\n--- Informasi Laptop ---");
        System.out.println("Merek: " + laptop.getMerek());
        System.out.println("Tahun Produksi: " + laptop.getTahunProduksi());
        System.out.println("Garansi: " + laptop.getGaransi() + " tahun");
        System.out.println("Ukuran Layar: " + laptop.getUkuranLayar() + " inci");
        System.out.println("Kapasitas RAM: " + laptop.getKapasitasRAM() + " GB");

        System.out.println("\n--- Informasi Gaming Laptop ---");
        System.out.println("Merek: " + gamingLaptop.getMerek());
        System.out.println("Tahun Produksi: " + gamingLaptop.getTahunProduksi());
        System.out.println("Garansi: " + gamingLaptop.getGaransi() + " tahun");
        System.out.println("Ukuran Layar: " + gamingLaptop.getUkuranLayar() + " inci");
        System.out.println("Kapasitas RAM: " + gamingLaptop.getKapasitasRAM() + " GB");
        System.out.println("Kartu Grafis: " + gamingLaptop.getKartuGrafis());
        System.out.println("Refresh Rate: " + gamingLaptop.getRefreshRate() + " Hz");
    }
}