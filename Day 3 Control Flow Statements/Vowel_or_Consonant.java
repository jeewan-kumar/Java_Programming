/*
 * check if a given character is a vowel or consonant.
 */

import java.util.Scanner;

public class Vowel_or_Consonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Character :");
        char ch = sc.next().charAt(0);
        // convert the character to lowercase for uniformity

        if (isVowel(ch))
            System.out.println(ch + " is Vowel.");
        else
            System.out.println(ch + " is Consonant.");
    }

    public static boolean isVowel(char c){
        c = Character.toLowerCase(c);  // converting the character to Lowercase
        return c == 'a' || c== 'e' || c== 'i'|| c== 'o'|| c =='u';
    }
}