/*
 * Day 9: Constanta (final variable)
 */
package pkg100daysofngoding;

/**
 *
 * @author ASUS
 */
public class Day009 {
    public static void main(String[] args) {
        //difference between constanta and normal variable
        
        //normal variable:
        int luas;
        
        luas = 200;
        System.out.println("Luas Tanah dulu    : "+luas+"km");
        
        luas = 500;
        System.out.println("Luas tanah sekarang: "+luas+"km");
        
        /*
        variable biasa itu masih bisa di ubah (update)
        setelah di inisialisasi.
        */
        
        //constanta (final variable):
        final int range; //constanta int.
        final double ip; //constanta double.
        final String kota; //constanta string.
        
        /*
        setelah di inisialisasi, variable constanta tidak dapat diubah
        (dalam kata lain: tidak dapat di update)
        */
        
        //menyimpan data sebagai constanta:
        range = 420;
        ip = 3.14159;
        kota = "Berlin, Svelbard, Birmingham, Bratislava";
        
        System.out.println("\n\nJarak         : "+range+"km");
        System.out.println("Luas Lingkaran: "+ip);
        System.out.println("Kota          : "+kota);
        
    }
}
