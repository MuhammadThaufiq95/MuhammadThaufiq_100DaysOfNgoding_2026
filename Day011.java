/*
 * Day 11: Recieving input from keyboard,
 * (Using Scanner)
 */
package pkg100daysofngoding;

import java.util.Scanner;

/*
sebelum memakai scanner, scanner harus di import dulu.
karena scanner itu bukan bawaan otomatis dari java (java.lang).
melainkan berada di sebuah package terpisah (java.util),
sehingga compiler harus di beri tahu dulu lewat syntax diatas.
*/

/**
 *
 * @author ASUS
 */
public class Day011 {
    public static void main(String[] args) {
        
        /*
        Scanner,
        merupakan class bawaan Java yang dipakai
        untuk membaca input dari user
        (biasanya dari keyboard).
        */
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Input\n\n");
        
        System.out.print("Byte  : ");
        byte nomor = in.nextByte(); //bilangan bulat (-128 sampai 127)
        
        System.out.print("short : ");
        short number = in.nextShort(); //bilangan bulat kecil
        
        System.out.print("int   : ");
        int n = in.nextInt(); // bilangan bulat sedang
        
        System.out.print("Long  : ");
        long u = in.nextLong(); // bilangan bulat besar
        
        System.out.print("double: ");
        double r = in.nextDouble(); //bilangan desimal
        
        System.out.print("float : ");
        float m = in.nextFloat(); // bilangan desimal
        
        System.out.print("char  : ");
        char b = in.next().charAt(0); // karakter
        
        System.out.print("boolean: ");
        boolean o = in.nextBoolean(); // true/false
        in.nextLine();
        
        System.out.print("string: ");
        String text = in.nextLine(); //text
        
        
        //output
        System.out.println("");
        System.out.println("byte  : "+nomor);
        System.out.println("short : "+number);
        System.out.println("int   : "+n);
        System.out.println("long  : "+u);
        System.out.println("double: "+r);
        System.out.println("float : "+m);
        System.out.println("char  : "+b);
        System.out.println("string: "+text);
        System.out.println("boolean: "+o);
    }
}
