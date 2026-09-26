/*
 * Day 25: Calculating the area of a circle
 */
package pkg100daysofngoding;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Day025 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        final double pi = 3.14;
        
        System.out.print("Masukkan Rusuk  : ");
        double rusuk = sc.nextDouble();
        
        double hasil = pi * rusuk * rusuk;
        
        System.out.println("\nHasil\t\t: "+hasil);
    }
}
