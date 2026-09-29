/*
 * Day 27: comparison operator [==] and [!=]
 */
package pkg100daysofngoding;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Day028 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        boolean result1 = a == b;
        boolean result2 = a != b;
        
        System.out.println(result1);
        System.out.println(result2);
        System.out.println();
        
        // Atau bisa juga seperti di bawah ini
        
        System.out.println(a == b);
        System.out.println(a != b);
    }
}