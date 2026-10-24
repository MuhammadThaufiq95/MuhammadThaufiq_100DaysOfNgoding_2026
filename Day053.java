/*
 * Day 53: Loop Do-While
 */
package pkg100daysofngoding;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Day053 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int limit = sc.nextInt();
        int i = sc.nextInt();
        
        do {
            i++;
            System.out.println(i);
        } while (i < limit);
    }
}