/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasMatrix;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Pola {
    public static void main(String[]args) {
        int n;
        
        Scanner in = new Scanner(System.in);
     
        System.out.println("===Program Pola===");
        System.out.print("input angka pola = ");
        n= in.nextInt();
        
        int i, j;
       
        for(i=0;i<n;i++) {
            for(j=0;j<n;j++) {
                if(i==0 || j==0 || i==j)
                    System.out.print(" 0 ");
                else 
                    System.out.print(" * ");
            }
            System.out.println("");
        }
    }
}
