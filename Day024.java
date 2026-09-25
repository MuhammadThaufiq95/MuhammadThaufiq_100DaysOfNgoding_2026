/*
 * Day 24: Calculating the area of Rectangle
 */
package pkg100daysofngoding;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Day024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan Panjang: ");
        int panjang = sc.nextInt();
        System.out.print("Masukkan Tinggi : ");
        int lebar = sc.nextInt();
        
        int hasil = panjang * lebar;
        
        System.out.println("\nHasil Luas      : "+hasil);
        
        sc.close();
    }
}
