/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.tugaspbo25032025;

/**
 *
 * @author Acer
 */
import java.util.Scanner;

public class TestTabunganBankNasabah{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bank bank = new Bank();
        int pilihan;

        do {
            System.out.println("\n=== Menu Sederhana ===");
            System.out.println("1. Tambah Nasabah");
            System.out.println("2. Tampilkan Nasabah");
            System.out.println("3. Transaksi Tabungan");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); // Membersihkan buffer

            switch (pilihan) {
                case 1: // Tambah nasabah
                    System.out.print("Nama Depan: ");
                    String namaDepan = scanner.nextLine();
                    System.out.print("Nama Belakang: ");
                    String namaBelakang = scanner.nextLine();
                    System.out.print("Masukkan saldo awal tabungan: ");
                    int saldo = scanner.nextInt();
                    scanner.nextLine(); // Membersihkan buffer

                    bank.tambahNasabah(namaDepan, namaBelakang, new Tabungan(saldo));
                    System.out.println("Nasabah berhasil ditambahkan!");
                    break;

                case 2: // Tampilkan nasabah
                    System.out.println("\n=== Daftar Nasabah ===");
                    for (int i = 0; i < bank.getJumlahNasabah(); i++) {
                        System.out.println((i + 1) + ". " + bank.getNasabah(i));
                    }
                    break;

                case 3: // Transaksi tabungan
                    System.out.print("Masukkan nomor nasabah: ");
                    int nomorNasabah = scanner.nextInt() - 1;
                    scanner.nextLine(); // Membersihkan buffer

                    if (nomorNasabah >= 0 && nomorNasabah < bank.getJumlahNasabah()) {
                        Nasabah nasabah = bank.getNasabah(nomorNasabah);
                        System.out.println("Saldo saat ini: " + nasabah.getTabungan().getSaldo());
                        System.out.print("1. Simpan Uang\n2. Ambil Uang\nPilih: ");
                        int transaksi = scanner.nextInt();
                        System.out.print("Masukkan jumlah: ");
                        int jumlah = scanner.nextInt();

                        if (transaksi == 1) {
                            nasabah.getTabungan().simpanUang(jumlah);
                            System.out.println("Saldo setelah penyimpanan: " + nasabah.getTabungan().getSaldo());
                        } else if (transaksi == 2) {
                            if (nasabah.getTabungan().ambilUang(jumlah)) {
                                System.out.println("Saldo setelah penarikan: " + nasabah.getTabungan().getSaldo());
                            } else {
                                System.out.println("Saldo tidak cukup untuk penarikan.");
                            }
                        } else {
                            System.out.println("Pilihan tidak valid.");
                        }
                    } else {
                        System.out.println("Nasabah tidak ditemukan.");
                    }
                    break;

                case 4: // Keluar
                    System.out.println("Terima kasih telah menggunakan aplikasi.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Coba lagi.");
                    break;
            }
        } while (pilihan != 4);

        scanner.close();
    }
}