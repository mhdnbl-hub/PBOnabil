/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pratikum18032025;

import java.util.Scanner;

/**
 *
 * @author ARKAN_AUVA
 */
public class TextVehicleEnkapsulasi {
    public static void main(String[]args){
        System.out.println("Kendaran 1. Beban maksimal 10.000kg");
        VehicleEnkapsulasi kendaraan1 = new VehicleEnkapsulasi(10000);
        
        //Menambahkan beban
        System.out.println("Menambahkan beban 1 (500kg"+kendaraan1.addLoad(500));
        System.out.println("Menambahkan beban 2 (250kg"+kendaraan1.addLoad(250));
        System.out.println("Menambahkan beban 3 (5000kg"+kendaraan1.addLoad(5000));
        System.out.println("Menambahkan beban 4 (4000kg"+kendaraan1.addLoad(4000));
        System.out.println("Menambahkan beban 5 (350kg"+kendaraan1.addLoad(350));
        
        //Menampilkan beban kendaraan saat ini
        System.out.println("Beban kendaraan saat ini = "+kendaraan1.getLoad()+" kg");
        
        //Membuat objek kendaraan2 menggunakan konstruktor kosong
        Scanner in = new Scanner(System.in);
        System.out.println("Kendaraan 2. Beban maksimal belum ada.");
        VehicleEnkapsulasi kendaraan2 = new VehicleEnkapsulasi();
        
        //set maxLoad menggunakan method setMaxLoad
        System.out.print("Masukkan beban maksimal kendaraan : ");
        double bebanmax = in.nextDouble();
        kendaraan2.setMaxLoad(bebanmax);
        
        //Isi beban pada kendaraan
        System.out.print("Memasukkan berat beban yang akan diletakkan dikendaraan 2 : ");
        double beban = in.nextDouble();
        while(kendaraan2.addLoad(beban)){ //default tree
            System.out.println("Beban di tambahkan "+beban+" kg");
            System.out.print("Memasukkan berat beban yang akan diletakkan dikendaraan 2 : ");
            beban = in.nextDouble();
        }
        if(!kendaraan2.addLoad(beban)){ //not true ====> false
            System.out.println("Beban kendaraan saat ini = "+kendaraan2.getLoad()+" kg");
            System.out.println("Beban akan berlebih. Penambahan beban dibatalkan!");
        }else
            System.out.println("Beban kendaraan saat ini = "+kendaraan2.getLoad()+" kg");
        //endif
    }
}
