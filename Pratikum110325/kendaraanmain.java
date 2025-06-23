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
import java.util.Scanner;
public class kendaraanmain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner (System.in);
        String jenis;
        String merk;
        String warna;
        int tahun;
        int harga;
        int kecepatann;
        
        System.out.print("Masukan jenis kendaraan ");
        jenis=in.nextLine();
        System.out.print("Masukan Merk kendaraan ");
        merk=in.nextLine();
        System.out.print("WArna kendaraan ");
        warna = in.nextLine();
        System.out.print("Tahun kendaraan ");
        tahun=in.nextInt();
        System.out.print("Harga kendaraan ");
        harga = in.nextInt();
        System.out.print("Kecepatan kendaraan /jam ");
        kecepatann = in.nextInt();
        
        
        //objk baru class kendaraan
        Kendaraan kend = new Kendaraan(jenis,merk,tahun,warna);
        kend.infokendaraan();
        kend.CekHarga(harga);
        kend.CekKendaraan(kecepatann);
        
        
        
        
    }
    
}
