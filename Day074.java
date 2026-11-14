/*
 * Day 74: Basic string method (length(), toUpperCase(), toLowerCase()).
 */
package pkg100daysofngoding;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Day074 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String text = sc.nextLine();
        
        int value = text.length();
        String upper = text.toUpperCase();
        String lower = text.toLowerCase();
        
        System.out.println("\n"+value);
        System.out.println(upper);
        System.out.println(lower);
    }
}