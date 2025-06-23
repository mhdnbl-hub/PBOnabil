/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pratikum15042025;

/**
 *
 * @author ARKAN_AUVA
 */
public class Kucing extends Hewan{
    public Kucing(String nama) {
        super(nama);
    }
     
    @Override
    public void Suara(){
        System.out.println(nama + " bersuara : meongg!!!");
    }
}
