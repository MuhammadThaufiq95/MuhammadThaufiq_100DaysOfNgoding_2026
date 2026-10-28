/*
 * Day 57: (Latihan) Print odd number and even number from n-1
 */
package pkg100daysofngoding;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Day057 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n =  sc.nextInt();
        for (int i = 1; i < n; i++) {
            if (i % 2 == 0) {
                System.out.print(i);
                if (i < n) {
                    System.out.print(" ");
                }
            }
        }
        System.out.println();
        for (int i = 1; i < n; i++) {
            if (i % 2 != 0) {
                System.out.print(i);
                if (i < n) {
                    System.out.print(" ");
                }
            }
        }
        System.out.println();
    }
}