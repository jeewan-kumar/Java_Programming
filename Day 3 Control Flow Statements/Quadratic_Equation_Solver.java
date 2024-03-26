/*
 * Develop a program that takes coefficients of a quadratic equation as input and prints the roots (real or imaginary).
 */

import java.util.Scanner;

public class Quadratic_Equation_Solver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the coefficients a, b and c of the quadratic equation: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        
        // Calculate discriminant
        double d = (b * b) - (4 * a * c);
        if (d > 0) {
            // Real and distinct roots
            double root1 =  (-b + Math.sqrt(d)) / (2*a);
            double root2 =  (-b - Math.sqrt(d)) / (2*a);
            System.err.println("Roots are real and distinct: ");
            System.out.println("Root 1 is : "+root1);
            System.out.println("Root 2 is : "+root2);
        } else if (d == 0) {
            // Real and equal roots
            System.out.println("The equation has one real root.");
            System.out.printf("The root is x= %f", (-b / (2 * a)));
        } else {
            // Imaginary roots
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-d) / (2 * a);
            System.out.println("Roots are imaginary:");
            System.out.println("Root 1 = " + realPart + " + " + imaginaryPart + "i");
            System.out.println("Root 2 = " + realPart + " - " + imaginaryPart + "i");
        }
    }
}
