/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tempair;

/**
 * Nama : Widya Revani Duwila
 * NIM  : 13020210253
 * Tgl/Waktu : 18-03-2023 / 13.34 WITA
 */

import java.util.Scanner;
//contoh pemakaian if tiga kasus : wujud air 
public class Tempair {

    public static void main(String[] args) {
        // TODO code application logic here
        int T;
        Scanner masukkan = new Scanner (System.in);
        //progrom
        System.out.print("Contoh IF tiga Kasus \n");
        System.out.print("temperatur (der. C) = ");
        T=masukkan.nextInt();
        if(T < 0){
            System.out.print("Wujud air beku \n" + T);
        }else if ((0 <= T) && (T <= 100)){
            System.out.println("wujud air cair \n" + T);
        }else if(T > 100){
            System.out.print("wujud air uap/gas \n" + T);
        }
    }
    
}
