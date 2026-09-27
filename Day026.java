package pkg100daysofngoding;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Day026 {
    public static void main(String[] args) {
        //soal 1
        System.out.println("Soal 1:");
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan Nama   : ");
        String nama = sc.nextLine();
        System.out.print("Masukkan NIM    : ");
        String nim = sc.nextLine();
        System.out.print("Masukkan Kelas  : ");
        char kelas = sc.next().charAt(0);
        System.out.print("Masukkan Umur   : ");
        int umur = sc.nextInt();
        sc.nextLine();
        System.out.print("Masukkan Prodi  : ");
        String prodi = sc.nextLine();
        System.out.print("Masukkan IPK    : ");
        double ipk = sc.nextDouble();
        System.out.print("Status Keaktifan: ");
        boolean status = sc.nextBoolean();
        
        System.out.println("\n===== BIODATA MAHASISWA =====");
        System.out.println("Nama        : "+nama);
        System.out.println("NIM         : "+nim);
        System.out.println("Kelas       : "+kelas);
        System.out.println("Umur        : "+umur+" Tahun");
        System.out.println("Prodi       : "+prodi);
        System.out.printf("IPK         : %.2f%n",ipk);
        System.out.println("Status Aktif: "+status);
        System.out.println("=============================");
        System.out.println("");
        System.out.println("");
        
        //soal 2
        System.out.println("Soal 2:");
        final double pi = 3.14;
        int rusuk = sc.nextInt();
        
        System.out.println(pi * rusuk * rusuk);
        System.out.println("");
        System.out.println("");
        
        //soal 3
        System.out.println("Soal 3:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        a = a + b;
        b = a - b;
        a = a - b;
        
        System.out.println(a);
        System.out.println(b);
    }
}
