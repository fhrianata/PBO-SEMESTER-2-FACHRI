/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum200525;

/**
 *
 * @author Ari
 */
public class SmartWatch extends Smartphone {
    private int ukuranLayar;
    private boolean tahanAir;

    public SmartWatch() {}

    public SmartWatch(String merek, int tahunProduksi, int garansi, int kapasitasBaterai, int jumlahKamera, int ukuranLayar, boolean tahanAir) {
        super(merek, tahunProduksi, garansi, kapasitasBaterai, jumlahKamera);
        this.ukuranLayar = ukuranLayar;
        this.tahanAir = tahanAir;
    }

    public int getUkuranLayar() {
        return ukuranLayar;
    }

    public void setUkuranLayar(int ukuranLayar) {
        this.ukuranLayar = ukuranLayar;
    }

    public boolean isTahanAir() {
        return tahanAir;
    }

    public void setTahanAir(boolean tahanAir) {
        this.tahanAir = tahanAir;
    }
    
    @Override
    public void display() {
        System.out.println("Kelas SmartWatch");
        System.out.println("Merek : " + getMerek());
        System.out.println("Tahun Produksi : " + getTahunProduksi());
        System.out.println("Garansi : " + getGaransi() + " tahun");
        System.out.println("Kapasitas Baterai : " + getKapasitasBaterai() + " mAh");
        System.out.println("Jumlah Kamera : " + getJumlahKamera());
        System.out.println("Ukuran Layar : " + ukuranLayar + " inch");
        System.out.println("Tahan Air? " + (tahanAir ? "Yes" : "No"));
    }
}
