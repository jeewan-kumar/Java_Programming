/**
 * Write a program that concatenates two strings and prints the resulting
 * string.
 */
public class Concatenates {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = ", how are you?";
        System.out.println("Concatenating two strings: \"" + str1 + "\" and \"" + str2 + "\":");
        System.out.println("\tResult of concatenation using '+' operator: \"" + (str1 + str2) + "\".");
        System.out.println("Result of concatenation using '+=' operator: \"" + concatUsingPlusEqual(str1, str2) + "\".");
        System.out.println("\tResult of concatenation using 'concat()' method: \"" + str1.concat(str2) + "\".");
    }

    public static String concatUsingPlusEqual(String str1, String str2) {
        str1 += str2;
        return str1;
    }
}
