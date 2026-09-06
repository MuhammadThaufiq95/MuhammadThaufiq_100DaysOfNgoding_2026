/*
 * Day 5: Tipe data pecahan
 * Menggunakan tipe data pecahan seperti double dan float
 */
package pkg100daysofngoding;

/**
 *
 * @author ASUS
 */
public class Day005 {
    public static void main(String[] args) {
        
        /*
        [double]
        merupakan tipe data pecahan 64-bit dengan
        presisi lebih tinggi (∼15-16 digit desimal).
        */
        double jarak = 302.8;
        
        /*
        [float]
        merupakan tipe data pecahan 32-bit dengan
        presisi lebih rendah (∼6-7 digit desimal)
        (catatan): saat menggunakan float, wajib
        menyertakan suffix f atau F di akhir
        karena literal desimal defaulnya itu double,
        jadi harus di konversi eksplisit ke float.
        */
        float persentase = 10.8f;
        
        //percobaan untuk menampilkan data yang telah dibuat
        System.out.println("Jarak     : "+jarak+"km");
        System.out.println("Persentase: "+persentase+"%");
    }
}
