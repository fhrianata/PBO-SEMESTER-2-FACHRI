/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum200525;

/**
 *
 * @author Ari
 */
public class Smartphone extends Elektronik {
    private int kapasitasBaterai;
    private int jumlahKamera;

    public Smartphone() {}

    public Smartphone(String merek, int tahunProduksi, int garansi, int kapasitasBaterai, int jumlahKamera) {
        super(merek, tahunProduksi, garansi);
        this.kapasitasBaterai = kapasitasBaterai;
        this.jumlahKamera = jumlahKamera;
    }

    public int getKapasitasBaterai() {
        return kapasitasBaterai;
    }

    public void setKapasitasBaterai(int kapasitasBaterai) {
        this.kapasitasBaterai = kapasitasBaterai;
    }

    public int getJumlahKamera() {
        return jumlahKamera;
    }

    public void setJumlahKamera(int jumlahKamera) {
        this.jumlahKamera = jumlahKamera;
    }
    
    @Override
    public void display() {
        System.out.println("Kelas Smartphone");
        System.out.println("Merek : " + getMerek());
        System.out.println("Tahun Produksi : " + getTahunProduksi());
        System.out.println("Garansi : " + getGaransi() + " tahun");
        System.out.println("Kapasitas Baterai : " + getKapasitasBaterai() + " mAh");
        System.out.println("Jumlah Kamera : " + getJumlahKamera());
    }
}