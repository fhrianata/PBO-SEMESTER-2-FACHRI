/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

/**
 *
 * @author Ari
 */

import java.util.Scanner;

public class NilaiPermutasiDanKombinasi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai n: ");
        int n = input.nextInt();
        System.out.print("Masukkan nilai r: ");
        int r = input.nextInt();

        if (n < r || n < 0 || r < 0) {
            System.out.println("Input yang kamu masukkan tidak sesuai! Pastikan n >= r dan keduanya bilangan positif.");
        } else {
            int permutasi = 1;
            for (int i = n; i > (n - r); i--) {
                permutasi *= i;
            }

            int kombinasi = permutasi;
            int faktorialR = 1;
            for (int i = 1; i <= r; i++) {
                faktorialR *= i;
            }
            kombinasi /= faktorialR;

            System.out.println("Permutasi (P(" + n + "," + r + ")): " + permutasi);
            System.out.println("Kombinasi (C(" + n + "," + r + ")): " + kombinasi);
        }

        input.close();
    }
}

