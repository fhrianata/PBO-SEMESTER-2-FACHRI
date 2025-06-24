/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas270525;

/**
 *
 * @author Ari
 */
public class Main {
    public static void main(String[] args) {
        MetodePembayaran transfer = new Transfer("Bank BRI", 1000000);
        MetodePembayaran ewallet = new EWallet("GoPay", 500000);
        MetodePembayaran kartuKredit = new KartuKredit("Ari", 3000000);

        transfer.info();
        transfer.prosesPembayaran(250000);

        System.out.println();

        ewallet.info();
        ewallet.prosesPembayaran(600000); 
        ewallet.prosesPembayaran(200000); 

        System.out.println();

        kartuKredit.info();
        kartuKredit.prosesPembayaran(1000000);
        kartuKredit.info();
    }
}
