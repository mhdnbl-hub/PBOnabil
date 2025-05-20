/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktek15042025;

/**
 *
 * @author Acer
 */
public class pesawat extends udara {
    private int muatan;
    
    
    public pesawat(){
        
    }
    public pesawat(String nama, int tahunProduksi, boolean mesin,int muatan){
        super(nama,tahunProduksi,mesin,muatan);
        this.muatan=muatan;
        
    }
    public int getMuatan(){
        return muatan;        
    }
    public void setMuatan(int muatan){
        this.muatan=muatan;
    }
    public void reset(String nama,int tahunProduksi,boolean mesin,int muatan){
        setNama(nama);
        setTahunProduksi(tahunProduksi);
        setMesin(mesin);
        setMuatan(muatan);
    }
    public String kategori(int muatan){
        if(muatan<=50)
            return "muatan kecil";
        else if(muatan<=150)
            return "muatan sedang";
        else
            return "muatan besar";
    }
    public void cetak(){
        super.cetak();
        System.out.println("muatan"+muatan+"penumpang");
        System.out.println("kategori pesawat"+kategori(muatan));

        
    }
    
    
}
