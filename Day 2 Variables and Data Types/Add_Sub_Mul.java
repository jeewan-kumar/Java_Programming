import java.util.Scanner;

/**
 * Write a program that performs basic arithmetic operations
 * (addition,subtraction, multiplication, division) on two integers.
 */
public class Add_Sub_Mul {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number:");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number:");
        int num2 = scanner.nextInt();
        //Adding numbers
        System.out.print("\n Sum of numbes: "+(num1+num2));
        //Subtracting numbers
        System.out.print("\n Difference between numbers: " + (num1 - num2));
        //Multiplying numbers
        System.out.print("\n Product of numbers: " + (num1 * num2));
        double div=0;
        //Check for divide by zero error
        if(num2!=0){
            div = num1 / num2;
            System.out.printf("\n Division of numbers: %.2f",div); 
        }else{       
            System.out.print("Error! Division by zero is not allowed.");
        }
    }
}