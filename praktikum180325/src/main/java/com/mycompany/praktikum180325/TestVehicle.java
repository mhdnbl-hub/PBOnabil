/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.praktikum180325;

/**
 *
 * @author Acer
 */
public class TestVehicle {
    public static void main(String[] args) {
        //buat dengan beban maksimal 10000kg
        System.out.println("kendaraan 1. beban maksimal 1");
        Vehicle kendaraan1= new Vehicle(10000);
        
        
        //menambahkan beberaapa beban (load)
        System.out.println("menambahkan beban 1 (500kg)");
        kendaraan1.load = kendaraan1.load + 500;
        //menambahkan beberaapa beban (load)
        System.out.println("menambahkan beban 2 (250kg)");
        kendaraan1.load=kendaraan1.load + 250;
        //menambahkan beberaapa beban (load)
        System.out.println("menambahkan beban 3 (5000kg)");
        kendaraan1.load=kendaraan1.load + 5000;
        //menambahkan beberaapa beban (load)
        System.out.println("menambahkan beban 4 (4000kg)");
        kendaraan1.load=kendaraan1.load + 4000;
        //menambahkan beberaapa beban (load)
        System.out.println("menambahkan beban 5 (350kg)");
        kendaraan1.load=kendaraan1.load + 350;
        
        System.out.println("beban kendaraan saat ini " +kendaraan1.getLoad()+"kg");
        
    }
    
}
