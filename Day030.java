/*
 * Day 30: comparison operator (part 3): <= and >= 
 */
package pkg100daysofngoding;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Day030 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        boolean hasil1 = a <= b;
        boolean hasil2 = a >= b;
        
        System.out.println(hasil1);
        System.out.println(hasil2);
        System.out.println();
        
        //cara kedua, seperti dibawah
        
        System.out.println(a <= b);
        System.out.println(a >= b);
        
        sc.close();
    }
}
