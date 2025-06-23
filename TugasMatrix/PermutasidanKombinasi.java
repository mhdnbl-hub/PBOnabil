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
public class PermutasidanKombinasi {
    public static void main(String[] args) {
       int n, r;
       Scanner in = new Scanner(System.in);
       
       System.out.println("===Program Permutasi dan Kombinasi===");
       System.out.println("n: Banyak unsur");
       System.out.println("r: Banyak unsur yang dipermutasikan/dikombinasikan");
       
       System.out.print("Masukkan nilai n : ");
       n = in.nextInt();
       System.out.print("Masukkan nilai r : ");
       r = in.nextInt();
       
       int i;
       
       int n2=n;
       for(i=n-1;i>0;i--){
           n2=n2*i;
       }
       
       int r2=r;
       for(i=r-1;i>0;i--){
           r2=r2*i;
       }
       
       int nr= n-r;
       int nr2= nr;
       for(i=nr-1;i>0;i--){
           nr2= nr*1;
       }
       
       System.out.println("");
       
       System.out.println("Rumus Permutasi: P(n,r) = n!/(n-r)!");
       System.out.print("P("+ n + "," + r + ") = ");
       System.out.print(n + "!/(" + n + "-" + r + ")! = ");
       System.out.print(n + "!/" + nr + "! = ");
       System.out.println(n2 + "/" + nr2);
       System.out.println("= " + n2/nr2);
       System.out.println("Maka hasil permutasi adalah " + n2/nr2);
       
       System.out.println("");
       
       System.out.println("Rumus kombinasi: C(n, r) = n!/r!(n - r)!");
       System.out.print("C(" + n + "," + r + ") = ");
       System.out.print(n + "!/" + r + "!(" + n + "-" + r + ")! = ");
       System.out.print(n + "!/" + r + "!(" + nr + ")! = ");
       System.out.print(n2 + "!/" + r2 + "x" + nr2 + ") = ");
       System.out.println(n2 + "/" + r2*nr2);
       System.out.println("= " + n2/(r2*nr2));
       System.out.println("Maka hasil kombinasi adalah = "+ n2/(r2*nr2));       
    }
}
