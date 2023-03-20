/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package printxrepeat;

/**
 * Nama : Widya Revani Duwila
 * NIM  : 13020210253
 * Tgl / Waktu : 18-03-2-23 / 12.57
 */

import java.util.Scanner;
/* contoh baca nilai x, */
/* Jumlahkan nilai yang dibaca dengan ITERATE */

public class PrintXRepeat {

    public static void main(String[] args) {
        // TODO code application logic here
        int sum = 0;
        int x;
        Scanner masukkan=new Scanner (System.in);
        System.out.print("Masukkan nilai x (int), akhiri dg 999 :");
        x=masukkan.nextInt(); //first elemt
        if(x == 999){
            System.out.print("kasus Kosong \n");
        }else { //Minimal ada satu daya yang dijumlahkan 
            sum = 0; //inisialisasi; invariant!!
        }do{
            sum = sum + x; //proses
            System.out.print("Masukkan nilai x (int), akhiri dg 999\n");
            x = masukkan.nextInt();
        }while ( x !=999); //kondisi perulangan
        {
        System.out.println("hasil penjumlahan = " +sum);
        //terminasi
        }
    }
    
}
