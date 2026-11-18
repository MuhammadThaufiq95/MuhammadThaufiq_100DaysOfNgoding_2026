/*
 * Day 78: (Latihan) Creating an account and logging in (using a loop that terminates once the username and password are correct).
 */
package pkg100daysofngoding;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Day078 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("===== Create your account =====");
        System.out.print("Set username: ");
        String name = sc.nextLine();
        System.out.print("Set password: ");
        String code = sc.nextLine();
        
        boolean success;
        
        do {
            System.out.println("===== Login Page =====");
            System.out.print("Username: ");
            String user = sc.nextLine();
            System.out.print("Password: ");
            String pass = sc.nextLine();
            
            success = user.equalsIgnoreCase(name) && pass.equalsIgnoreCase(code);
            
            System.out.print("\nStatus: ");
            if (success) {
                System.out.print("Login success, hi "+name);
            } else {
                System.out.print("Login failed, try again later");
            }
            System.out.println();
        } while (!success);
        sc.close();
    }
}