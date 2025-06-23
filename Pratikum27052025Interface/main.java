/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pratikum27052025Interface;

/**
 *
 * @author user
 */
public class main {
    public static void main(String[] args) {
        gitar gitar = new gitar("Gitar Klasik", "Petik", 6);
        keyboard keyboard = new keyboard("Yamaha PSR", "Elektronik", true);

        System.out.println("---Info Gitar---");
        gitar.info();
        gitar.mainkan();
        gitar.stem();

        System.out.println();

        System.out.println("---Info Keyboard---");
        keyboard.info();
        keyboard.nyalakan();
        keyboard.mainkan();
        keyboard.stem();
        keyboard.matikan();
    }
}