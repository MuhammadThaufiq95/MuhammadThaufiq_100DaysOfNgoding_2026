/*
 * Day 33: Branching (if-else)
 */
package pkg100daysofngoding;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Day033 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        
        boolean kondisi;
        
        if (a >= 10 && a < 20) {
            kondisi = true;
        } else {
            kondisi = false;
        }
        
        System.out.println("\n"+kondisi);
    }
}