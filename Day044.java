/*
 * Day 44: Grading system program (A, B, C, D, E)
 */
package pkg100daysofngoding;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Day044 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int nilai = sc.nextInt();
        
        if (nilai > 90) {
            System.out.println("A");
        } else if (nilai <= 90 && nilai > 85) {
            System.out.println("B");
        } else if (nilai <= 85 && nilai > 75) {
            System.out.println("C");
        } else if (nilai <= 75 && nilai > 70) {
            System.out.println("D");
        } else {
            System.out.println("E");
        }
        sc.close();
    }
}
