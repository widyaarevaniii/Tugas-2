/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package if2;

/**
 * Nama : Widya Revani Duwila
 * NIM  : 13020210253
 * Tgl/waktu : 17-03-2-23 / 23.01 WITA
 */

import java.util.Scanner;
//contoh menggunakan IF dua kasus komplementer
//Membaca sebuah Nilai
//Menuliskan 'nilai a posistif, nilai a', jika a>=0
// 'Nilai a negatif, nilai a', jika a<0

public class IF2 {
    
    public static void main(String[] args) {
        // TODO code application logic here
        int a;
        Scanner masukkan = new Scanner(System.in);
        //program
        System.out.println("Contoh if dua kasus \n");
        System.out.print("Ketikkan satu nilai integer : ");
        a=masukkan.nextInt();
        
        if (a >= 0){
            System.out.println("Nilai a positif " + a);
        }else //a<0
        {
            System.out.println("Nilai a negatif" + a);
        }
    }
    
}
