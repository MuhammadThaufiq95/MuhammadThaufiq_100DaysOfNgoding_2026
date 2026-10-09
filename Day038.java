/*
 * Day 38: Creating a menu using if statements
 */
package pkg100daysofngoding;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Day038 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String produk1 = "Iron Axe";
        String produk2 = "Diamond Sword";
        String produk3 = "Beginner Magic Spell Book";
        String produk4 = "Wooden Staff";
        String produk5 = "Iron Armor Set";
        
        int harga1 = 50;
        int harga2 = 200;
        int harga3 = 500;
        int harga4 = 700;
        int harga5 = 200;
        
        String satuan1 = " Gold coins";
        String satuan2 = " Silver coins";
        
        System.out.println("======= MENU =======");
        System.out.println("1."+produk1+"                  /  "+harga1+satuan2);
        System.out.println("2."+produk2+"             / "+harga2+satuan1);
        System.out.println("3."+produk3+" / "+harga3+satuan1);
        System.out.println("4."+produk4+"              / "+harga4+satuan2);
        System.out.println("5"+produk5+"            / "+harga5+satuan2);
        
        System.out.print("Choose product: ");
        int pilihan = sc.nextInt();
        
        String namaProduk;
        int harga;
        String satuan;
        
        if (pilihan == 1) {
            namaProduk = produk1;
            harga = harga1;
            satuan = satuan2;
        } else if (pilihan == 2) {
            namaProduk = produk2;
            harga = harga2;
            satuan = satuan1;
        } else if (pilihan == 3) {
            namaProduk = produk3;
            harga = harga3;
            satuan = satuan1;
        } else if (pilihan == 4) {
            namaProduk = produk4;
            harga = harga4;
            satuan = satuan2;
        } else if (pilihan == 5) {
            namaProduk = produk5;
            harga = harga5;
            satuan = satuan2;
        } else {
            namaProduk = "Unknown";
            harga = 0;
            satuan = "Unknown";
            System.err.println("Option not available!");
        }
        
        if (pilihan >= 1 && pilihan <= 5) {
            System.out.println("\ndo you wanna buy "+namaProduk+" for "+harga+satuan+"?");
            System.out.print("(y/n): ");
            char konfirmasi = sc.next().charAt(0);
            
            if (konfirmasi == 'y' || konfirmasi == 'Y') {
                System.out.println("\n"+namaProduk+" have been added to your inventory!");
            } else if (konfirmasi == 'n' || konfirmasi == 'N') {
                System.out.println("\nPurchase cancelled.");
            } else {
                System.err.println("\nInvalid Input.");
            }
        } else {
            System.err.println("\nInvalid product");
        }
        sc.close();
    }
}
