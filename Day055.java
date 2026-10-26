/*
 * Day 55: Keyword break, continue and return
 */
package pkg100daysofngoding;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Day055 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                if (i == n) {
                    break;
                }
                System.out.print(i);
                if (i < n) {
                    System.out.print(" ");
                }
            }
        }
        System.out.println();
        
        int start = sc.nextInt();
        int finish = sc.nextInt();
        boolean pertama = true;
        
        do {
            start++;
            if (start % 2 == 0) {
                continue;
            }
            if (!pertama) {
                System.out.print(" ");
            }
            System.out.print(start);
            pertama = false;
        } while (start < finish);
        System.out.println();
        
        int point = sc.nextInt();
        int last = sc.nextInt();
        boolean first = true;
        
        while (point <= last) {
            point++;
            point++;
            if (!first) {
                System.out.print(" ");
            }
            System.out.print(point);
            first = false;
            if (point == 30) {
                return;
            }
        }
        System.out.println();
        System.out.println("This is invisible");
    }
}
