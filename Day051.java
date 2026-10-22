/*
 * Day 51: For Loop
 */
package pkg100daysofngoding;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Day051 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int limit = sc.nextInt();
        for (int i = 1; i <= limit; i++) {
            System.out.println(i);
        }
    }
}