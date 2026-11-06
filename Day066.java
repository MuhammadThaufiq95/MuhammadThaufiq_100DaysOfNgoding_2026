/*
 * Day 66: (Latihan) Creating a horizontal line pattern
 */
package pkg100daysofngoding;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Day066 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        for (int i = 1; i <= n; i++) {
            System.out.print("+");
            if (i < n) {
                System.out.print(" ");
            }
        }
        System.out.println();
        sc.close();
    }
}