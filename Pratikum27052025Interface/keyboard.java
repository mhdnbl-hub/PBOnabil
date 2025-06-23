/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pratikum27052025Interface;

/**
 *
 * @author ARKAN_AUVA
 */
public class keyboard extends AlatMusik implements BisaDinyalakan {
    private boolean dayaTersambung;
    
    public keyboard(String nama, String jenis, boolean dayaTersambung){
        super(nama, jenis);
        this.dayaTersambung = dayaTersambung;
    }

    @Override
    public void nyalakan() {
        if(cekListrik()){
            System.out.println(nama + " dinyalakan.");
        }else{
            System.out.println(nama + " tidak bisa dinyalakan");
        }
    }

    @Override
    public void matikan() {
        System.out.println(nama + " dimatikan.");
    }

    @Override
    public boolean cekListrik() {
        
        return dayaTersambung;
        
    }

    @Override
    public void mainkan() {
        System.out.println(nama + " dimainkan dengan menekan tuts.");
    }

    @Override
    public void stem(){
        System.out.println("Keyboard "+ nama +  " distem digital melalui aplikasi.");
    }
        
}

