/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package konstant;

/**
 * Nama : Widya Revani Duwila
 * NIM  : 13020210253
 * Tgl/waktu : 17-03-2023 / 23.35 WITA
 */

import java.util.Scanner;
//Membaca jari-jaeri, menghitung luas lingkaran 
// latihan pemakaian konstanta
public class Konstant {

    public static void main(String[] args) {
        // TODO code application logic here
        final float PHI = 3.1415f;
        float r;
        Scanner masukkan = new Scanner (System.in);
        //program , Baca Data
        System.out.print("jari-jari lingkan =");
        r=masukkan.nextFloat();
        //Hitung dan tulis hasil
        System.out.print("Luas Lingkaran =" + (PHI * r * r) +"\n");
        System.out.print("Akhir Program \n");
    }
    
}
