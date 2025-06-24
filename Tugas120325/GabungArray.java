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
import java.util.Random;
import java.util.Arrays;

public class GabungArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        // Input ukuran array A dan B
        System.out.print("Masukkan ukuran array A: ");
        int ukuranA = input.nextInt();
        System.out.print("Masukkan ukuran array B: ");
        int ukuranB = input.nextInt();

        int[] arrayA = new int[ukuranA];
        int[] arrayB = new int[ukuranB];

        // Mengisi array A dan B dengan nilai random
        for (int i = 0; i < ukuranA; i++) {
            arrayA[i] = rand.nextInt(100); // Nilai random antara 0-99
        }
        for (int i = 0; i < ukuranB; i++) {
            arrayB[i] = rand.nextInt(100);
        }

        // Menentukan array yang lebih besar untuk diletakkan di awal array C
        int[] arrayC;
        if (ukuranA >= ukuranB) {
            arrayC = gabungkanArray(arrayA, arrayB);
        } else {
            arrayC = gabungkanArray(arrayB, arrayA);
        }

        // Menampilkan hasil
        System.out.println("Array A: " + Arrays.toString(arrayA));
        System.out.println("Array B: " + Arrays.toString(arrayB));
        System.out.println("Array C: " + Arrays.toString(arrayC));

        input.close();
    }

    public static int[] gabungkanArray(int[] besar, int[] kecil) {
        int[] hasil = new int[besar.length + kecil.length];
        System.arraycopy(besar, 0, hasil, 0, besar.length);
        System.arraycopy(kecil, 0, hasil, besar.length, kecil.length);
        return hasil;
    }
}

