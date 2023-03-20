/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package printxinterasi;

/**
 * Nama : widya Revani Duwila
 * NIM  : 13020210253
 * Tgl/Waktu : 18-03-2023 / 12.42 WITA
 */


import java.util.Scanner;
/* contoh baca nilai x, */
/* Jumlahkan nilai yang dibaca dengan ITERATE */
public class PrintXinterasi {

    public static void main(String[] args) {
        // TODO code application logic here
        int Sum=0;
        int x;
        Scanner masukkan=new Scanner(System.in);
        //program 
        System.out.print("Masukkan nilai x (int) dg 999 :");
        x=masukkan.nextInt(); //first elemt
        
        if (x == 999){
            System.out.print("Kasus Kosong \n");
        }else{ //Minimal ada satu data yang dijumlahkan 
            Sum = x; //inisialisasi; invariant!!
           for(;;){
               System.out.print("Masukkan nilai x (int), akhiri dg 999 :");
               x=masukkan.nextInt(); //next elmt
               if(x==999){
                   break;
               }else{
                   Sum = Sum + x; //proses
               }
           } 
        }
        System.out.println("hasil penjumlahan = " + Sum);
        //Terminasi
    }
}
