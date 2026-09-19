/*
 * Day 18: Automatic Convertion (from small data type to big data type).
 */
package pkg100daysofngoding;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Day018 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        
        System.out.print("Enter number: ");
        int data = inp.nextInt();
        
        double converted = data;
        
        System.out.println("\nBefore convertion: "+data);
        System.out.println("After convertion : "+converted);
    }
}