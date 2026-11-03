/*
 * Day 63: (Latihan) Calculate the result of M raised to the power of N.
 */
package pkg100daysofngoding;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Day063 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int m = sc.nextInt();
        System.out.print("Pangkat: ");
        int n = sc.nextInt();
        int hasil = 1;
        
        for (int i = 1; i <= n; i++) {
            hasil *= m;
        }
        System.out.println(hasil);
        sc.close();
    }
}