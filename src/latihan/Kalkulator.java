/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan;

import java.util.Scanner;

/**
 *
 * @author galih
 */
public class Kalkulator {
    static float total = 0, bil1 = 1, bil2 = 1;   
    public static void main(String[] args) {
       Scanner input = new Scanner (System.in);
       
       while (bil1 != 0 & bil2 != 0);
       System.out.println("Kalkulator Sederhana");
       System.out.println("1. Penjumlahan");
       System.out.println("2. Pengurangan");
       System.out.println("3. Perkalian");
       System.out.println("4. Pembagian");
       System.out.print("Masukan pillihan anda = ");
          int pilihan = input.nextInt();
          
            System.out.println("Masukan bilangan ke-1 = ");
            bil1 = input.nextFloat();
            System.out.println("Masukan bilangan ke-2 = ");
            bil1 = input.nextFloat();
            
            switch(pilihan) {
                
                case 1 :
                    System.out.println(+ bil1 + "+" + bil2);
                    System.out.println("hasilnya = ");
                    total = bil1 + bil2;
                break;  
                        
                case 2 :
                    System.out.println(+ bil1 + "-" + bil2);
                    System.out.println("hasilnya = ");
                    total = bil1 - bil2;
                break;
                
                case 3 :
                    System.out.println(+ bil1 + "*" + bil2);
                    System.out.println("hasilnya = ");
                    total = bil1 * bil2;
                break;
                
                case 4 :
                    System.out.println(+ bil1 + "/" + bil2);
                    System.out.println("hasilnya = ");
                    total = bil1 / bil2;
                break;
                default:
                    
                    System.out.println("Anda harus memasukkan angka");
                    
            }
            System.out.println(total);
    }
 
}
