/*
 * Day 13: Evaluation 1 (late)
 */
package pkg100daysofngoding;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Day013 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Masukkan nama             : ");
        String nama = in.nextLine();
        
        System.out.print("Masukkan nama panggilan   : ");
        String nickname = in.nextLine();
        
        System.out.print("Masukkan Umur             : ");
        int age = in.nextInt();
        
        System.out.print("Masukkan Tinggi Badan (cm): ");
        double tinggi = in.nextDouble();
        
        System.out.println("Nama saya "+nama+", kamu bisa panggil saya "+nickname+". Umur saya "+age+" dan tinggi saya "+tinggi);
    }
}
