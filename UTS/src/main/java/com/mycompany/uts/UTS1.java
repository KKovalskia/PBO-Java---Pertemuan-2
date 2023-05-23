/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.uts;
import java.io.File;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author C-7
 */
class DataDiri{
    String nama;
    int nim;
    String alamat;
    int umur;
    int tinggiBadan;
}
public class UTS1 {
    public static void main(String[] args)throws Exception {
        int[]nilaiInterger = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String output_nilaiInterger = Arrays.toString((nilaiInterger));
        output_nilaiInterger = output_nilaiInterger.substring(1, output_nilaiInterger.length()-1);
        
        String []namaTeman = {"Kevin", "Dimas", "Restu", "Yogi", "Danang"};
        String output_namaTeman = String.join(", ", namaTeman);
        
        DataDiri k;
        k = new DataDiri();
        k.nama        = "Muhammad Kholid Wirautama";
        k.nim         = 22201177;
        k.alamat      = "Jalan Kunta Bhaswara V";
        k.umur        = 19;
        k.tinggiBadan = 173;
        
        PrintWriter fileout = new PrintWriter ("file.txt");
        fileout.println(output_nilaiInterger);
        fileout.println(output_namaTeman);
        fileout.println("Nama: "   + k.nama        + ", " + 
                        "NIM: "    + k.nim         + ", " +
                        "Alamat: " + k.alamat      + ", " + 
                        "Umur: "   + k.umur        + " tahun" +", " + 
                        "Tinggi: " + k.tinggiBadan + " cm"    +", ");
        fileout.close();
        
        File folder = new File ("file.txt");
        Scanner reader = new Scanner(folder);
        while(reader.hasNextLine()){
            String text = reader.nextLine();
            System.out.println(text);
        }
                }
}
