/*
 * Day 47: (Latihan) Program for determining days
 */
package pkg100daysofngoding;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Day047 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int day = sc.nextInt();
        
        switch (day) {
            case 1:
                System.out.println("Senin");
                break;
            case 2:
                System.out.println("Selasa");
                break;
            case 3:
                System.out.println("Rabu");
                break;
            case 4:
                System.out.println("Kamis");
                break;
            case 5:
                System.out.println("Jumat");
                break;
            case 6:
                System.out.println("Sabtu");
                break;
            case 7:
                System.out.println("Minggu");
                break;
            default:
                System.err.println("Input invalid");
        }
        sc.close();
    }
}
