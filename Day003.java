/*
 * Using Escape Sequence (\n, \t, \\, and more)
 */
package pkg100daysofngoding;

/**
 *
 * @author ASUS
 */
public class Day003 {
    public static void main(String[] args) {
        // \n -> untuk baris baru (newline)
        System.out.println("Hello world\nbonjour le monde");
        System.out.println("Programming is fun\nLa programmation, c'est amusant");
        System.out.println("");
        
        // \t -> untuk tab horizontal
        System.out.println("Nama\tumur\tdesa");
        System.out.println("Thaufiq\t20\tgalung tuluk");
        System.out.println("");
        
        // \\ -> untuk backslash
        System.out.println("Lokasi file: C:\\User\\ASUS\\document");
        System.out.println("");
        
        // \" -> untuk tanda kutip dua
        System.out.println("Dia pun berkata, \"Selayaknya fakta yang tak bisa dibantah\"");
        System.out.println("");
        
        // \' untuk -> tanda kutip satu (biasanya dipakai di char)
        char kutipSatu = '\'';
        System.out.println("Example: "+kutipSatu);
        System.out.println("");
        
        // \r -> untuk carriage return
        System.out.println("Hola Mundo \rH");
        System.out.println("");
        
        // \b -> untuk backspace
        System.out.println("Programming is funn\b"); // menghapus 1 karakter
        System.out.println("");
        
        // \f -> untuk form feed
        System.out.println("Before\fAfter");
        System.out.println("");
        
        // \UXXXX -> untuk unicode (pakai u kecil, bukan U besar)
        System.out.println("Karakter unicodq: \u0041\u0042\u0043"); //ABC
        System.out.println("Heart Symbol: \u2764");
        System.out.println("");
        
        // \0 -> untuk null character (Octal Escape)
        char nullChar = '\0';
        System.out.println("Kode unicode null char: "+(int)nullChar); // hasil: 0
        System.out.println("");
        
        String teks = "halo\0dunia";
        System.out.println("Panjang string: "+teks.length()); // tetap terhitung 10 karakter
        System.out.println(teks); // karakter null biasanya tidak terlihat di console
        System.out.println("");
        
        // \s -> Space (khusus text block, java 15+)
        String textBlock = """
                           Baris ini punya spasi di akhir\s
                           baris berikutnya""";
        System.out.println(textBlock);
        System.out.println("");
        
        /*
        kenapa \s dibutuhkan di text block?
        Karena text block otomatis "strip" trailing whitespace di tiap baris,
        jadi \s dipakai untuk MEMAKSA spasi teta[ ada di akhir baris.
        */
                           
    }
}
