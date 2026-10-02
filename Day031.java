/*
 * Day 31: Logical Operator: && (AND), || (OR), and ! (NOT)
 */
package pkg100daysofngoding;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Day031 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        boolean condition1 = a == b;
        boolean condition2 = a < b;
        
        boolean hasil1 = condition1 && condition2;
        boolean hasil2 = condition1 || condition2;
        boolean hasil3 = !condition2;
        
        System.out.println(hasil1);
        System.out.println(hasil2);
        System.out.println(hasil3);
        System.out.println();
        
        //cara lain
        System.out.println(condition1 && condition2);
        System.out.println(condition1 || condition2);
        System.out.println(!condition2);
        
        sc.close();
    }
}
