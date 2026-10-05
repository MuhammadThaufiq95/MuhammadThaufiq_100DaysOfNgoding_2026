/*
 * Day 34: Branching (part 2)
 * (if-else if-else)
 */
package pkg100daysofngoding;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Day034 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int nilai = sc.nextInt();
        
        if (nilai >= 90) {
            System.out.println("Lulus");
        } else if (nilai < 90 && nilai >= 75) {
            System.out.println("Masih aman");
        } else if (nilai > 40 && nilai < 75) {
            System.out.println("Mengulang");
        } else {
            System.err.println("Gagal");
        }
    }
}