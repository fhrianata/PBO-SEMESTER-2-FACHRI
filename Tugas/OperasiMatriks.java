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

public class OperasiMatriks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        boolean ulang = true;

        while (ulang) {
            System.out.println("\n=== Menu Operasi Matriks ===");
            System.out.println("1. Tambah");
            System.out.println("2. Kurang");
            System.out.println("3. Kali");
            System.out.println("4. Identitas");
            System.out.println("5. Transpose");
            System.out.println("6. Exit");
            System.out.print("Pilih menu (1-6): ");
            int pilihan = input.nextInt();

            if (pilihan == 6) {
                System.out.println("Terima kasih! Program selesai.");
                break;
            }

            if (pilihan < 1 || pilihan > 6) {
                System.out.println("Pilihan tidak valid, silakan coba lagi.");
                continue;
            }

            System.out.print("Masukkan jumlah baris: ");
            int baris = input.nextInt();
            System.out.print("Masukkan jumlah kolom: ");
            int kolom = input.nextInt();

            int[][] matriksA = new int[baris][kolom];
            int[][] matriksB = new int[baris][kolom];
            int[][] hasil = new int[baris][kolom];

            // Mengisi matriks A dan B dengan nilai random (jika diperlukan)
            if (pilihan >= 1 && pilihan <= 3) {
                for (int i = 0; i < baris; i++) {
                    for (int j = 0; j < kolom; j++) {
                        matriksA[i][j] = rand.nextInt(10); // Nilai acak 0-9
                        matriksB[i][j] = rand.nextInt(10);
                    }
                }

                System.out.println("\nMatriks A:");
                cetakMatriks(matriksA);
                System.out.println("\nMatriks B:");
                cetakMatriks(matriksB);
            }

            // Operasi matriks sesuai pilihan
            switch (pilihan) {
                case 1: // Penjumlahan
                    for (int i = 0; i < baris; i++) {
                        for (int j = 0; j < kolom; j++) {
                            hasil[i][j] = matriksA[i][j] + matriksB[i][j];
                        }
                    }
                    System.out.println("\nHasil Penjumlahan:");
                    cetakMatriks(hasil);
                    break;

                case 2: // Pengurangan
                    for (int i = 0; i < baris; i++) {
                        for (int j = 0; j < kolom; j++) {
                            hasil[i][j] = matriksA[i][j] - matriksB[i][j];
                        }
                    }
                    System.out.println("\nHasil Pengurangan:");
                    cetakMatriks(hasil);
                    break;

                case 3: // Perkalian
                    hasil = new int[baris][kolom];
                    for (int i = 0; i < baris; i++) {
                        for (int j = 0; j < kolom; j++) {
                            for (int k = 0; k < kolom; k++) {
                                hasil[i][j] += matriksA[i][k] * matriksB[k][j];
                            }
                        }
                    }
                    System.out.println("\nHasil Perkalian:");
                    cetakMatriks(hasil);
                    break;

                case 4: // Matriks Identitas
                    if (baris != kolom) {
                        System.out.println("Matriks identitas hanya bisa untuk matriks persegi!");
                    } else {
                        int[][] identitas = new int[baris][kolom];
                        for (int i = 0; i < baris; i++) {
                            for (int j = 0; j < kolom; j++) {
                                identitas[i][j] = (i == j) ? 1 : 0;
                            }
                        }
                        System.out.println("\nMatriks Identitas:");
                        cetakMatriks(identitas);
                    }
                    break;

                case 5: // Transpose
                    int[][] transpose = new int[kolom][baris];
                    for (int i = 0; i < baris; i++) {
                        for (int j = 0; j < kolom; j++) {
                            transpose[j][i] = matriksA[i][j];
                        }
                    }
                    System.out.println("\nHasil Transpose:");
                    cetakMatriks(transpose);
                    break;
            }

            // Tanya apakah ingin mengulang
            System.out.print("\nApakah ingin mengulang? (y/n): ");
            char jawab = input.next().charAt(0);
            ulang = (jawab == 'y' || jawab == 'Y');
        }

        input.close();
    }

    // Method untuk mencetak matriks
    public static void cetakMatriks(int[][] matriks) {
        for (int[] baris : matriks) {
            for (int elemen : baris) {
                System.out.print(elemen + " ");
            }
            System.out.println();
        }
    }
}


