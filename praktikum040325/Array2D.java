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
public class Array2D {
    public static void main(String[] args){
        int M[][];
        int i,j,b,k;
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Masukkan jumlah baris = ");
        b=in.nextInt();
        System.out.print("Masukkan jumlah kolom = ");
        k=in.nextInt();
        M=new int [b][k];
        for(i=0;i<b;i++){
            for (j=0;j<k;j++){
                M[i][j]=random.nextInt(100)+1;
                System.out.print(M[i][j]+"\t");
            }
            System.out.println();
        }
        
    }
}
