/*
 * Day 86: (Latihan) searching for an element in an array
 */
package pkg100daysofngoding;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Day086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Size: ");
        int n = sc.nextInt();
        
        if (n <= 0) {
            System.err.println("Invalid size");
            sc.close();
            return;
        }
        
        int[] ar = new int[n];
        
        for (int i = 0; i < ar.length; i++) {
            System.out.print("Index "+i+": ");
            ar[i] = sc.nextInt();
        }
        
        System.out.print("Target: ");
        int tg = sc.nextInt();
        
        boolean found = false;
        int index = -1;
        
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] == tg) {
                found = true;
                index = i;
                break;
            }
        }
        
        if (found) {
            System.out.println("Found on index "+index);
        } else {
            System.err.println("Not found");
        }
        sc.close();
    }
}