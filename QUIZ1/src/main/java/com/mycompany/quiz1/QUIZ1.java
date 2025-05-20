/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.quiz1;


import java.util.Scanner;

public class QUIZ1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //buat lingkaran
        System.out.print("Masukkan jari-jari lingkaran: ");
        double rLingkaran = in.nextDouble();
        Lingkaran lingkaran = new Lingkaran(rLingkaran);
        System.out.println(lingkaran);
        System.out.println("Diameter: " + lingkaran.getDiameter());
        System.out.println("Keliling: " + lingkaran.getKeliling());
        System.out.println("Luas: " + lingkaran.getLuas());
        System.out.println("\n---");
        
        //buat kerucut
        System.out.print("Masukkan jari-jari kerucut: ");
        double rKerucut = in.nextDouble();
        System.out.print("Masukkan tinggi kerucut: ");
        double tKerucut = in.nextDouble();
        Kerucut kerucut = new Kerucut(rKerucut, tKerucut);
        System.out.println(kerucut);
        
        System.out.println("\n---");
        
        //buat silinder 
        System.out.print("masukkan jari jari silinder :");
        double rSilinder=in.nextDouble();
        System.out.print("masukkan tinggi silinder : ");
        double tSilinder=in.nextDouble();
        Silinder silinder = new Silinder(rSilinder,tSilinder);
        System.out.println(silinder);
        System.out.println("\n---");
    }
}