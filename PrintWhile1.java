/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package printwhile1;

/**
 * Nama : Widya Revani Duwila 
 * NIM  : 13020210253
 * Tgl/waktu : 18-03-2023 / 12.36 WITA
 */

import java.util.Scanner;
/* Baca N, */
/* Print i = 1 s/d N dengan while (ringkas) */
public class PrintWhile1 {

    public static void main(String[] args) {
        // TODO code application logic here
        int N;
        int i = 1;
        Scanner masukkan = new Scanner(System.in);
        //program
        System.out.print("Nilai N > 0 = \n");
        N=masukkan.nextInt();
        System.out.print("Print i dengan WHILE (ringkas) : \n");
        while (i <= N){
            System.out.println(i++);
        }//(i > N)
    }
    
}
