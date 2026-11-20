/*
 * Day 80: (Latihan) access array elements by index.
 */
package pkg100daysofngoding;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Day080 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("ukuran: ");
        int n = sc.nextInt();
        
        if (n <= 0) {
            System.err.println("invalid size");
            return;
        }
        
        int[] array = new int[n];
        
        for (int i = 0; i < n; i++) {
            System.out.print("array ke "+i+": ");
            array[i] = sc.nextInt();
        }
        
        System.out.print("indeks: ");
        int idx = sc.nextInt();
        
        if (idx >= 0 && idx < array.length) {
            System.out.println(array[idx]);
        } else {
            System.err.println("invalid");
        }
        sc.close();
    }
}