/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktek15042025;

/**
 *
 * @author Acer
 */
public class kendaraan {
   private String nama;
   private int tahunProduksi;
   
   public kendaraan(){
       
   }
   public kendaraan(String nama,int tahunProduksi){
       this.nama=nama;
       this.tahunProduksi=tahunProduksi;
       
   }
   public String getNama(){
       return nama;
   }
   public void setNama(String nama){
       this.nama=nama;
   }
   public int getTahunProduksi(){
       return tahunProduksi;
       
   }
   public void setTahunProduksi(int tahunProduksi){
       this.tahunProduksi=tahunProduksi;
   }
   public void cetak(){
       System.out.println("nama kendaraan ="+nama);
       System.out.println("tahun produksi ="+tahunProduksi);
   }
}
