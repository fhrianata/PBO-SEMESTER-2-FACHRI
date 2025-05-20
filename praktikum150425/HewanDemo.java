/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum150425;

/**
 *
 * @author Ari
 */
public class HewanDemo {
    public static void main(String[] args){
        //buat objek
        Hewan hewanumum = new Hewan("Makhluk hidup");
        Kucing kucingku = new Kucing("Bobby");
        Anjing anjingku = new Anjing("Timmy");
        
        hewanumum.tampilkanNama();
        hewanumum.Suara();
        
        System.out.println();
        kucingku.tampilkanNama();
        kucingku.Suara();
        System.out.println();
        anjingku.tampilkanNama();
        anjingku.Suara();
    }
}
