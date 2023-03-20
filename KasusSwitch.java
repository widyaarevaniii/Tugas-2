/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kasusswitch;

/**
 * Nama : Widya Revanni Duwila
 * NIM  : 13020210253
 * tgl/Waktu : 17-03-2023 / 23.25 WITA
 */

import java.util.Scanner;
public class KasusSwitch {
    
    public static void main(String[] args) {
        // TODO code application logic here
        char cc;
       Scanner masukan=new Scanner(System.in);
       //program 
       System.out.print("Ketikkan sebuah huruf, akhiri dengan RETURN \n");
       cc=masukan.next().charAt(0);
       switch(cc){
           case 'a': { 
               System.out.print ("Yang anda ketik adalah a \n");
           }break;
           case 'u' : {
               System.out.print ("Yang anda ketik adalah u \n");
           }break;
           case 'e' : {
               System.out.print ("Yang anda ketik adalah e \n");
           }break;
           case 'i' : {
               System.out.print ("Yang anda ketik adalah i \n");
           }break;
           case 'o' : {
               System.out.print ("Yang anda ketik adalah 0 \n");
           }break;
           default : System.out.print ("Yang anda ketik adalah huruf mati \n");
       }
       
    }
    
}
