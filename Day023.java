/*
 * Day 23: Calculating the area of a square
 */
package pkg100daysofngoding;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Day023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nilai sisi: ");
        int sisi = sc.nextInt();
        
        int luas = sisi * sisi;
        
        System.out.println("\nLuas : "+luas);
        
        sc.close();
    }
}
