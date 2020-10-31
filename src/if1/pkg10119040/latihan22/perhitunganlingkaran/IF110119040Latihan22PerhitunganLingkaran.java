/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119040.latihan22.perhitunganlingkaran;

import java.util.Scanner;
import java.text.DecimalFormat;

/**
 *
 * @author Acer
 * Nama     : Agus Deri Dermawan
 * Kelas    : IF1
 * NIM      : 10119040
 * Program perhitungan linkaran
 */
public class IF110119040Latihan22PerhitunganLingkaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int diameterLingkaran, jari;
        double pi = 3.15;
         
        Scanner input = new Scanner(System.in);
        System.out.println("========Perhitungan Lingkaran=========");
        System.out.print("Masukan diameter lingkaran : ");
        diameterLingkaran =input.nextInt();
         
        System.out.println();
        
        System.out.println("==========Hasil Perhitungan===========");
        
        jari = diameterLingkaran/2;
        System.out.println("Jari-jari Lingkaran = " + jari + " cm");
        double l = pi * (jari * jari);
        
        System.out.printf("Luas Lingkaran = %.2f", l);
        System.out.printf(" cm%n");
        double k = 2 * (pi * jari);
        
        System.out.printf("Luas Lingkaran = %.2f", k);
        System.out.printf(" cm%n");
        System.out.println("======================================");
        System.out.println("Developed by : Agus Deri Dermawan");
    }
    
}
