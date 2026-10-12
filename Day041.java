/*
 * Day 41: (Latihan) Determining the room temperature using if statement
 */
package pkg100daysofngoding;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Day041 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double suhu = sc.nextDouble();
        
        if (suhu < 20) {
            System.out.println("Dingin");
        } else if (suhu >= 20 && suhu <= 30) {
            System.out.println("Normal");
        } else {
            System.out.println("Panas");
        }
    }
}