/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package if1;

/**
 * Nama : Widya Revani Duwila
 * Nim  : 13020210253
 * Tgl/waktu : 17/03/2023/ 22.50 WITA
 */

// contoh pemakaian IF satu kasus 
//membaca nilai integer, menuliskan nilainya jika positif

import java.util.Scanner;

public class If1 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner masukkan=new Scanner(System.in);
        int a;
        //program 
        
        System.out.print("Contoh IF satu kasus \n");
        System.out.print("Ketikkan satu nilai integer :");
        a = masukkan.nextInt();
        if ( a >= 0){
            System.out.println("\nNilai a positif : " + a);
        }
    }
    
}
