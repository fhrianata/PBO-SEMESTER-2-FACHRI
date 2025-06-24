/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas270525;

/**
 *
 * @author Ari
 */
public class KartuKredit extends MetodePembayaran {
    private String nama;
    private double limit;

    public KartuKredit(String nama, double limit) {
        super(0); 
        this.nama = nama;
        this.limit = limit;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getLimit() {
        return limit;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }

    @Override
    public void prosesPembayaran(double jumlah) {
        if (jumlah <= limit) {
            limit -= jumlah;
            System.out.println("Pembayaran dengan kartu kredit oleh " + nama + " sebesar " + jumlah + " berhasil.");
        } else {
            System.out.println("Limit kartu kredit tidak mencukupi.");
        }
    }

    @Override
    public void info() {
        System.out.println("Metode: Kartu Kredit, Pemilik: " + nama + ", Limit tersisa: " + limit);
    }
}
