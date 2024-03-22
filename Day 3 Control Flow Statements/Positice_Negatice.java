/*
 * Create a program to determine if a given integer is positive, negative, or zero.
 */

import java.util.Scanner;

public class Positice_Negatice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer:");
        int num = sc.nextInt();
        
        // Determine the sign of the number using conditional operator
        String result = (num > 0) ? "Positive" : ((num < 0) ? "Negative" : "Zero");
        
        System.out.printf("%d is %s.", num, result);
    }
}
