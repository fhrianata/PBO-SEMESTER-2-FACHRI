/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PraktikumOnline250325;

/**
 *
 * @author Ari
 */
public class PersegiPanjangTest {
    public static void main(String[] args) {
        System.out.println("Jumlah objek saat ini: "+PersegiPanjangEnkapsulasi.getJumlahObjek());
        
        PersegiPanjangEnkapsulasi pp1 = new PersegiPanjangEnkapsulasi();

        pp1.setPanjang(15);
        pp1.setLebar(7);
        
        System.out.println("Objek : "+PersegiPanjangEnkapsulasi.getJumlahObjek());
        System.out.println("Panjang: " + pp1.getPanjang());
        System.out.println("Lebar: " + pp1.getLebar());
        System.out.println("Luas: " + pp1.getLuas());
        System.out.println("Keliling: " + pp1.getKeliling());
        System.out.println("Jumlah objek yang telah dibuat: " + PersegiPanjangEnkapsulasi.getJumlahObjek());
        System.out.println();
        
        PersegiPanjangEnkapsulasi pp2 = new PersegiPanjangEnkapsulasi(7, 4);
        
        System.out.println("Objek : "+PersegiPanjangEnkapsulasi.getJumlahObjek());
        System.out.println("Panjang: " + pp2.getPanjang());
        System.out.println("Lebar: " + pp2.getLebar());
        System.out.println("Luas: " + pp2.getLuas());
        System.out.println("Keliling: " + pp2.getKeliling());
        System.out.println("Jumlah objek yang telah dibuat: " + PersegiPanjangEnkapsulasi.getJumlahObjek());
        System.out.println();
    }
}