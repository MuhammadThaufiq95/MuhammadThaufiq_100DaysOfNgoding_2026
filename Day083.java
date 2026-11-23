/*
 * Day 83: (Latihan) Summing array elements
 */
package pkg100daysofngoding;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Day083 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Size: ");
        int n = sc.nextInt();
        
        if (n <= 0) {
            System.err.println("Invalid size");
            sc.close();
            return;
        }
        
        int[] ar = new int[n];
        int total = 0;
        System.out.println();
        for (int i = 0; i < ar.length; i++) {
            System.out.print("Index "+i+": ");
            ar[i] = sc.nextInt();
            total += ar[i];
        }
        System.out.println();
        System.out.println(total);
        sc.close();
    }
}