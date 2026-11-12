/*
 * Day 72: (Latihan) Summing numbers (stop when a negative number is entered)
 */
package pkg100daysofngoding;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Day072 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int total = 0;
        int a;
        
        while (true) {
            System.out.print("Enter a number: ");
            a = sc.nextInt();
            if (a < 0) {
                break;
            }
            total += a;
        }
        System.out.println("Sum result: "+total);
        sc.close();
    }
}