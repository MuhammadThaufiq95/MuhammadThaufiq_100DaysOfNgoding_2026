/*
 * Day 69: (Latihan) creating a rectangle pattern
 */
package pkg100daysofngoding;

import java.util.Scanner;


/**
 *
 * @author ASUS
 */
public class Day069 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int p = sc.nextInt();
        int l = sc.nextInt();
        
        for (int i = 1; i <= l; i++) {
            for (int j = 1; j <= p; j++) {
                System.out.print("+");
                if (j < p) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}