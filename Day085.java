/*
 * Day 85: (Latihan) Determining the minimum value in an array
 */
package pkg100daysofngoding;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Day085 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Size: ");
        int n = sc.nextInt();
        
        if (n <= 0) {
            System.err.println("invalid size");
            sc.close();
            return;
        }
        
        int[] ar = new int[n];
        
        for (int i = 0; i < ar.length; i++) {
            System.out.print("Index "+i+": ");
            ar[i] = sc.nextInt();
        }
        
        int min = ar[0];
        
        for (int i = 1; i < ar.length; i++) {
            if (ar[i] < min) {
                min = ar[i];
            }
        }
        System.out.println(min);
        sc.close();
    }
}