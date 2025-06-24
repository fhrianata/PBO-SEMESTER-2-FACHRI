/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas270525;

/**
 *
 * @author Ari
 */
public abstract class MetodePembayaran implements Pembayaran {
    protected double saldo;

    public MetodePembayaran(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void tambahSaldo(double jumlah) {
        this.saldo += jumlah;
        System.out.println("Saldo berhasil ditambah: " + jumlah);
    }

    public abstract void info();
}
