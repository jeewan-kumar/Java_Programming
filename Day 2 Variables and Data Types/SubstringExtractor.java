/*
 * User
Create a program that extracts a substring from a given string and displays it.
 */
public class SubstringExtractor {
    public static void main(String[] args) {
        String str = "Hello, World!";
        int startIndex = 7; 
        int endIndex = 12;
        
        String exString = str.substring(startIndex, endIndex);
        System.out.println("Original string: " + str);
        System.out.println("Extracted substring: " + exString);
               
    }
}
