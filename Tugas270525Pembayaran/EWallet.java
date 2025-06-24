/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas270525;

/**
 *
 * @author Ari
 */
public class EWallet extends MetodePembayaran {
    protected String namaAplikasi;

    public EWallet(String namaAplikasi, double saldo) {
        super(saldo);
        this.namaAplikasi = namaAplikasi;
    }

    public String getNamaAplikasi() {
        return namaAplikasi;
    }

    public void setNamaAplikasi(String namaAplikasi) {
        this.namaAplikasi = namaAplikasi;
    }

    @Override
    public void prosesPembayaran(double jumlah) {
        if (jumlah <= saldo) {
            saldo -= jumlah;
            System.out.println("Pembayaran melalui E-Wallet " + namaAplikasi + " sebesar " + jumlah + " berhasil.");
        } else {
            System.out.println("Saldo tidak cukup di E-Wallet.");
        }
    }

    @Override
    public void info() {
        System.out.println("Metode: E-Wallet (" + namaAplikasi + "), Saldo: " + saldo);
    }
}
