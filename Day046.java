/*
 * Day 46: (Latihan) Creating a menu using switch-case
 */
package pkg100daysofngoding;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Day046 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("==== Kalkulator Perhitungan Bangun Datar ====");
        System.out.println("1. Hitung luas persegi");
        System.out.println("2. Hitung luas persegi panjang");
        System.out.println("3. Hitung luas lingkaran");
        System.out.println("4. Hitung luas segitiga");
        
        System.out.print("Pilihan: ");
        int choice = sc.nextInt();
        
        switch (choice) {
            case 1:
                System.out.print("\nSisi: ");
                int sisi = sc.nextInt();
                
                int hasil = sisi * sisi;
                System.out.println("Hasil: "+hasil);
                break;
            case 2:
                System.out.print("\nPanjang: ");
                int panjang = sc.nextInt();
                System.out.print("Lebar  : ");
                int lebar = sc.nextInt();
                
                int hasil2 = panjang * lebar;
                System.out.println("Hasil: "+hasil2);
                break;
            case 3:
                final double pi = 3.14;
                System.out.print("\nRusuk: ");
                int r = sc.nextInt();
                
                double hasil3 = pi * r * r;
                System.out.printf("Hasil: %.2f",hasil3);
                break;
            case 4:
                System.out.print("\nAlas  : ");
                int alas = sc.nextInt();
                System.out.print("Tinggi: ");
                int tinggi = sc.nextInt();
                
                double hasil4 = 0.5 * alas * tinggi;
                System.out.printf("Hasil: %.2f",hasil4);
                break;
            default:
                System.err.println("\nInvalid option!");
        }
        sc.close();
    }
}
