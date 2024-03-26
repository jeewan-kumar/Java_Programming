/*
 * Write a program to find the largest among five numbers entered by the user.
 */

import java.util.Scanner;

public class Largest_among_Five_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter five number:");
        double num1 = sc.nextInt();
        double num2 = sc.nextInt();
        double num3 = sc.nextInt();
        double num4 = sc.nextInt();
        double num5 = sc.nextInt();

        double largest = findlargest(num1, num2, num3, num4, num5);
        System.out.printf("The largest number is: " + largest);

    }

    public static double findlargest(double n1, double n2, double n3, double n4, double n5) {
        double max = n1;

        if (n2 > max) {
            max = n2;
        }

        if (n3 > max) {
            max = n3;
        }

        if (n4 > max) {
            max = n4;
        }

        if (n5 > max) {
            max = n5;
        }
        return max;
    }
}
