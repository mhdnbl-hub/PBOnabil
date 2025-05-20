/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.praktikum180325;

/**
 *
 * @author Acer
 */
import java.util.*;
public class TestVehicleEnkapsulasi {

    public static void main(String[] args) {
        System.out.println("kendaraan 1. beban maksimal 10.000kg");
        VehicleEnkapsulasi kendaraan1= new VehicleEnkapsulasi (10000);
        //menambahkan beban
        System.out.println("menambahkan beban 1 (500kg)"+kendaraan1.addload(500));
        System.out.println("menambahkan beban 2 (250kg)"+kendaraan1.addload(250));
        System.out.println("menambahkan beban 3 (5000kg)"+kendaraan1.addload(5000));
        System.out.println("menambahkan beban 4 (4000kg)"+kendaraan1.addload(4000));
        System.out.println("menambahkan beban 5 (350kg)"+kendaraan1.addload(350));
        
    //menampilkan beban kendaraan saat ini
    System.out.println("beban kendaraan saat ini = " +kendaraan1.getLoad());
    //membuat objek kendaraan 2 dengan konstruktor kosong atau default konstruktor
    Scanner in = new Scanner(System.in);
    System.out.println("kendaraan 2. beban maksimal belum ada");
    VehicleEnkapsulasi kendaraan2 = new VehicleEnkapsulasi();
    
    //set maxLoad menggunakan method setMaxload
    System.out.println("masukkan beban maksimal = ");
    double bebanmax = in.nextDouble();
    kendaraan2.setMaxLoad(bebanmax);
             
    //isi beban pada kendaraan
    System.out.print("masukkan berat beban yang akan diletakkan = ");
    double beban = in.nextDouble();
    while(kendaraan2.addload(beban)){//true
        System.out.println("beban ditambahkan = "+beban+"kg");
        System.out.println("masukkan berat yang akan diletakkan = ");
        beban = in.nextDouble();
    }
    if(!kendaraan2.addload(beban)){//!=not1
        System.out.println("beban kendaraan saat ini = "+kendaraan2.getLoad()+"kg");
        System.out.println("beban akan Berlebih penambahan beban dibatalkan");
    }else
        System.out.println("Beban kendaraan saat ini ="+kendaraan2.getLoad()+"kg");
    System.out.println("beban saat ini = "+kendaraan2.getLoad()+"kg");
    }
    
    
}
