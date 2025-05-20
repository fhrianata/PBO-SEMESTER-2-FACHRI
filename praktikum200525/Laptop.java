/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum200525;

/**
 *
 * @author Ari
 */
public class Laptop extends Elektronik {
    private int ukuranLayar;
    private int kapasitasRAM;

    public Laptop() {}

    public Laptop(String merek, int tahunProduksi, int garansi, int ukuranLayar, int kapasitasRAM) {
        super(merek, tahunProduksi, garansi);
        this.ukuranLayar = ukuranLayar;
        this.kapasitasRAM = kapasitasRAM;
    }

    public int getUkuranLayar() {
        return ukuranLayar;
    }

    public void setUkuranLayar(int ukuranLayar) {
        this.ukuranLayar = ukuranLayar;
    }

    public int getKapasitasRAM() {
        return kapasitasRAM;
    }

    public void setKapasitasRAM(int kapasitasRAM) {
        this.kapasitasRAM = kapasitasRAM;
    }
    
    @Override
    public void display() {
        System.out.println("Kelas Laptop");
        System.out.println("Merek : " + getMerek());
        System.out.println("Tahun Produksi : " + getTahunProduksi());
        System.out.println("Garansi : " + getGaransi() + " tahun");
        System.out.println("Ukuran Layar : " + getUkuranLayar() + " inch");
        System.out.println("Kapasitas RAM : " + getKapasitasRAM() + " GB");
    }
}