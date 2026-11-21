/*
 * Day 81: (Latihan) populating array elements and displaying all array elements using a loop
 */
package pkg100daysofngoding;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Day081 {
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
        
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i]);
            if (i < ar.length - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
        sc.close();
    }
}
