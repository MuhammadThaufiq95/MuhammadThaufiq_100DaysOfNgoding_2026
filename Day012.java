/*
 * Day 12: making simple biodata using Scanner.
 */
package pkg100daysofngoding;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Day012 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter Name            : ");
        String nama = in.nextLine();
        
        System.out.print("Enter NIM             : ");
        String nim = in.nextLine();
        
        System.out.print("Enter Faculty         : ");
        String fakultas = in.nextLine();
        
        System.out.print("Enter Age             : ");
        int umur = in.nextInt();
        in.nextLine();
        
        System.out.print("Enter Address         : ");
        String alamat = in.nextLine();
        
        System.out.print("Enter Body Height (cm): ");
        double tinggi = in.nextDouble();
        
        double hasil = tinggi / 100;
        
        System.out.print("Enter Gender (M/F)    : ");
        char jk = in.next().charAt(0);
        
        System.out.println("\n\nName         : "+nama);
        System.out.println("Nim          : "+nim);
        System.out.println("Faculty      : "+fakultas);
        System.out.println("Age          : "+umur);
        System.out.println("Address      : "+alamat);
        System.out.println("Body Height  : "+hasil+"m");
        System.out.println("Gender       : "+jk);
        
    }
}
