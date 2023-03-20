/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package max2;

/**
 * Nama : Widya Revani Duwila
 * NIM  : 13020210253
 * Tgl/Waktu : 13-03-2023 / 23.45 WITA
 */
import java.util.Scanner;
//Masksimum dua bilangan yang dibaca
public class Max2 {

    public static void main(String[] args) {
        // TODO code application logic here
        int a,b;
        Scanner masukkan = new Scanner(System.in);
        //program
        System.out.print("Maksimum  dua bilangan :\n");
        System.out.print("Ketukkan dua bilangan pisahkan dengan RETURN : \n");
        a=masukkan.nextInt();
        b=masukkan.nextInt();
        System.out.print("Ke dua bilangan : a = " + a + "b = " + b );
        if (a >= b){
            System.out.println("Nilai a yang maksimum" + a);
        }else //a > b
        {
            System.out.println("Nilai b yang maksimum " + b);
        }
            
    }
    
}
