/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PraktikumOnline250325;

/**
 *
 * @author Ari
 */
public class BankNasabahTabunganTest {

    public static void main(String[] args) {
        Nasabah nasabah1 = new Nasabah("Fachri", "Ronin");
        Tabungan tabungan1 = new Tabungan(8000);
        nasabah1.setTabungan(tabungan1);

        Nasabah nasabah2 = new Nasabah("Ronin", "Fachri");
        Tabungan tabungan2 = new Tabungan(3000);
        nasabah2.setTabungan(tabungan2);

        System.out.println("Informasi nasabah dan saldonya");
        System.out.println("===============================");
        System.out.println(nasabah1);
        System.out.println(nasabah2);
        System.out.println();
        
        System.out.println("Riwayat menabung seorang nasabah");
        tabungan1.simpanUang(4000);
        System.out.println("Setelah Fachri menabung di bank 4000: " + tabungan1.getSaldo());

        tabungan2.simpanUang(7000);
        System.out.println("Setelah Ronin menabung di bank 7000: " + tabungan2.getSaldo());

        System.out.println("\nRiwayat penarikan nasabah");

        tabungan1.ambilUang(5000);
        System.out.println("Setelah Fachri mengambil uang di bank 5000: " + tabungan1.getSaldo());

        tabungan2.ambilUang(6000);
        System.out.println("Setelah Ronin mengambil uang di bank 6000: " + tabungan2.getSaldo());

        tabungan2.transfer(tabungan1, 1000);
        System.out.println("\nSetelah Fachri transfer sejumlah 1000 ke Ronin:");
        System.out.println("Saldo Fachri: " + tabungan1.getSaldo());
        System.out.println("Saldo Ronin: " + tabungan2.getSaldo());
    }
}