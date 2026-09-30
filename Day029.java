/*
 * Day 29: Comparison operator (part 2): < and >
 */
package pkg100daysofngoding;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Day029 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        boolean lessThan= a < b;
        boolean greaterThan = a > b;
        
        System.out.println(lessThan);
        System.out.println(greaterThan);
        System.out.println();
        
        //atau bisa juga memakai cara dibawah ini
        System.out.println(a < b);
        System.out.println(a > b);
    }
}