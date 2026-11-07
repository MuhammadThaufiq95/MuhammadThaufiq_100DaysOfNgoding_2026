/*
 * Day 67: (latihan) Creating a square pattern
 */
package pkg100daysofngoding;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Day067 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("+");
                if (j < n) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}