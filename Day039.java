/*
 * Day 39: (latihan) making a calculator using if statement
 */
package pkg100daysofngoding;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Day039 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter number: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        System.out.println("\n=====================");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");
        System.out.print("Choose an operator: ");
        int pilihan = sc.nextInt();
        
        if (pilihan == 1) {
            System.out.println("\n"+a+" + "+b+" = "+(a+b));
        } else if (pilihan == 2) {
            System.out.println("\n"+a+" - "+b+" = "+(a-b));
        } else if (pilihan == 3) {
            System.out.println("\n"+a+" * "+b+" = "+(a*b));
        } else if (pilihan == 4) {
            if (b != 0) {
                System.out.println("\n"+a+" / "+b+" = "+(a/b));
            } else {
                System.err.println("\nERROR: Cannot divide by 0!");
            }
        } else {
            System.err.println("\nERROR: Invalid operation!");
        }
        sc.close();
    }
}