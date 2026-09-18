/*
 * Day 17: Assignment operator
 */
package pkg100daysofngoding;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Day017 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        
        System.out.print("Enter number: ");
        double number = inp.nextInt();
        
        System.out.print("\nEnter number for operation (+): ");
        int plus = inp.nextInt();
        number += plus;
        System.out.println("Result: "+number);
        
        System.out.print("\nEnter number for operation (-): ");
        int minus = inp.nextInt();
        number -= minus;
        System.out.println("Result: "+number);
        
        System.out.print("\nEnter number for operation(*): ");
        int multi = inp.nextInt();
        number *= multi;
        System.out.println("Result: "+number);
        
        System.out.print("\nEnter number for operation(/): ");
        int division = inp.nextInt();
        number /= division;
        System.out.println("Result: "+number);
        
        System.out.print("\nEnter number for operation (%): ");
        int remain = inp.nextInt();
        
        if (remain != 0) {
            number %= remain;
            System.out.println("Result: "+number);
        } else {
            System.err.println("Error: Cannot perfom modulo operation with 0");
        }
    }
}
