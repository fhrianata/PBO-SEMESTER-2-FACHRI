/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum150425;

import java.util.Scanner;

/**
 *
 * @author Ari
 */
public class PesawatDemoDinamis {
    
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int i, jumlah, tahunProduksi, muatan;
        boolean mesin;
        String nama;
        String namaMax; //pesawat dengan muatan maksimum
        int besar; //pesawat meampung muatan maksimum
        System.out.print("Masukkan banyak pesawat = ");
        jumlah=input.nextInt();
        input.nextLine();
        
        //deklarasi array
        Pesawat[] daftarPesawat = new Pesawat[jumlah];
        
        //isi array
        for(i=0; i<jumlah; i++){
            System.out.println("Input Pesawat ke"+(i+1));
            System.out.print("Nama Pesawat = ");
            nama=input.nextLine();
            System.out.print("Tahun Produksi = ");
            tahunProduksi=input.nextInt();
            System.out.print("Menggunakan mesin?(true/false) = ");
            mesin=input.nextBoolean();
            System.out.print("Kapasitas muatan penumpang maksimum = ");
            muatan=input.nextInt();
            
            input.nextLine();
            
            daftarPesawat[i] = new Pesawat(nama, tahunProduksi, mesin, muatan);
        }
        System.out.println("\n\n DATA PESAWAT \n\n");
        System.out.println("Data Pesawat ke"+(i+1)+ " = ");
        daftarPesawat[i].cetak();
        System.out.println();
        besar = daftarPesawat[0].getMuatan();
        namaMax= daftarPesawat[0].getNama();
                
        for(i=0;i<jumlah;i++){
            System.out.println("Data Pesawat ke"+(i+1)+ " = ");
            daftarPesawat[i].cetak();
            if(daftarPesawat[i].getMuatan()>besar){
                besar=daftarPesawat[i].getMuatan();
                namaMax=daftarPesawat[i].getNama();
            }
            System.out.println();
        }     
        System.out.println("Pesawat dengan muatan terbanyak adalah Pesawat "+namaMax+" dengan kapasitas maksimum "+besar);
    }
}
