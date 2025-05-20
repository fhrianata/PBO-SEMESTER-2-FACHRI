/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum220425quiz;

/**
 *
 * @author Ari
 */

import java.util.Scanner;

public class BangunDatar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input untuk Lingkaran
        System.out.print("Masukkan jari jari lingkaran: ");
        double r = input.nextDouble();
        Lingkaran lingkaran = new Lingkaran(r);
        System.out.println("\n" + lingkaran.toString());
        System.out.println("Diameter: "+lingkaran.getDiameter());
        System.out.println("Keliling: "+lingkaran.getKeliling());
        System.out.println("Luas: "+lingkaran.getLuas());

        // Input untuk Kerucut
        System.out.print("\nMasukkan jari jari kerucut: ");
        double rK = input.nextDouble();
        System.out.print("Masukkan tinggi kerucut: ");
        double tK = input.nextDouble();
        Kerucut kerucut = new Kerucut(rK, tK);
        System.out.println("\n" + kerucut.toString());
        System.out.println("Sisi Miring: "+kerucut.getSisiMiring());
        System.out.println("Luas Permukaan: "+kerucut.getLuas());
        System.out.println("Volume: "+kerucut.getVolume());

        // Input untuk Silinder
        System.out.print("\nMasukkan jari jari silinder: ");
        double rS = input.nextDouble();
        System.out.print("Masukkan tinggi silinder: ");
        double tS = input.nextDouble();
        Silinder silinder = new Silinder(rS, tS);
        System.out.println("\n"+silinder.toString());
        System.out.println("Luas Permukaan: "+silinder.getLuas());
        System.out.println("Volume: "+silinder.getVolume());

        input.close();
    }
}

