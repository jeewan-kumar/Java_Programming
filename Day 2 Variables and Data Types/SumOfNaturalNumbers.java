/*
 * Write a program to calculate the sum of the first N natural numbers.
 */

import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int n = sc.nextInt();
        int sum = 0;
        sum = (n * (n + 1));
        System.out.println("The sum of the first " + n + " natural numbers is : " + sum);
    }
}
