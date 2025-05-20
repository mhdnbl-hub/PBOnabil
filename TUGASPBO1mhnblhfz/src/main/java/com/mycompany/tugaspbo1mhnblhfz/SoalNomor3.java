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

// Program utama yang berisi 6 pilihan operasi pada matriks
public class SoalNomor3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int n, m;
        
        System.out.print("Masukkan jumlah baris matriks: ");
        n = scanner.nextInt();
        System.out.print("Masukkan jumlah kolom matriks: ");
        m = scanner.nextInt();
        
        int[][] A = new int[n][m];
        int[][] B = new int[n][m];
        int[][] C = new int[n][m];
        
        // Mengisi matriks A dengan angka acak
        System.out.println("Matriks A:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                A[i][j] = random.nextInt(100);
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
        
        // Mengisi matriks B dengan angka acak
        System.out.println("Matriks B:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                B[i][j] = random.nextInt(100);
                System.out.print(B[i][j] + " ");
            }
            System.out.println();
        }
        
        while (true) {
            System.out.println("\nPilih operasi yang ingin dilakukan:");
            System.out.println("1. Penjumlahan Matriks");
            System.out.println("2. Pengurangan Matriks");
            System.out.println("3. Perkalian Matriks");
            System.out.println("4. Identitas Matriks");
            System.out.println("5. Transpose Matriks");
            System.out.println("6. Keluar");
            System.out.print("Masukkan pilihan: ");
            int pilihan = scanner.nextInt();
            
            if (pilihan == 6) {
                System.out.println("Program selesai.");
                break;
            }
            
            switch (pilihan) {
                case 1:
                    System.out.println("Hasil Penjumlahan Matriks A + B:");
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < m; j++) {
                            C[i][j] = A[i][j] + B[i][j];
                            System.out.print(C[i][j] + " ");
                        }
                        System.out.println();
                    }
                    break;
                
                case 2:
                    System.out.println("Hasil Pengurangan Matriks A - B:");
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < m; j++) {
                            C[i][j] = A[i][j] - B[i][j];
                            System.out.print(C[i][j] + " ");
                        }
                        System.out.println();
                    }
                    break;
                
                case 3:
                    System.out.println("Hasil Perkalian Matriks A * B:");
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < m; j++) {
                            C[i][j] = 0;
                            for (int k = 0; k < m; k++) {
                                C[i][j] += A[i][k] * B[k][j];
                            }
                            System.out.print(C[i][j] + " ");
                        }
                        System.out.println();
                    }
                    break;
                
                case 4:
                    System.out.println("Matriks Identitas:");
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < m; j++) {
                            if (i == j) {
                                System.out.print("1 ");
                            } else {
                                System.out.print("0 ");
                            }
                        }
                        System.out.println();
                    }
                    break;
                
                case 5:
                    System.out.println("Transpose Matriks A:");
                    for (int i = 0; i < m; i++) {
                        for (int j = 0; j < n; j++) {
                            System.out.print(A[j][i] + " ");
                        }
                        System.out.println();
                    }
                    break;
                
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
    }
}

