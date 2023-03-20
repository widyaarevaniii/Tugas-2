/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package printwhile;

/**
 * Nama : Widya Revani Duwila
 *  NIM : 13020210253
 * Tgl/Waktu : 18-03-2023 / 12.28 WITA
 */

import java.util.Scanner;
//Baca N, Print 1 = 1 s/d dengan While
public class PrintWhile {

    public static void main(String[] args) {
        // TODO code application logic here
        int N;
        int i;
        Scanner masukkan=new Scanner(System.in);
        //prigram 
        System.out.print("Nilai N > 0 = "); //Inisialisasi
        N=masukkan.nextInt();
        i = 1; //first elemt
        
        System.out.print("print i dengan WHILE\n");
        while(i <= N){ //kondisi perulangan
            System.out.println(i); //proses;
            i++; //next elmt
        } // (i > N 
    }
    
}
