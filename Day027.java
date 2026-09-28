/*
 * Day 27: increment dan decrement
 */
package pkg100daysofngoding;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Day027 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        
        System.out.println("Awal: "+number);
        
        number++;
        System.out.println("Postfix Increment: "+number);
        ++number;
        System.out.println("Prefix Increment : "+number);
        
        int number2 = sc.nextInt();
        
        number2--;
        System.out.println("Postfix Decrement: "+number2);
        --number2;
        System.out.println("Prefix Decrement : "+number2);
    }
}
