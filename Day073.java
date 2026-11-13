/*
 * (Latihan) do-while: creating a recurring menu
 */
package pkg100daysofngoding;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Day073 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        int choice;
        int value1;
        int value2;
        
        do {
            System.out.println("==== PATTERN GENERATOR ====");
            System.out.println("1. Square");
            System.out.println("2. Rectangle");
            System.out.println("3. Right-Angled Triangle");
            System.out.println("0. Exit");
        
            System.out.print("Choice: ");
            choice = sc.nextInt();
        
            switch (choice) {
                case 1:
                    System.out.print("\nEnter a number: ");
                    value1 = sc.nextInt();
                    
                    if (value1 <= 0) {
                        System.err.println("ERROR: Number must be greater than zero!");
                    } else {
                        for (int i = 1; i <= value1; i++) {
                            for (int j = 1; j <= value1; j++) {
                                System.out.print("+");
                                if (j < value1) {
                                    System.out.print(" ");
                                }
                            }
                            System.out.println();
                        }
                    }
                    break;
                case 2:
                    System.out.print("Insert the length: ");
                    value1 = sc.nextInt();
                    System.out.print("Insert the width : ");
                    value2 = sc.nextInt();
                
                    if (value1 <= 0 || value2 <= 0) {
                        System.err.println("ERROR: Number must be greater than zero!");
                    } else {
                        for (int i = 1; i <= value2; i++) {
                            for (int j = 1; j <= value1; j++) {
                                System.out.print("+");
                                if (j < value1) {
                                    System.out.print(" ");
                                }
                            }
                            System.out.println();
                        }
                    }
                    break;
                case 3:
                    System.out.print("Enter a number: ");
                    value1 = sc.nextInt();
                    
                    if (value1 <= 0) {
                        System.err.println("ERROR: Number must be greater than zero!");
                    } else {
                        for (int i = 1; i <= value1; i++) {
                            for (int j = 1; j <= i; j++) {
                                System.out.print("+");
                                if (j < i) {
                                    System.out.print(" ");
                                }
                            }
                            System.out.println();
                        }
                    }
                    break;
                case 0:
                    System.out.println("Exiting Pattern Generator...");
                    break;
                default:
                    System.err.println("Input invalid!");
                    break;
            }
        } while (choice != 0);
        sc.close();
    }
}