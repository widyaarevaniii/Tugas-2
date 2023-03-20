/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package if3;


import java.util.Scanner;
/**
 * Nama : Widya Revani Duwila
 * NIM  : 13020210253
 * Tgl/Waktu : 17-03-2023 / 23.10
 */
//contoh pemakaian if 3 kasus, membaca sebuah nilai
//menuliskan 'nilai a positif, nilai a' jika a > 0
// 'Nilai a negatif, nilai a', jika a<0

public class IF3 {

    public static void main(String[] args) {
        // TODO code application logic here
        int a;
        Scanner masukkan = new Scanner (System.in);
        //program 
        System.out.print("contoh IF tiga kasus \n");
        System.out.print("Ketikan satu nilai integer : ");
        a=masukkan.nextInt();
        if(a > 0){
            System.out.println("Nilai a positif :" + a);
        }else if (a == 0){
            System.out.println("Nilai Nol " + a);
        }else //a > a 
        {
            System.out.println("nilai a negatif " + a);
        }
        
    }
    
}
