/*
 * Day 87: (Latihan) manipulating a data in an array
 */
package pkg100daysofngoding;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Day087 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Size: ");
        int n = sc.nextInt();
        
        if (n <= 0) {
            System.err.println("Invalid input");
            sc.close();
            return;
        }
        
        int[] ar = new int[n];
        
        for (int i = 0; i < ar.length; i++) {
            System.out.print("Index "+i+": ");
            ar[i] = sc.nextInt();
        }
        
        System.out.print("Index number: ");
        int index = sc.nextInt();
        System.out.print("new value   : ");
        int nValue = sc.nextInt();
        
        if (index >= 0 && index < ar.length) {
            ar[index] = nValue;
        } else {
            System.err.println("Invalid index");
            sc.close();
            return;
        }
        
        for (int i = 0; i < ar.length; i++) {
            ar[i] *= 2;
        }
        
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i]);
            if (i < ar.length - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
        sc.close();
    }
}