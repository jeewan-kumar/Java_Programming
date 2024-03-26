/*
 * Develop a program that takes three integers as inputs and prints whether their product is positive, negative, or zero.
 */

import java.util.Scanner;

public class Sign_of_Product {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter three numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        int product = a * b * c;

        if (product > 0) {
            System.out.println("The product is positive.");
        } else if (product < 0) {
            System.out.println("The product is negative.");
        } else {
            System.out.println("The product is zero.");
        }
    }
}
