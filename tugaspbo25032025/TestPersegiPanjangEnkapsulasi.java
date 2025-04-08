/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.tugaspbo25032025;

/**
 *
 * @author Acer
 */
import java.util.Scanner;

public class TestPersegiPanjangEnkapsulasi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner untuk input pengguna

        System.out.print("Masukkan panjang: ");
        int panjangInput = scanner.nextInt();

        System.out.print("Masukkan lebar: ");
        int lebarInput = scanner.nextInt();

        // Membuat objek PersegiPanjang dengan input pengguna
        PersegiPanjangEnkapsulasi persegiPanjang = new PersegiPanjangEnkapsulasi();
        persegiPanjang.setPanjang(panjangInput); // Mengatur panjang
        persegiPanjang.setLebar(lebarInput);    // Mengatur lebar

        // Menampilkan hasil
        System.out.println("\nDetail Persegi Panjang:");
        System.out.println("Panjang: " + persegiPanjang.getPanjang());
        System.out.println("Lebar: " + persegiPanjang.getLebar());
        System.out.println("Luas: " + persegiPanjang.getLuas());
        System.out.println("Keliling: " + persegiPanjang.getKeliling());

        // Menampilkan jumlah objek
        System.out.println("\nJumlah Objek yang Dibuat: " + PersegiPanjangEnkapsulasi.getJumlahObjek());

        scanner.close();
    }
}