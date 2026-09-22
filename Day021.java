/*
 * Day 21: Converting string into primitive data type
 */
package pkg100daysofngoding;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Day021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your age   : ");
        String number = sc.nextLine();
        int angka = Integer.parseInt(number);
        
        System.out.print("Enter your height: ");
        String decimal = sc.nextLine();
        double desimal = Double.parseDouble(decimal);
        
        double hasil = desimal / 100;
        
        System.out.print("status as student: ");
        String statusBefore = sc.nextLine();
        boolean statusAfter = Boolean.parseBoolean(statusBefore);
        
        System.out.println("\n\n\n--------Result--------");
        System.out.println("Age           : "+angka);
        System.out.println("Height        : "+hasil+"m");
        System.out.println("Student Status: "+statusAfter);
        
        sc.close();
    }
}
