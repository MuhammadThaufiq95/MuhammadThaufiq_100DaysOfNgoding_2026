/*
 * Day 71: (Latihan) Creating am inverted right-angled triangle pattern
 */
package pkg100daysofngoding;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Day071 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("+");
                if (j < n - i + 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}