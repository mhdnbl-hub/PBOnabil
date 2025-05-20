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

public class SoalNomor4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta input dari pengguna
        System.out.print("Masukkan angka: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0) {
                    System.out.print("0 ");
                } else if (j == 0) {
                    System.out.print("0 ");
                } else if (j == i) {
                    System.out.print("0 ");
                } else if (j < i) {
                    System.out.print("* ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
        scanner.close();
    }
}

