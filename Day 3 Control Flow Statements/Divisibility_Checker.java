/*
 * Create a program to check if one integer is divisible by another integer.
 */

import java.util.Scanner;

public class Divisibility_Checker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the firest integer: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the second integer:");
        int num2 = sc.nextInt();
        // Checking for divisibility
        if (num1 % num2 == 0) {
            System.out.printf("%d is divisible by %d\n", num1, num2);
        } else {
            System.out.printf("%d is not divisible by %d\n", num1, num2);
        }
    }    
}
