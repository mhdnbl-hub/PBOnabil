/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.praktek15042025;

/**
 *
 * @author Acer
 */
public class pesawatdemo {
    public static void main(String[] args) {
        pesawat p = new pesawat("Lion Air",2010,true,120);
        p.cetak();
        
        System.out.println("Setelah reset");
        p.reset("Airbus",2020,false,200);
        p.cetak();
        
   
    }
    
}
