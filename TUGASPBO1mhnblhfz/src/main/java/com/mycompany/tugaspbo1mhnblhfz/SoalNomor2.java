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

// Program utama yang hanya menjalankan soal nomor 2: Menggabungkan Dua Array dengan nilai acak
public class SoalNomor2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int n, m;
        
        System.out.println("2. Gabung Array");
        
        System.out.print("Masukkan ukuran array A: ");
        n = scanner.nextInt();
        int[] A = new int[n];
        
        System.out.print("Masukkan ukuran array B: ");
        m = scanner.nextInt();
        int[] B = new int[m];
        
        // Mengisi array A dengan angka acak
        System.out.print("Array A: ");
        for (int i = 0; i < n; i++) {
            A[i] = random.nextInt(100); // Nilai acak 0-99
            System.out.print(A[i] + " ");
        }
        System.out.println();
        
        // Mengisi array B dengan angka acak
        System.out.print("Array B: ");
        for (int i = 0; i < m; i++) {
            B[i] = random.nextInt(100);
            System.out.print(B[i] + " ");
        }
        System.out.println();
        
        // Menggabungkan array A dan B ke dalam C
        int[] C = new int[n + m];
        for (int i = 0; i < n; i++) {
            C[i] = A[i];
        }
        for (int i = 0; i < m; i++) {
            C[n + i] = B[i];
        }
        
        System.out.print("Array hasil gabungan: ");
        for (int i = 0; i < C.length; i++) {
            System.out.print(C[i] + " ");
        }
    }
}
