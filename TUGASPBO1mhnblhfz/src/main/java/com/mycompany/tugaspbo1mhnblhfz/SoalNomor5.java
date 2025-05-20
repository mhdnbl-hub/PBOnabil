/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugaspbo1mhnblhfz;

/**
 *
 * @author Acer
 */
import java.util.Scanner;

public class SoalNomor5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Harga per kotak untuk tiap merek
        int hargaX = 40000;
        int hargaY = 50000;
        int hargaZ = 60000;

        // Menampilkan harga tiap merek
        System.out.println("--- Harga Tiap Merek Susu ---");
        System.out.println("Merek X: Rp. 40,000 per kotak");
        System.out.println("Merek Y: Rp. 50,000 per kotak");
        System.out.println("Merek Z: Rp. 60,000 per kotak");
        System.out.println();

        // Input jumlah pembelian untuk tiap merek
        System.out.print("Masukkan jumlah kotak susu merek X: ");
        int jumlahX = scanner.nextInt();

        System.out.print("Masukkan jumlah kotak susu merek Y: ");
        int jumlahY = scanner.nextInt();

        System.out.print("Masukkan jumlah kotak susu merek Z: ");
        int jumlahZ = scanner.nextInt();

        // Menghitung total harga tanpa diskon
        int totalX = hargaX * jumlahX;
        int totalY = hargaY * jumlahY;
        int totalZ = hargaZ * jumlahZ;

        // Menghitung diskon
        double diskonX = (jumlahX >= 3) ? totalX * 0.10 : 0;
        double diskonY = (jumlahY > 3) ? totalY * 0.12 : 0;
        double diskonZ = 0;
        if (jumlahZ > 1) {
            diskonZ = hargaZ * 0.15 * (jumlahZ - 1); // Diskon untuk kotak kedua dan seterusnya
        }

        // Menghitung total diskon
        double totalDiskon = diskonX + diskonY + diskonZ;

        // Menghitung total pembayaran setelah diskon
        double totalPembayaran = (totalX + totalY + totalZ) - totalDiskon;

        // Output rincian
        System.out.println("\n--- Rincian Pembelian ---");
        System.out.printf("Total tanpa diskon: Rp. %,d\n", (totalX + totalY + totalZ));
        System.out.printf("Diskon merek X: Rp. %.2f\n", diskonX);
        System.out.printf("Diskon merek Y: Rp. %.2f\n", diskonY);
        System.out.printf("Diskon merek Z: Rp. %.2f\n", diskonZ);
        System.out.printf("Total diskon: Rp. %.2f\n", totalDiskon);
        System.out.printf("Total pembayaran: Rp. %.2f\n", totalPembayaran);

        scanner.close();
    }
}

