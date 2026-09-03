/*
 * Biodata diri: using print(), println() and printf()
 */
package pkg100daysofngoding;

/**
 *
 * @author ASUS
 */
public class Day002 {
    public static void main(String[] args) {
        String nama = "Muhammad Thaufiq";
        String tmplahir = "Galung tuluk";
        String tgllahir = "23 januari 2006";
        String alamat = "Dusun Kappung Tulu";
        String hobi = "Membuat music (EDM-Composer/EDM Music Producer)";
        int umur = 20;
        String nim = "D0225317";
        double tinggiBadan = 170.5;
        int beratBadan = 65;
        
        // Menggunakan println() untuk mencetak dengan baris baru
        System.out.println("===== BIODATA DIRI =====");
        System.out.println("Nama          : "+nama);
        System.out.println("Tempat lahir  : "+tmplahir);
        System.out.println("Tanggal lahir : "+tgllahir);
        System.out.println("Umur          : "+umur);
        System.out.println("NIM           : "+nim);
        
        /*
        print()
        
        [Digunakan untuk mencetak tanpa baris baru]
        */
        System.out.print("Alamat        : ");
        System.out.println(alamat);
        
        System.out.print("Hobi          : ");
        System.out.println(hobi);
        
        /*
        printf()
        [untuk berformat output]
        */
        System.out.printf("Tinggi badan  : %1f cm%n", tinggiBadan);
        System.out.printf("Berat badan   : %d kg%n", beratBadan);
        
        System.out.println("=========================");
    }
}
