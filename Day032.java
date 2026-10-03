/*
 * Day 32: (Latihan) Combining all of the operator
 */
package pkg100daysofngoding;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Day032 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        //operator aritmatika
        int aritmatika1 = a + b;
        int aritmatika2 = a * b;
        int aritmatika3 = a / b;
        int aritmatika4 = a % b;
        
        //increment & decrement
        int increment1 = ++a;
        int increment2 = a++;
        int decrement1 = --a;
        int decrement2 = a--;
        int increment3 = ++b;
        int increment4 = b++;
        int decrement3 = --b;
        int decrement4 = b--;
        
        //operator perbandingan
        boolean kondisi1 = a == b;
        boolean kondisi2 = a != b;
        boolean kondisi3 = a < b;
        boolean kondisi4 = a > b;
        boolean kondisi5 = a <= b;
        boolean kondisi6 = a >= b;
        
        //operator logika
        boolean hasil1 = kondisi1 && kondisi2;
        boolean hasil2 = kondisi3 || kondisi4;
        boolean hasil3 = !kondisi4;
        
        System.out.println("\n----------");
        System.out.println(aritmatika1);
        System.out.println(aritmatika2);
        System.out.println(aritmatika3);
        System.out.println(aritmatika4);
        System.out.println("----------");
        System.out.println(increment1);
        System.out.println(increment2);
        System.out.println(decrement1);
        System.out.println(decrement2);
        System.out.println(increment3);
        System.out.println(increment4);
        System.out.println(decrement3);
        System.out.println(decrement4);
        System.out.println("----------");
        System.out.println(kondisi1);
        System.out.println(kondisi2);
        System.out.println(kondisi3);
        System.out.println(kondisi4);
        System.out.println(kondisi5);
        System.out.println(kondisi6);
        System.out.println("----------");
        System.out.println(hasil1);
        System.out.println(hasil2);
        System.out.println(hasil3);
    }
}
