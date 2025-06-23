/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pratikum200225;

/**
 *
 * @author Arkan Auva
 */
import java.util.Scanner;
public class tiketbus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
          int menu,jumket = 0;
        long harga, tot_awal;
        float diskon = 0, tot_bayar;
        
        Scanner in = new Scanner(System.in);
        System.out.println("--------------------------------------------------");
        System.out.println("|   Kelas                 |      Harga Tiket     |");
        System.out.println("--------------------------------------------------");
        System.out.println("|   1.Ekonomi             |      Rp. 350.000     |");
        System.out.println("|   2.Eksekutif           |      Rp. 500.000     |");
        System.out.println("|   3.Super Eksekutif     |      Rp. 650.000     |");
        System.out.println("--------------------------------------------------");
        System.out.print("Pilih tiket (angka) : ");
        menu =  in.nextInt();
        System.out.print("Masukkan jumlah tiket : ");
        jumket= in.nextInt();
        switch (menu){
            case 1 :
            {
                harga=350000;
            }break;
            case 2 :
            {
                harga=500000;
            }break;
            case 3 :
               {
            harga = 650000;
            }break;
            default:
            {
                harga=0;
                System.out.println("Kelas Tidak Tersedia");
            }break;
        } 
        tot_awal=harga*jumket;
        if (jumket>4)
        {
            System.out.println("Diskon!!!");
            diskon=(float) (0.1*tot_awal);
        }
        else
        {
            diskon=0;
        }
        
        tot_bayar=tot_awal-diskon;
        System.out.println("Biaya Awal : "+tot_awal);
        System.out.println("Diskon     : "+diskon);
        System.out.println("Bayar      : "+tot_bayar);
    
    }
    
}
