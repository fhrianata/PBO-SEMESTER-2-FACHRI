/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum200225;

import java.util.Scanner;

/**
 *
 * @author Lif Rdwn
 */
public class InputVariabel {
    public static void main(String[] args){
        String nama;
        int umur;
        char jk;
        float rapor;
        boolean asal;
        Scanner input = new Scanner(System.in);
        System.out.println("==Program Input Variabel==");
        System.out.print("Nama anda = ");
        nama = input.nextLine(); //baca string
        System.out.print("Umur anda = ");
        umur = input.nextInt(); //baca integer
        System.out.print("Gender (L/P) = ");
        jk = input.next().charAt(0); //baca karakter
        System.out.print("Rata-rata lapor = ");
        rapor = input.nextFloat(); //baca float
        System.out.print("Asal Padang (true/false)? ");
        asal = input.nextBoolean(); //baca boolean
        System.out.println("\n==Input Data Anda==");
        System.out.println("Nama anda = "+nama);
        System.out.println("Umur anda = "+umur+" tahun");
        System.out.println("Gender anda = "+jk);
        System.out.println("Rata-rata rapor = "+rapor);
        if(asal) //asal = true
            System.out.println("Anda berasal dari Padang");
        else //asal = false
            System.out.println("Anda bukam berasal dari Padang");
        //endif
     }
}
