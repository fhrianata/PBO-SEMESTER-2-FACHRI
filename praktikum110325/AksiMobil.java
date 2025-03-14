/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum110325;

/**
 *
 * @author Ari
 */
public class AksiMobil {
    public static void main(String[] args){
        Mobil mobilku=new Mobil();
            mobilku.merk="Toyota";
            mobilku.plat="BA 1234 L";
            mobilku.tahun=2004;
            mobilku.warna="Hitam";
        System.out.println("-------------");
        System.out.println("Data Mobil 1");
        System.out.println("Merk Mobil = "+mobilku.merk);
        System.out.println("Plat Mobil = "+mobilku.plat);
        System.out.println("Tahun Keluaran = "+mobilku.tahun);
        System.out.println("Warna Mobil = "+mobilku.warna);
        ///pemanggilan method
        mobilku.MobilAktif();
        System.out.println(mobilku.SuaraMobil());
        
        Mobil mobilf=new Mobil();
            mobilf.merk="Civic";
            mobilf.plat="BM 1234 O";
            mobilf.tahun=2005;
            mobilf.warna="Kuning";
        System.out.println("-------------");
        System.out.println("Data Mobil 2");
        System.out.println("Merk Mobil = "+mobilf.merk);
        System.out.println("Plat Mobil = "+mobilf.plat);
        System.out.println("Tahun Keluaran = "+mobilf.tahun);
        System.out.println("Warna Mobil = "+mobilf.warna);
    }
    
}
