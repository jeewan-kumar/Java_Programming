/*
 * Write a program that takes a character as input and prints whether it is uppercase, lowercase, or neither.
 */

import java.util.Scanner;

public class Character_Case_Checker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        if (Character.isUpperCase(ch)) {
            System.out.println("The entered character is uppercase.");
        } else if (Character.isLowerCase(ch)) {
            System.out.println("The entered character is lowercase.");
        } else {
            System.out.println("The entered character is neither uppercase nor lowercase.");
        }
    }

    public static boolean isUpperCase(char ch) {
        return 'A' <= ch && ch <= 'Z';
    }

    public static boolean isLowerCase(char ch) {
        return 'a' <= ch && ch <= 'z';
    }
    
}
