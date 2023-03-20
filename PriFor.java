 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prifor;

/**
 * Nama : Widya Revani Duwila 
 * NIM  : 13020210253
 * Tgl / waktu : 17-03-2023 / 23.55 WITA
 */

import java.util.Scanner;
//Baca N, print 1 s/d N dengan FOR
public class PriFor {

    public static void main(String[] args) {
        // TODO code application logic here
        int  i,N;
        Scanner masukkan=new Scanner(System.in);
        //program
        System.out.println("Baca N, print 1 s/d N");
        System.out.print("N =");
        N=masukkan.nextInt();
        
        for(i = 1; i <= N; i++){
            System.out.println(i);
        }
        System.out.println("Akhir program \n");
    }
    
}
