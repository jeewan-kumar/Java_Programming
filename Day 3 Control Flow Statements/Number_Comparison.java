/*
 * Write a program to compare two numbers and print whether the first number is greater than, less than, or equal to the second number.
 */

import java.util.Scanner;

public class Number_Comparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        
        if (num1 > num2){
            System.out.println("\n" + num1 + " is greater than " + num2);
        } else if (num1 < num2) {
            System.out.println("\n" + num1 + " is smaller than " + num2);
        } else{
            System.out.println("\nBoth numbers are equal");
        }
    }
}
