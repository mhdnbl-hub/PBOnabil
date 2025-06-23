/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pratikum18032025;

/**
 *
 * @author ARKAN_AUVA
 */
public class TestVehicle {
    public static void main(String[]args){
        //buat vehicle dengan beban maksimal 10000kg
        System.out.println("Kendaraan 1. Beban maksimal 10.000 kg");
        Vehicle kendaraan1 = new Vehicle(10000);
        
        //menambahkan beberapa beban (load)
        System.out.println("Menambahkan beban 1 (500 kg");
        kendaraan1.load = kendaraan1.load + 500;
        System.out.println("Menambahkan beban 2 (250 kg");
        kendaraan1.load = kendaraan1.load + 250;
        System.out.println("Menambahkan beban 3 (5000 kg");
        kendaraan1.load = kendaraan1.load + 5000;
        System.out.println("Menambahkan beban 4 (4000 kg");
        kendaraan1.load = kendaraan1.load + 4000;
        System.out.println("Menambahkan beban 5 (350 kg");
        kendaraan1.load = kendaraan1.load + 350;
        
        //menampilkan beban (load) kendaran saat ini
        System.out.println("Beban kendaraan saat ini = "+kendaraan1.getLoad()+" kg");
    }
}
