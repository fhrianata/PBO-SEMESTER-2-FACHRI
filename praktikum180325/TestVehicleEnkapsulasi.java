/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum180325;

/**
 *
 * @author Ari
 */

import java.util.Scanner;

public class TestVehicleEnkapsulasi {
    public static void main(String[] args){
        System.out.println("Kendaraan 1. Beban Maksimal 10.000kg");
        VehicleEnkapsulasi kendaraan1 = new VehicleEnkapsulasi(10000);
        
        //menambahkan beban
        System.out.println("Menambahkan beban 1. (500 kg)"+kendaraan1.addLoad(500));
        System.out.println("Menambahkan beban 2. (250 kg)"+kendaraan1.addLoad(500));
        System.out.println("Menambahkan beban 3. (500 kg)"+kendaraan1.addLoad(500));
        System.out.println("Menambahkan beban 4. (4000 kg)"+kendaraan1.addLoad(500));
        System.out.println("Menambahkan beban 5. (350 kg)"+kendaraan1.addLoad(500));
        
        
        
        //membuat objek kendaraan 2 menggunakan constructor kosong/default constructor
        Scanner in = new Scanner(System.in);
        System.out.println("Kendaraan 2. Beban maksimaal belum ada.");
        VehicleEnkapsulasi kendaraan2 = new VehicleEnkapsulasi();
        //set maxLoad menggunakan setmaxLoad
        System.out.print("Masukkan beban maksimal kendaraan : ");
        double bebanmax = in.nextDouble();
        kendaraan2.setMaxLoad(bebanmax);
        
        kendaraan2.setMaxLoad(15000);
        //isi beban pada kendaraan
       System.out.print("Masukkan berat beban yang akan diletakkan di kendaraan 2 = ");
            double beban = in.nextDouble();
            while(kendaraan2.addLoad(beban)){ //while ulang = 'Y' maka lanjut menambah, while ulang = 'T' maka berhenti menambah
                System.out.println("Beban ditambahkan = "+beban+" kg");
                System.out.print("Masukkan berat beban yang akan diletakkan di kendaraan 2 = ");
                beban = in.nextDouble();
            }
            if (kendaraan2.addLoad(beban)){
                System.out.println("Beban kedaraan saat ini = "+kendaraan2.getLoad()+ "kg");
                System.out.println("Beban akan berlebih. Penambahan beban ");
            }else
                System.out.println("Beban kenSdaraan saat ini = "+kendaraan2.getLoad()+ "kg");
            //endif
        
        //menampilkan beban kendaraan saat ini
        System.out.println("Beban kendaraan saat ini = "+kendaraan1.getLoad()+ "kg");
    }
}
