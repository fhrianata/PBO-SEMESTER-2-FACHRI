/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum200525;

/**
 *
 * @author Ari
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Laptop laptop = new Laptop("ROG M1", 2022, 2, 15, 16);
        System.out.println("======= Laptop =======");
        laptop.display();

        Smartphone hp = new Smartphone("Xiaomi", 2023, 1, 5000, 4);
        System.out.println("\n=== Smartphone ===");
        hp.display();

        Gaming gamingLaptop = new Gaming("ASUS TUF", 2024, 3, 17, 32, "RTX 5090 PRO GAMING", 165);
        System.out.println("\n=== Gaming Laptop ===");
        gamingLaptop.display();

        System.out.println("\n=== SmartWatch ===");
        System.out.print("Apakah smartwatch tahan air? (Ya/No): ");
        String inputTahanAir = input.nextLine().trim();
        boolean tahanAir = inputTahanAir.equalsIgnoreCase("Ya");

        SmartWatch sw = new SmartWatch("Apple", 2023, 1, 400, 1, 2, tahanAir);
        sw.display();

        input.close();
    }
}