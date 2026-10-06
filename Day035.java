/*
 * Day 35: Nested if
 */
package pkg100daysofngoding;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Day035 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        
        if (a >= 10 && a < 21) {
            if (a % 2 == 0) {
                System.out.println("true");
            } else {
                System.err.println("false");
            }
        } else {
            System.err.println("false");
        }
    }
}
