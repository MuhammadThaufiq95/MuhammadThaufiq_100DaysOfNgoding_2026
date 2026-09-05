/*
 * day 4: Menggunakan type data numerik bilangan bulat
 * seperti byte, short, int, dan long
 */
package pkg100daysofngoding;

/**
 *
 * @author ASUS
 */
public class Day004 {
    public static void main(String[] args) {
        
        // byte: memiliki range nilai dari -128 sampai 127 = 8 bit.
        byte umur = 20;
        
        // short: memiliki range nilai dari -32.768 sampai 32.767 = 16 bit.
        short jarak = 3000;
        
        /* int: memiliki range nilai dari
        -2.147.483.648 sampai 2.147.483.647 = 32 bit.
        */
        int saldo = 30000000;
        
        /*
        long: memiliki range nilai dari
        -9.223.372.036.854.775.808 sampai 9.223.372.036.854.775.807 = 64 bit.
        */
        long jumlah = 8300000000L;
        
        System.out.println("----------- Tipe data bilangan bulat -----------");
        System.out.println("umur (byte)                   : "+umur+" tahun");
        System.out.println("Jarak (short)                 : "+jarak+" Km");
        System.out.println("Saldo (int)                   : Rp"+saldo);
        System.out.println("Jumlah manusia di bumi (long) : "+jumlah+" Jiwa");
        System.out.println("------------------------------------------------");
    }
}
