/*
 * Day 75: String method for checking [equals(), equalsIgnoreCase(), contains(), isEmpty()].
 */
package pkg100daysofngoding;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Day075 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("==== ISC REGISTRATION FORM ====");
        System.out.print("Name      : ");
        String nama = sc.nextLine();
        System.out.print("Email     : ");
        String email = sc.nextLine();
        System.out.print("Password  : ");
        String password = sc.nextLine();
        System.out.print("Confirm   : ");
        String konfr = sc.nextLine();
        System.out.print("Agreement : ");
        String setuju = sc.nextLine();
        
        if (nama.isEmpty() || email.isEmpty() || password.isEmpty() || konfr.isEmpty() || setuju.isEmpty()) {
            System.err.println("ERROR: input must not be empty");
        } else if (!email.contains("@")) {
            System.err.println("ERROR: email format must be correct");
        } else if (!password.equals(konfr)) {
            System.err.println("ERROR: Incorrect password");
        } else if (!setuju.equalsIgnoreCase("yes")) {
            System.err.println("ERROR: Not agreed yet");
        } else {
            System.out.println("\nRegistration success, hi "+nama);
        }
    }
}