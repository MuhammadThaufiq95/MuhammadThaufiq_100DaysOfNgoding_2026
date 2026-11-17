/*
 * Day 77: (Latihan) using all kinds of string method.
 */
package pkg100daysofngoding;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Day077 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String line = sc.nextLine();
        
        line = line.trim();
        
        if (line.isEmpty()) {
            System.err.println("ERROR: your message is empty");
        } else if (line.length() > 100) {
            System.err.println("ERROR: your text is too long");
        } else if (line.toLowerCase().contains("fuck")) {
            System.err.println("ERROR: your text must NOT contain swear words");
        } else if (line.equalsIgnoreCase("Admin")) {
            System.err.println("FATAL_ERROR: stop dreaming, you're not the one in charge here, buddy");
        } else {
            String username = line.replace(" ", "-").toLowerCase();
            String tampilan = line.substring(0, 1).toUpperCase()
                            + line.substring(1).toLowerCase();
            System.out.println("\n"+username);
            System.out.println(tampilan);
        }
        sc.close();
    }
}