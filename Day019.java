/*
 * Day 19: Manual/Forced Convertion
 */
package pkg100daysofngoding;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Day019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number: ");
        double data = sc.nextDouble();
        
        int converted = (int) data;
        
        System.out.println("\n\nBefore convertion: "+data);
        System.out.println("After Convertion : "+converted);
    }
}
