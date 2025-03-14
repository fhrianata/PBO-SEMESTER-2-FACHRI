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

public class DiskonProdukSusu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Harga tiap merek susu
        int hargaX = 40000, hargaY = 50000, hargaZ = 60000;
        double totalHarga = 0, diskon = 0, totalBayar;

        // Minta input merek susu
        System.out.print("Masukkan merek susu (X, Y, Z): ");
        char merek = input.next().toUpperCase().charAt(0);

        // Minta jumlah kotak yang dibeli
        System.out.print("Masukkan jumlah kotak: ");
        int jumlah = input.nextInt();

        // Hitung harga sesuai merek
        if (merek == 'X') {
            totalHarga = jumlah * hargaX;
            if (jumlah >= 3) {
                diskon = totalHarga * 0.10;
            }
        } else if (merek == 'Y') {
            totalHarga = jumlah * hargaY;
            if (jumlah > 3) {
                diskon = totalHarga * 0.12;
            }
        } else if (merek == 'Z') {
            if (jumlah > 0) {
                totalHarga = hargaZ; // Kotak pertama harga normal
                if (jumlah > 1) {
                    double hargaDiskon = hargaZ * 0.85; // Kotak kedua dan seterusnya 15% diskon
                    totalHarga += hargaDiskon * (jumlah - 1);
                    diskon = (hargaZ - hargaDiskon) * (jumlah - 1);
                }
            }
        } else {
            System.out.println("Merek tidak valid! Harus X, Y, atau Z.");
            input.close();
            return;
        }

        // Hitung total bayar setelah diskon
        totalBayar = totalHarga - diskon;

        // Tampilkan hasilnya
        System.out.println("\n===== Struk Pembelian =====");
        System.out.println("Merek susu   : " + merek);
        System.out.println("Jumlah kotak : " + jumlah);
        System.out.println("Total harga  : Rp" + totalHarga);
        System.out.println("Diskon       : Rp" + diskon);
        System.out.println("Total bayar  : Rp" + totalBayar);
        System.out.println("===========================");

        input.close();
    }
}

