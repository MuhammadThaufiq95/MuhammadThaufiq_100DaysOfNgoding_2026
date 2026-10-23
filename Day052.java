/*
 * Day 52: Loop while
 */
package pkg100daysofngoding;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Day052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int i = sc.nextInt();
        
        while (i < 10) {
            i++;
            System.out.println(i);
        }
    }
}