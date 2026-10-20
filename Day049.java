/*
 * Day 49: Operator Ternary
 */
package pkg100daysofngoding;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Day049 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //menentukan bilangan ganjil/genap
        int a = sc.nextInt();
        
        String hasil = (a % 2 == 0) ? "Genap" : "Ganjil";
        System.out.println(hasil);
        
        //menentukan nilai mutlak
        int mutlak = sc.nextInt();
        
        int output = (mutlak < 0) ? -mutlak : mutlak;
        System.out.println("\n"+output);
    }
}
