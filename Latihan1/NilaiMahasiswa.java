/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan1;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class NilaiMahasiswa {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        
        String nama;
        String nim;
        float tugas, quiz, uts, uas;
        float na = 0;
        char huruf;
        char ulang;
        
        do{
            System.out.println("==Rekap Nilai Mahasiswa==");
            System.out.println("=========================");
            System.out.print("Masukkan Nama Mahasiswa : ");
            nama = in.nextLine();
            System.out.print("Masukkan Nim Mahasiswa : ");
            nim = in.nextLine();
            System.out.print("Masukkan Nilai Tugas : ");
            tugas = in.nextFloat();
            System.out.print("Masukkan Nilai Quiz : ");
            quiz = in.nextFloat();
            System.out.print("Masukkan Nilai UTS : ");
            uts = in.nextFloat();
            System.out.print("Masukkan Nilai UAS : ");
            uas = in.nextFloat();
            
            Mahasiswa mhs = new Mahasiswa (nama, nim, tugas, quiz, uts, uas);
            mhs.NilaiAkhir(na);
            mhs.TampilData();
            mhs.cekstatus();
            
            System.out.print("\nApakah ingin input data mahasiswa lain (y/n)");
            in.nextLine();
            ulang = in.nextLine().charAt(0);
            
            System.out.println();
        }while(ulang == 'y' || ulang == 'Y');
        in.close();
    }
}
