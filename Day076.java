/*
 * String method for manipulation [substring(), replace(), trim()]
 */
package pkg100daysofngoding;

/**
 *
 * @author ASUS
 */
public class Day076 {
    public static void main(String[] args) {
        String text = "   Java and Javanese are not the same   ";
        
        text = text.trim();
        System.out.println(text+"\n");
        
        text = text.replace('a', 'o');
        System.out.println(text+"\n");
        
        text = text.trim().substring(0, 21);
        System.out.println(text);
    }
}