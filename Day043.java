/*
 * Day 43: (latihan) Program multiples of 3.5, 3, and 5
 */
package pkg100daysofngoding;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Day043 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        
        if (a % 3 == 0 && a % 5 == 0) {
            System.out.println("Kelipatan 3 dan 5");
        } else if (a % 3 == 0) {
            System.out.println("Kelipatan 3");
        } else if (a % 5 == 0) {
            System.out.println("Kelipatan 5");
        } else {
            System.err.println("Bukan kelipatan 3 maupun 5");
        }
        sc.close();
    }
}
