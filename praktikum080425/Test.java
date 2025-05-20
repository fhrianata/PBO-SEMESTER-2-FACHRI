/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum080425;

/**
 *
 * @author Ari
 */
public class Test {
    public static void main(String[] args){
        // Membuat objek 1 dari kelas Nasabah dan Tabungan
        Nasabah nasabah1 = new Nasabah("Ari", "Gyro");
        Tabungan tabungan1 = new Tabungan(5000);
        
        // Membuat objek 2 dari kelas Nasabah dan Tabungan
        Nasabah nasabah2 = new Nasabah("Ari", "Obit");
        Tabungan tabungan2 = new Tabungan(7000);
        
        // Menampilkan informasi setiap objek
        System.out.println(nasabah1.toString());
        System.out.println(tabungan1.toString());
        System.out.println(nasabah2.toString());
        System.out.println(tabungan2.toString());
        
        // Objek 1 menabung 4000
        tabungan1.simpanUang(4000);
        System.out.println("\nAri menabung uang sebesar Rp.4000");
        System.out.println("Saldo Ari Gyro: "+tabungan1+"+"+tabungan1.getSaldo());
        
        // Objek 2 menabung 7000
        tabungan2.simpanUang(7000);
        System.out.println("\nAri Anak Baik menabung uang sebesar Rp.7000");
        System.out.println("Saldo Ari Anak Baik: "+tabungan2.getSaldo());
        
        // Objek 1 mengambil uang 5000
        tabungan1.ambilUang(5000);
        System.out.println("\nAri mengambil uang sebesar Rp.5000");
        System.out.println("Saldo Ari: "+tabungan1.getSaldo());
        
        // Objek 2 mengambil 6000
        tabungan2.ambilUang(6000);
        System.out.println("\nAri Anak Baik mengambil uang sebesar Rp.6000");
        System.out.println("Ari Anak Baik: "+tabungan2.getSaldo());
        
        // Objek 2 transfer ke objek 1 sebesar 1000
        System.out.println("\nAri Anak Baik mentransfer uang sebesar Rp.1000 kepada Andyta Ilham");
        tabungan2.transfer(tabungan1, 1000);
        
        // Menampilkan saldo dari objek 1 dan 2
        System.out.println("\nSaldo akhir Ari : "+tabungan1.getSaldo());
        System.out.println("Saldo akhir Ari Anak Baik: "+tabungan2.getSaldo());
    }
}
