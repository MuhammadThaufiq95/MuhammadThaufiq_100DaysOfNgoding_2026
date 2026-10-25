/*
 * Day 54: Evaluasi (3 Soal)
 */
package pkg100daysofngoding;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Day054 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //soal no.1
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        
        if (y > x) {
            x++;
        } else if (y < x) {
            x--;
        }

        if (z > x) {
            x += 2;
        } else if (z < x) {
            x -= 2;
        }
        System.out.println(x);


        //soal no.2
        String n2 = sc.next();
        double parse = Double.parseDouble(n2);
        
        if (parse % 1 == 0) {
            if (parse % 2 == 0) {
                System.out.println("Bulat Genap");
            } else {
                System.out.println("Bulat Ganjil");
            }
        } else {
            System.out.println("Pecahan");
        }
        
        if (parse > 0) {
            System.out.println("Positif");
        } else if (parse < 0) {
            System.out.println("Negatif");
        }
        
        if (parse % 1 == 0 && parse >= 0) {
            System.out.println("Natural/Cacah");
        }

        //soal no.3
        int n3 = sc.nextInt();
        
        for (int i = 1; i <= n3; i++) {
            if ((i % 3 == 0 || i % 4 == 0) && !(i % 3 == 0 && i % 4 == 0)) {
                System.out.print(i+" ");
            }
        }
        sc.close();
    }
}