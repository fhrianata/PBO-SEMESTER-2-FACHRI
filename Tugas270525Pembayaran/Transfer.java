/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas270525;

/**
 *
 * @author Ari
 */
public class Transfer extends MetodePembayaran {
    private String namaBank;

    public Transfer(String namaBank, double saldo) {
        super(saldo);
        this.namaBank = namaBank;
    }

    public String getNamaBank() {
        return namaBank;
    }

    public void setNamaBank(String namaBank) {
        this.namaBank = namaBank;
    }

    @Override
    public void prosesPembayaran(double jumlah) {
        if (jumlah <= saldo) {
            saldo -= jumlah;
            System.out.println("Pembayaran melalui transfer bank " + namaBank + " sebesar " + jumlah + " berhasil.");
        } else {
            System.out.println("Saldo tidak cukup untuk transfer.");
        }
    }

    @Override
    public void info() {
        System.out.println("Metode: Transfer Bank (" + namaBank + "), Saldo: " + saldo);
    }
}
