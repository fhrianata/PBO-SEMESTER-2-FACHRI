/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum200525;

/**
 *
 * @author Ari
 */
public class Elektronik {
    private String merek;
    private int tahunProduksi;
    private int garansi;

    public Elektronik() {}

    public Elektronik(String merek, int tahunProduksi, int garansi) {
        this.merek = merek;
        this.tahunProduksi = tahunProduksi;
        this.garansi = garansi;
    }

    public String getMerek() {
        return merek;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public int getTahunProduksi() {
        return tahunProduksi;
    }

    public void setTahunProduksi(int tahunProduksi) {
        this.tahunProduksi = tahunProduksi;
    }

    public int getGaransi() {
        return garansi;
    }

    public void setGaransi(int garansi) {
        this.garansi = garansi;
    }

    public void display() {
        System.out.println("Kelas Elektronik");
        System.out.println("Merek : " + merek);
        System.out.println("Tahun Produksi : " + tahunProduksi);
        System.out.println("Garansi : " + garansi + " tahun");
    }
}
