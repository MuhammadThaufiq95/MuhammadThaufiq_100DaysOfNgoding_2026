/*
 * Day 48: (Latihan) Making a calculator using switch-case
 */
package pkg100daysofngoding;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Day048 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("===== Kalkulator Sederhana =====");
        System.out.println("1. Penjumlahan (+)");
        System.out.println("2. Pengurangan (-)");
        System.out.println("3. Perkalian   (*)");
        System.out.println("4. Pembagian   (/)");
        System.out.println("5. Modulo      (%)");
        System.out.print("\nPilihan: ");
        int pilihan = sc.nextInt();
        
        int a;
        int b;
        
        switch (pilihan) {
            case 1:
                System.out.println("\n----- Penjumlahan -----");
                System.out.println("Masukkan dua angka: ");
                a = sc.nextInt();
                b = sc.nextInt();
                System.out.println("\n"+a+" + "+b+" = "+(a + b));
                break;
            case 2:
                System.out.println("\n----- Pengurangan -----");
                System.out.println("Masukkan dua angka: ");
                a = sc.nextInt();
                b = sc.nextInt();
                System.out.println("\n"+a+" - "+b+" = "+(a - b));
                break;
            case 3:
                System.out.println("\n----- Perkalian -----");
                System.out.println("Masukkan dua angka: ");
                a = sc.nextInt();
                b = sc.nextInt();
                System.out.println("\n"+a+" * "+b+" = "+(a * b));
                break;
            case 4:
                System.out.println("\n----- Pembagian -----");
                System.out.println("Masukkan dua angka: ");
                a = sc.nextInt();
                b = sc.nextInt();
                double hasil = (double) a / b;
                System.out.printf("\n%d / %d = %.2f%n", a, b, hasil);
                break;
            case 5:
                System.out.println("\n----- modulo -----");
                System.out.println("masukkan dua angka: ");
                a = sc.nextInt();
                b = sc.nextInt();
                System.out.println("\n"+a+" % "+b+" = "+(a % b));
                break;
            default:
                System.err.println("ERROR: Invalid input");
        }
    }
}
