/*
 * Day 40: Commitan evaluasi
 */
package pkg100daysofngoding;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Day040 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pilihan = sc.nextInt();
        int pulsa = sc.nextInt();
        
        String paket1 = "Harian 3GB";
        String paket2 = "Mingguan 15GB";
        String paket3 = "Bulanan 50GB";
        
        int harga1 = 10000;
        int harga2 = 35000;
        int harga3 = 90000;
        
        String paket = "";
        int harga = 0;
        
        if (pilihan == 1) {
            paket = paket1;
            harga = harga1;
        } else if (pilihan == 2) {
            paket = paket2;
            harga = harga2;
        } else if (pilihan == 3) {
            paket = paket3;
            harga = harga3;
        }
        
        if (harga == 0) {
            System.err.println("Pilihan tidak valid");
        } else {
            System.out.println("Paket : "+paket);
            if (pulsa >= harga) {
                System.out.println("Status : Berhasil");
                System.out.println("Sisa pulsa : Rp"+(pulsa - harga));
            } else {
                System.out.println("Status : Pulsa tidak cukup");
                System.out.println("Kekurangan : Rp"+(harga - pulsa));
            }
        }
    }
}
