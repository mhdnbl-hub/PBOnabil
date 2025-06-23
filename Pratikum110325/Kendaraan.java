/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pratikum110325;

/**
 *
 * @author Arkan Auva
 */
public class Kendaraan {
    String jenis;
    String merk;
    int tahun;
    String warna;
    int kecepatan; 
    
    ///constarctor
    public Kendaraan (String j, String m, int t, String w )
    {
        this.jenis=j;
        this.merk=m;
        this.tahun=t;
        this.warna=w;
    }
    //method tanpa parameter
    
    public void infokendaraan(){
    System.out.println("Jenis kendaraan = "+jenis);
    System.out.println("Merk Kendaraan = "+merk);
    System.out.println("Tahun Kendaraan = "+tahun);
    System.out.println("Warna  Kendaraan = "+warna);
}
    public void CekHarga(int harga){
        System.out.println("Harga sewa kendaraan Rp"+harga);
        
    }
    public void CekKendaraan(int kecepatan){
       if(kecepatan>=20 && kecepatan<=40){
           System.out.println("Kendaraan Anda Slow");
       }
       else if (kecepatan>=41 && kecepatan<=60){
         System.out.println("Kendaraan Anda medium");
         }
       else if (kecepatan<=61 && kecepatan<85){
           System.out.println("Kendaraan Anda Fast");    
       }
       else {
           System.out.println("Kendaraan Anda Racing");  
       }
    }
    
}
