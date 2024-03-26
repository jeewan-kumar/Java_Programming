/*
 * Write a program to find the largest among three numbers entered by the user.
 */

import java.util.Scanner;

public class Largest_among_Three_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        double num1 = sc.nextInt();
        double num2 = sc.nextInt();
        double num3 = sc.nextInt();

        double largest = findlargest(num1, num2, num3);
        System.out.printf("The largest number is : " + largest);

    }

    public  static double findlargest(double x, double y, double z){
        if (x > y && x > z)
            return x;
        else if (y > x && y > z)
            return y;
        else
            return z;
    }
}
