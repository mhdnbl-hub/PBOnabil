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
public class AksiMobil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mobil mobilku = new Mobil();
        mobilku.merk="Toyota";
        mobilku.plat="BA 2453 H";
        mobilku.tahun = 2004;
        mobilku.warna = "Hitam";
        System.out.println("--------------");
        System.out.println("Merk Mobil 1 ");
        System.out.println("Merk Mobil = "+mobilku.merk);
        System.out.println("Plat Movil = "+mobilku.plat);
        System.out.println("Tahun Keluar = "+mobilku.tahun);
        System.out.println("Warna  = "+mobilku.warna);
        
        Mobil yaris = new Mobil();
        yaris.merk="Yaris";
        yaris.plat="BA 2453 H";
        yaris.tahun = 2004;
        yaris.warna = "Putih";
        System.out.println("--------------");
        System.out.println("Merk Mobil 1 ");
        System.out.println("Merk Mobil = "+yaris.merk);
        System.out.println("Plat Movil = "+yaris.plat);
        System.out.println("Tahun Keluar = "+yaris.tahun);
        System.out.println("Warna  = "+yaris.warna);
        //pemanggilan method
        mobilku.MobilAktif(); //tanpa return
        System.out.println(mobilku.SuaraMobil());//return
        
                
    }
    
}
