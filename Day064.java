/*
 * Day 64: (Latihan) Calculating a factorial
 */
package pkg100daysofngoding;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Day064 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        long hasil = 1;
        
        for (int i = 1; i <= n; i++) {
            hasil *= i;
        }
        System.out.println(hasil);
        sc.close();
    }
}