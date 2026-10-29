/*
 * Day 58: (Latihan) Print odd and even number from N-1
 */
package pkg100daysofngoding;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Day058 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        for (int i = n; i >= 1; i--) {
            if (i % 2 == 0) {
                System.out.print(i);
                if (i > 1) {
                    System.out.print(" ");
                }
            }
        }
        System.out.println();
        for (int i = n; i >= 1; i--) {
            if (i % 2 != 0) {
                System.out.print(i);
                if (i > 1) {
                    System.out.print(" ");
                }
            }
        }
        System.out.println();
    }
}