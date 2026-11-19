/*
 * Day 79: 1D Array
 */
package pkg100daysofngoding;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Day079 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Size: ");
        int n = sc.nextInt();
        
        int[] rows = new int[n];
        
        for (int i = 0; i < n; i++) {
            System.out.print("Element "+(i + 1)+": ");
            rows[i] = sc.nextInt();
        }
        
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print(rows[i]);
            if (i < n - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
        sc.close();
    }
}