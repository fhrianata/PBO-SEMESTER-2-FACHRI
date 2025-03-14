/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum040325;

/**
 *
 * @author Ari
 */

import java.util.Scanner;
import java.util.Random;

public class inputrandomjava {
    public static void main(String[] args){
        int A[],n,i;
        int Jmlgenap = 0, banyak = 0;
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("Masukkan banyak data : ");
        n = in.nextInt();
        A = new int[n];
        System.out.println("==Data Anda==");
        for(i=0; i<n; i++)
        {
            A[i] = rand.nextInt(100)+1;
            System.out.print(A[i]+"\t");
        }
        System.out.println("==DATA ARRAY BERNILAI GENAP==");
        for(i=0; i<n; i++){
            if (A[i] % 2 == 0){
            System.out.print(A[i] + "\t");
            Jmlgenap +=A[i]; //bisa juga Jumlgenap = Jmlgenap+A[i]
            banyak++;
            }
        }
        System.out.println();
        System.out.println("Jumlah Data Array Bernilai Genap = " +Jmlgenap);
        System.out.println("Total Data Array Bernilai Genap = " +banyak);
    }
}
