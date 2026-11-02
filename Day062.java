/*
 * Day 62: Nested loop
 */
package pkg100daysofngoding;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Day062 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Kolom: ");
        int k = sc.nextInt();
        System.out.print("Baris: ");
        int b = sc.nextInt();
        for (int i = 1; i <= b; i++) {
            for (int j = 1; j <= k; j++) {
                System.out.print("+");
                if (j < k) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}