/*
 * Day 20; Converting a primitive data type into string.
 */
package pkg100daysofngoding;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Day020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your age   : ");
        int age = sc.nextInt();
        
        System.out.print("Enter your height: ");
        double height = sc.nextDouble();
        
        System.out.print("Enter your gender: ");
        char gender = sc.next().charAt(0);
        
        String ageString = String.valueOf(age);
        String heightString = String.valueOf(height);
        String genderString = String.valueOf(gender);
        
        System.out.println("\n\nAge   : "+ageString);
        System.out.println("Height: "+heightString);
        System.out.println("Gender: "+genderString);
        
        sc.close();
    }
}
