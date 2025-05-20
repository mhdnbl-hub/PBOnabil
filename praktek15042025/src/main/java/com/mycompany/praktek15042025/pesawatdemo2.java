/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.praktek15042025;

/**
 *
 * @author Acer
 */
public class pesawatdemo2 {
    public static void main(String[] args) {
        pesawat[] daftarpesawat=new pesawat[3];
        
        daftarpesawat[0]=new pesawat("Lion Air",2015,true,80);
        daftarpesawat[1]=new pesawat("Air ASIAP",2018,false,120);
        daftarpesawat[2]=new pesawat("HAWIMAW MALAYA",2020,true,180);
        ///menampilkan array
        for(int i=0;i<daftarpesawat.length;i++){
            System.out.println("Data pesawat ke "+(i+1)+"adalah");
            daftarpesawat[i].cetak();
            System.out.println();
        }
    }
    
}
