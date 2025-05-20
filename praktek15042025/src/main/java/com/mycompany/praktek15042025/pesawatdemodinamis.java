/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.praktek15042025;

/**
 *
 * @author Acer
 */
import java.util.Scanner;
public class pesawatdemodinamis {  
    public static int max(int a, int b){
        if(a>b)
            return b;
        else
            return a;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i, jumlah,tahunProduksi,muatan;
        boolean mesin;
        int besar;///untuk menampung pesawat muatan besar
        String nama;
        String namamax;//pesawat dengan muatan maxsimal
        System.out.print("masukkan banyak pesawat =");
        jumlah=input.nextInt();
        input.nextLine();
        //deklarasi array
        pesawat[] daftarpesawat=new pesawat[jumlah];
        //isi array
        for(i=0;i<jumlah;i++){
            System.out.println("input pesawat ke "+(i+i) );
            System.out.println("nama pesawat =");
            nama=input.nextLine();
            System.out.println("tahun produksi =");
            tahunProduksi=input.nextInt();
            System.out.print("menggunakan mesin ? (true/false) ");
            mesin=input.nextBoolean();
            System.out.print("kapasitas muatan penumpang");
            muatan=input.nextInt();
        }
        }
}

