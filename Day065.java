/*
 * Day 65: (Latihan) Creating a vertical line pattern.
 */
package pkg100daysofngoding;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Day065 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("+");
        }
        sc.close();
    }
}