/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package printiterasi;

/**
 * Nama : Widya Revani Duwila
 * NIM  : 13020210253
 * Tgl/Waktu : 18-03-2023 / 12.05 WITA
 */

import java.util.Scanner;
//Baca N,
//Print i = 1 s/d N dengan ITERATE
public class PrintIterasi {

    public static void main(String[] args) {
        // TODO code application logic here
        int N;
        int i;
        Scanner masukkan=new Scanner(System.in);
        //program 
        System.out.print("Nilai N > 0 ="); //Inisialisasi
        N=masukkan.nextInt();
        
        i=1; //first elmt
        System.out.print("Print i dengan ITERATE :\n");
        for(;;){
            System.out.println(i); //proses
            if (i == N){
                /*Kondisi Berhenti*/ break;
            }
            else{
                   i++; //Next elmt
                }
        }// (i == N)
    }
    
}
