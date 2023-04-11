/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.p4;
import java.util.Scanner;

/**
 *
 * @author C-18
 */
public class Class1 {
      public static void main(String[] args) {
        
          Scanner input = new Scanner(System.in);
          System.out.println("Masukkan variabel 1: ");
          int variabel1 = input.nextInt();
          System.out.println("Masukkan variabel 2: ");
          int variabel2 = input.nextInt();         
          System.out.println(" ");          
          int variabel3 = (variabel1 + variabel2);
          System.out.println("Variabel1 + Variabel2 = " +variabel3);
          
          System.out.println("Dikerjakan oleh Muhammad Kholid Wirautama + 22201177");
    }
    
}
