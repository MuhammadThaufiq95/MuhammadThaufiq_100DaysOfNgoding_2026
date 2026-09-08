/*
 * Day 7: Using text data type (String).
 */
package pkg100daysofngoding;

/**
 *
 * @author ASUS
 */
public class Day007 {
    public static void main(String[] args) {
        String text1 = "Hi, I'm using Java";
        String text2 = "Hai, Saya menggunakan Java";
        
        String desa = "Galung tuluk";
        String alumni = "MA Nuhiyah Pambusuang";
        String prodi = "Informatika";
        String alamat = "Dusun Galung Tuluk";
        /*
        [String]
        Merupakan tipe data untuk menyimpan teks/rangkaian karakter di Java.
        Ditulis pakai kutip dua ("..."), dan berbeda dari tipe primitive lainnya
        karena String sebenarnya adalah object/class, bukan tipe data dasar.
        */
        
        System.out.println(text1);
        System.out.println(text2);
        System.out.println("------------------------------------------------");
        System.out.println("Saya dari desa "+desa);
        System.out.println("Saya merupakan alumni dari "+alumni);
        System.out.println("Saya dari prodi "+prodi);
        System.out.println("Saya beralamat di "+alamat);
        System.out.println("------------------------------------------------");
    }
}
