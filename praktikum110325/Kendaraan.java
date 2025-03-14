/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum110325;

/**
 *
 * @author Ari
 */
public class Kendaraan {
    String jenis;
    String merk;
    int tahun;
    String warna;
    
    
    //constructor
    public Kendaraan(String j,String m, int t, String w){
        this.jenis=j;
        this.merk=m;
        this.tahun=t;
        this.warna=w;
    }
    //method tanpa parameter
    public void InfoKendaraan(){
        System.out.println("DATA KENDARAAN");
        System.out.println("Jenis Kendaraan = "+jenis);
        System.out.println("Merk Kendaraan = "+merk);
        System.out.println("Warna Kendaraan = "+warna);
        System.out.println("Tahun Keluaran = "+tahun);
    }
    //method dengan parameter
    public void CekHarga(int harga){
        System.out.println("Harga sewa kendaraan Rp "+harga);
    }
    //
    public void CekKendaraan(int v){
        if(v<20)
            System.out.println("Lebih baik jalan saja");
        else if(v>=20 && v<=40)
            System.out.println("Kendaraan anda slow");
        else if(v>=41 && v<=60)
            System.out.println("Kecepatan anda medium");
        else if(v>=61 && v<=85)
            System.out.println("Kecepatan anda fast");
        else if(v>85)
            System.out.println("Kecepatan anda racing");
        else
            System.out.println("Kendaraan tidak layak pakai");
    }
}
