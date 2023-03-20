/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package printxwhile;

/**
 * Nama : Widya Revani Duwila
 * NIM  : 13020210253
 * Tgl/Waktu : 18-03-2023 / 13.14
 */

import java.util.Scanner;
/* contoh baca nilai x, */
/* Jumlahkan nilai yang dibaca dengan WHILE */

public class PrintXWhile {

    public static void main(String[] args) {
        // TODO code application logic here
        int sum;
        int x;
        Scanner masukkan=new Scanner (System.in);
        //program 
        sum=0; //inisialisasi
        System.out.print("Masukkan nilai x (int), akhiri dg 999 :");
        x=masukkan.nextInt(); //first elemt
       while (x != 999){ //kondisis berhenti
           sum = sum + x; //proses
           System.out.print("Masukkan nilai x (int), akhiri dg 999 :");
           x = masukkan.nextInt();
       }
       System.out.println("Hasil penjumlahan = "+ sum); 
       //terminasi
    }
    
}

