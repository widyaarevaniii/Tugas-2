/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package printrepeat;

/**
 * Nama :Widya Revani Duwila 
 * NIM  : 13020210253
 * Tgl/Waktu : 18-03-2023 / 12.18 WITA
 */

import java.util.Scanner;
public class PrintRepeat {

    public static void main(String[] args) {
        // TODO code application logic here
        int N;
        int i;
        Scanner masukkan=new Scanner (System.in);
        //program 
        System.out.print("Nilai N > 0 =");
        //inisialisasi
        N=masukkan.nextInt();
        
        i = 1;
        //frist elemt
        System.out.print("Print I dengan REPEAT: \n");
        do{
            System.out.print(i+"\n"); //proses
            i++;
        }
        while (i <= N); //kondisi pengulangan
        
    }
    
}
