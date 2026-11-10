/*
 * Day 70: (Latihan) creating a right-angled triangle pattern
 */
package pkg100daysofngoding;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Day070 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int a = 0;
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("+");
                if (j < i) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}