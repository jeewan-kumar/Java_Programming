/*
 * Develop a program that takes three integers as inputs and determines whether they can form a triangle. If they can, classify the triangle as equilateral, isosceles, or scalene based on the lengths of the sides.
 */

import java.util.Scanner;

public class Triangle_Type_Identifier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the lengths of three sides of the triangle:");
        int side1 = sc.nextInt();
        int side2 = sc.nextInt();
        int side3 = sc.nextInt();

        if (isTriangle(side1, side2, side3)) {
            String triangleType = classifyTriangle(side1, side2, side3);
            System.out.printf("The given set of side lengths forms a : " + triangleType);
        } else {
            System.out.println("The given set of side lengths does not form a triangle.");
        }
    }

    public static boolean isTriangle(int side1, int side2, int side3) {
        return side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1;
    }
    
    public static String classifyTriangle(int side1, int side2, int side3) {
        if (side1 == side2 && side1 == side3) {
            return "equilateral triangle";
        } else if (side1 == side2 || side1 == side3 || side2 == side3) {
            return "isosceles triangle";
        } else {
            return "scalene triangle65";
        }
    }
}
