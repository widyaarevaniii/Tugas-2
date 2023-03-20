
package bacastirng;

/**
 * Nama : Widya Revani Duwila
 * Nim  : 13020210253
 * tnggl/waktu : 17-03-2023 / 22.28 WITA
 */

import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader;

import javax.swing.*; 

public class BacaStirng {

    public static void main(String[] args)throws  IOException {
     
       /* Kamus */ 
    String str;
    BufferedReader datAIn = new BufferedReader(new InputStreamReader(System.in));
    /* Program */
    System.out.print ("\nBaca string dan Integer: \n"); 
    System.out.print("masukkan sebuah string: ");
    
    str= datAIn.readLine();
    System.out.println ("String yang dibaca : "+ str);
 
        
    }
    
}
