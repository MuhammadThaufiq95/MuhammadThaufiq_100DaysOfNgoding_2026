/*
 * Day 7: Declaration, Initialization and variable update.
 */
package pkg100daysofngoding;

/**
 *
 * @author ASUS
 */
public class Day008 {
    public static void main(String[] args) {
        // 1. declaration: membuat variabel, belum ada nilai
        int point;
        
        // 2. initialize: kasih nilai pertama kali
        point = 100;
        System.out.println("Point awal: "+point);
        
        //3. update: ganti nilai yang sudah ada
        point = 230;
        System.out.println("Point update 1: "+point);
        
        point += 20; //shorthand: point = point + 20.
        System.out.println("Point update 2: "+point);
        
        point -= 60; //shorthand: point = point - 60.
        System.out.println("Point update 3: "+point);
    }
}
