/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1javaapplication;
import java.util.Scanner;

/**
 *
 * @author C-17
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int nilaiA = 10;
        int nilaiB = 20;
        double ke1 = 1.234;
        double ke2 = 4.321;
        boolean isPlus = true;
        
        System.out.println("nilaiA = "+nilaiA);
        System.out.println("nilaiB = "+nilaiB);
        System.out.println("Double ke1 = "+ke1);
        System.out.println("Double ke2 = "+ke2);
        System.out.println("isPlus = "+isPlus);
        
        Scanner inputBaru = new Scanner(System.in);
        
        System.out.println("Input nilaiA baru: ");
        nilaiA = inputBaru.nextInt();
        System.out.println("nilaiA yang baru: " +nilaiA);
        
        System.out.println("Input nilaiB baru: ");
        nilaiB = inputBaru.nextInt();
        System.out.println("nilaiB yang baru: " +nilaiB);
        
        System.out.println("Input Double ke1 baru: ");
        ke1 = inputBaru.nextDouble();
        System.out.println("Double ke1 yang baru: " +ke1);
        
        System.out.println("Input Double ke2 baru: ");
        ke2 = inputBaru.nextDouble();
        System.out.println("Double k1e2 yang baru: " +ke2);
        
        System.out.println("Input isPlus baru: ");
        isPlus = inputBaru.nextBoolean();
        System.out.println("isPlus yang baru: " +isPlus);
        
  }

    }
    

