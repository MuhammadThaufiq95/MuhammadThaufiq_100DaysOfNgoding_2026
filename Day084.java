/*
 * Day 84: (Latihan) Determining the maximum value in an array
 */
package pkg100daysofngoding;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Day084 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Size: ");
        int n =  sc.nextInt();
        
        if (n <= 0) {
            System.err.println("Invalid size");
            sc.close();
            return;
        }
        
        int[] ar = new int[n];
        
        for (int i = 0; i < ar.length; i++) {
            System.out.print("Index "+i+": ");
            ar[i] = sc.nextInt();
        }
        
        int max = ar[0];
        
        for (int i = 1; i < ar.length; i++) {
            if (ar[i] > max) {
                max = ar[i];
            }
        }
        System.out.println(max);
        sc.close();
    }
}
