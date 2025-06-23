/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pratikum27052025Interface;

/**
 *
 * @author ARKAN_AUVA
 */
public class gitar extends AlatMusik {
    private int jumlahSenar;

    public gitar(String nama, String jenis, int jumlahSenar) {
        super(nama, jenis);
        this.jumlahSenar = jumlahSenar;
    }

    @Override
    public void mainkan() {
        System.out.println(nama + " dipetik dengan " + jumlahSenar + " senar.");
    }

    @Override
    public void stem() {
        System.out.println("Menyetem gitar " + nama + " secara manual.");
    }

    public int getJumlahSenar() {
        return jumlahSenar;
    }
}
