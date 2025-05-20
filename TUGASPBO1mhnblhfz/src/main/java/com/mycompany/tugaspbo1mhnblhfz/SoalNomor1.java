/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugaspbo1mhnblhfz;

/**
 *
 * @author Acer
 */

    import java.util.*;

// Program utama yang hanya menjalankan soal nomor 1: Permutasi dan Kombinasi
public class SoalNomor1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("1. Permutasi dan Kombinasi");
        
        System.out.print("Masukkan dua angka: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        
        System.out.println("Permutasi: " + permutasi(a, b));
        System.out.println("Kombinasi: " + kombinasi(a, b));
    }
    
    // Fungsi tambahan untuk Permutasi dan Kombinasi
    static int faktorial(int n) {
        return (n == 0) ? 1 : n * faktorial(n - 1);
    }
    
    static int permutasi(int n, int r) {
        return faktorial(n) / faktorial(n - r);
    }
    
    static int kombinasi(int n, int r) {
        return permutasi(n, r) / faktorial(r);
    }
}


