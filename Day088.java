/*
 * Day 88: Void Method
 */
package pkg100daysofngoding;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Day088 {
    static void printer(String name) {
        System.out.println("Name : "+name);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String alias = sc.nextLine();
        
        printer(alias);
        
        sc.close();
    }
}