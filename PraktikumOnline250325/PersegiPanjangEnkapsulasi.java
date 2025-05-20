/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PraktikumOnline250325;

/**
 *
 * @author Ari
 */
public class PersegiPanjangEnkapsulasi {
    private int panjang;
    private int lebar;
    private static int jumlahObjek = 0;
    
    public PersegiPanjangEnkapsulasi() {
        this.panjang = 0;
        this.lebar = 0;
        jumlahObjek++;
    }
    
    public PersegiPanjangEnkapsulasi(int panjangBaru, int lebarBaru){
        this.panjang = panjangBaru;
        this.lebar = lebarBaru;
        jumlahObjek++;
    }
    
    public void setPanjang(int panjangBaru){
        this.panjang = panjangBaru;
    }
    
    public int getPanjang() {
        return panjang;
    }
    
    public void setLebar(int lebarBaru){
        this.lebar = lebarBaru;
    }
    
    public int getLebar() {
        return lebar;
    }
    
    public static int getJumlahObjek() {
        return jumlahObjek;
    }

    public int getLuas() {
        return panjang * lebar;
    }
    
    public int getKeliling() {
        return 2 *(panjang + lebar);
    }
}