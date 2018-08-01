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
public class DataDiri {
     public static void main(String[] args) {
        //Deklarasi variabel
        String nama,alamat;
        int usia,absen;
        //Membuat scenner baru
        Scanner keyboard=new Scanner (System.in);
        //Tampilkan output ke user
        System.out.println("### DATA SISW SMK TELKOM MALANG ###");
        System.out.print("Nama Siswa: ");
        //menggunakan scannner dan menyimpan apa yang diketik di variabel nama
        nama=keyboard.next();
        //tampilkan output lagi
        System.out.print("alamat :");
        //menggunakan scanner lagi 
        alamat=keyboard.next();
        System.out.print("absen: ");
        usia=keyboard.nextInt();
        System.out.print("usia: ");
        absen=keyboard.nextInt();
        //menampilkan apa yang sudah simpan di variabel
        System.out.println("----------------------------");
        System.out.println("Nama Siswa: " + nama);
        System.out.println("Alamat: " + alamat);
        System.out.println("Absen: " + usia);
        System.out.println("Usia: " + absen + "tahun");
    }
    
}
