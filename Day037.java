/*
 * Day 37: determine the positive number, negative number, and 0
 */
package pkg100daysofngoding;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Day037 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int number = sc.nextInt();
        
        if (number > 0) {
            System.out.println("\nPositif");
        } else if (number < 0) {
            System.out.println("\nNegatif");
        } else {
            System.out.println("\nNol");
        }
        sc.close();
    }
}
