/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.praktikum180325;

/**
 *
 * @author Acer
 */
public class TestPersegiPanjang {
    public static void main(String[] args) {
        System.out.println("banyak objek saat ini = "+PersegiPanjang.getJumlahObjek());
        //buat objek pertama
        PersegiPanjang pp1 = new PersegiPanjang();
        pp1.panjang = 5;
        pp1.lebar = 3;
        System.out.println("banyak objek saat ini = "+PersegiPanjang.getJumlahObjek());
        System.out.println("Luas = "+pp1.panjang+"*"+pp1.lebar+"="+pp1.getLuas());
        
        //buat objek kedua
        PersegiPanjang pp2=new PersegiPanjang(15,4);
        System.out.println("banyak objek stelah pp2 = "+PersegiPanjang.getJumlahObjek());
        System.out.println("keliling = 2*("+pp2.panjang+"+"+pp2.lebar+")="+pp2.getKeliling());
        
    }
    
}
