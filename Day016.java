/*
 * Day 16: Arithmatic Operation: Modulus
 */
package pkg100daysofngoding;

/**
 *
 * @author ASUS
 */
public class Day016 {
    public static void main(String[] args) {
        int a;
        int b;
        
        a = 8;
        b = 6;
        
        int hasil;
        hasil = a % b;
        
        System.out.println(hasil);
        
        //shorthand operator.
        a %= 10;
        
        System.out.println("");
        System.out.println("");
        System.out.println(a);
        
        //Operasi langsung di pemanggil.
        System.out.println("");
        System.out.println("");
        System.out.println(a % b);
    }
}
