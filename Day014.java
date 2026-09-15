/*
 * Day 14: Arithmetic Operations (Multiplication and Subtraction)
 */
package pkg100daysofngoding;

/**
 *
 * @author ASUS
 */
public class Day014 {
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        
        /*
        mengeksekusi operasi dengan membuat variable baru,
        yaitu variabel result untuk penjumlahan dan
        result 2 untuk pengurangan.
        */
        int result = a + b;
        int result2 = a - b;
        
        /*
        memanggil kedua variabel pengeksekusi, result dan result2.
        */
        System.out.println("Hasil Penjumlahan: "+result);
        System.out.println("Hasil Pengurangan: "+result2);
        
        //mengeksekusi langsung operasi aritmatika di dalam pemanggil.
        System.out.println("");
        System.out.println(a + b);
        System.out.println(a - b);
    }
}
