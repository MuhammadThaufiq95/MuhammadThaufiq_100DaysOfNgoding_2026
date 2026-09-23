/*
 * Day 22: swapping the values of two variable
 */
package pkg100daysofngoding;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Day022 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Insert first number : ");
        int a = sc.nextInt();
        
        System.out.print("Insert second number: ");
        int b = sc.nextInt();
        
        System.out.print("\n\nBefore swap: ");
        System.out.print(a);
        System.out.print(b);
        
        int temp;
        
        temp = a;
        a = b;
        b = temp;
        
        System.out.print("\nAfter swap : ");
        System.out.print(a);
        System.out.println(b);
    }
}
