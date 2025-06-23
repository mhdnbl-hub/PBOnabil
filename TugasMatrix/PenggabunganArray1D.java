/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasMatrix;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class PenggabunganArray1D {
    public static void main(String[] args){
        int A[], B[], C[];
        int n, m;
        
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        
        System.out.println("===Program Penggabungan Array 1 D===");
        System.out.print("Masukkan ukuran Array A = ");
        n = in.nextInt();
        A = new int[n];
        
        System.out.print("Masukkan ukuran Array B = ");
        m = in.nextInt();
        B = new int[m];
        
        int i;
        for(i=0;i<n;i++){
            A[i]= rand.nextInt(100);
        }
        
        for(i=0;i<m;i++){
            B[i]= rand.nextInt(100);
        }
        
        System.out.println("\nUkuran Array A dan kelompoknya = "+n);
        for(i=0;i<n;i++){
            System.out.print(" " + A[i] + " ");
        }
        
        System.out.println("\nUkuran Array B dan kelompoknya = "+m);
        for(i=0;i<m;i++){
            System.out.print(" " + B[i] + " ");
        }
        
        
        System.out.println("\nUkuran Array C dan kelompoknya = "+ (n + m));
        if(n > m){
            for(i=0;i<n;i++)
                System.out.print(" "+ A[i] + " ");
            for(i=0;i<m;i++)
                System.out.print(" "+ B[i] + " ");
        }else if(m > n){
            for(i=0;i<m;i++)
                System.out.print(" "+ B[i] + " ");
            for(i=0;i<n;i++)
                System.out.print(" "+ B[i] + " ");
        }else{
            for(i=0;i<n;i++)
                System.out.print(" "+ A[i] + " ");
            for(i=0;i<m;i++)
                System.out.print(" "+ B[i] + " ");
        } 
    }
}
