/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum200525;

/**
 *
 * @author Ari
 */
public class TestPolymorfism {
    public static void main(String[] args){
        Elektronik barang1 = new Elektronik("Samsung", 2025, 3);
        barang1.display();
        System.out.println("");

        SmartWatch barang2 = new SmartWatch("Xiaomi", 2023, 1, 400, 2, 2, true);
        barang2.display();
        System.out.println("");

        Elektronik barang3 = new Laptop("Hp", 2025, 2, 14, 32);
        barang3.display();
        System.out.println("");

        Smartphone barang4 = new SmartWatch("Apple", 2025, 3, 1500, 1, 2, false);
        barang4.display();
    }
}