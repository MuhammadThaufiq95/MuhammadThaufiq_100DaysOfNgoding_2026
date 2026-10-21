/*
 * Day 50: (Latihan) creating an odd-even program using a ternary operator
 */
package pkg100daysofngoding;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Day050 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        String hasil = (a % 2 == 0) ? "Genap" : "Ganjil";
        System.out.println(hasil);
        sc.close();
    }
}
