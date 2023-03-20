/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package subprogram;

/**
 * Nama : widya Revani Duwila
 * NIM  13020210253
 * Tgl/Waktu : 18-03-2023 / 13.20 WITA
 */

import java.util.Scanner;
/* Contoh program yang mengandung prosedur dan fungsi */
/* prosedur/fungsi */

public class Subprogram {

    public static int maxab(int a, int b) {
        // TODO code application logic here
        //mencari minimum dua bilangan bulat 
        return ((a >= b) ? a : b);
    }
    public static void tukar(int a, int b){
     /* menukar dua bilangan bulat */
    int temp; 
        temp = a; 
        a = b;
        b = temp;
        System.out.println ("Ke dua bilangan setelah tukar: a = "+ a +" b = "+ b);
    }
    //program utama
    public static void main(String[] args){
        /* Membaca dua bilangan integer */
        /* Menuliskan maksimum dua bilangan yang dibaca
        dg memanggil fungsi */
        /* Menukar kedua bilangan dengan 'prosedur' */
        int a,b;
        Scanner masukkan = new Scanner (System.in);
        System.out.print("Maksimum dua bilangan \n ");
        System.out.print("Ketikkan dua bilangan pisahkan dengan RETURN : \n");
        a=masukkan.nextInt();
        b=masukkan.nextInt();
        System.out.println("Ke dua bilangan a = " + a +"b = "+ b);
        System.out.println("Maksismum = " + (maxab (a,b )));
        System.out.println("Tukar kedua bilangan ......\n");
        tukar(a,b);
    }
}
