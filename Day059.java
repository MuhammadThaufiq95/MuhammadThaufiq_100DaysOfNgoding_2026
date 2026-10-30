/*
 * Day 59: (Latihan) Printing the multiples of M from 1-N.
 */
package pkg100daysofngoding;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Day059 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        for (int i = 1; i <= n; i++) {
            if (i % m == 0) {
                if (i > m) {
                    System.out.print(" ");
                }
                System.out.print(i);
            }
        }
        System.out.println();
        sc.close();
    }
}