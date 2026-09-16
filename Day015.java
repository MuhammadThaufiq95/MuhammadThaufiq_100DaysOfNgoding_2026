/*
 * Day 15: 
 */
package pkg100daysofngoding;

/**
 *
 * @author ASUS
 */
public class Day015 {
    public static void main(String[] args) {
        int a = 9;
        int b = 7;
        
        int hasil1 = a * b;
        int hasil2 = a / b;
        double hasil3 = (double) a / b;
        double hasil4 = a / b;
        
        System.out.println("== Pembagian ==");
        System.out.println("Hasil 1: "+hasil2);
        System.out.println("Hasil 2: "+hasil3);
        System.out.println("Hasil 3: "+hasil4);
        System.out.println("===============");
        
        System.out.println("\n\n== Perkalian ==");
        System.out.println("hasil: "+hasil1);
        
        
        //mengeksekusi operasi langsung di dalam pemanggil.
        System.out.println("");
        System.out.println(a * b);
        System.out.println(a / b);
    }
}
