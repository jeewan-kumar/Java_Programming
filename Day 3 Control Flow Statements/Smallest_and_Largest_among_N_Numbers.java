/*
 * Create a program that finds the smallest and largest numbers among N numbers entered by the user.
 */

import java.util.Scanner;

public class Smallest_and_Largest_among_N_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements: ");
        int n = sc.nextInt();
        
        double smallest = Double.MAX_VALUE;
        double largest = Double.MIN_VALUE;
        
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter number " + i + ": ");
            double num = sc.nextDouble();
            if (num < smallest) 
                smallest = num;
            
            if (num > largest) 
                largest = num;
        }

        System.out.printf("\nSmallest Number is : "+ smallest);
        System.out.printf("\nLargest Number is  : "+ largest);
    }
}
