/*
 * Day 42: (latihan) determining net salary
 */
package pkg100daysofngoding;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Day042 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int pokok = sc.nextInt();
         int tunjangan = sc.nextInt();
         int potongan = sc.nextInt();
         
         int bersih = pokok + tunjangan - potongan;
         
         System.out.println(bersih);
    }
}
