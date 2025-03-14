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

public class PolaBintang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Meminta user memasukkan angka
        System.out.print("Input angka: ");
        int n = input.nextInt();

        // Membentuk pola sesuai input
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Kondisi untuk mencetak '0' atau '*'
                if (i == 0 || j == 0 || j == i) {
                    System.out.print("0 ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println(); // Pindah ke baris berikutnya
        }

        input.close();
    }
}

