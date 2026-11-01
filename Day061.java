/*
 * Day 61: (Latihan) multiplying numbers from 1-N.
 */
package pkg100daysofngoding;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Day061 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int total = 1;
        
        for (int i = 1; i <= n; i++) {
            System.out.print(i);
            if (i < n) {
                System.out.print(" * ");
            }
            total *= i;
        }
        System.out.println(" = "+total);
    }
}