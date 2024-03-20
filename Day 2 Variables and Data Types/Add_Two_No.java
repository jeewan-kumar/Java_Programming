import java.util.Scanner;

/**
 * Add two number
 */
public class Add_Two_No {
    public static void main(String[] args) {
        Scanner  scanner = new Scanner(System.in);
        System.out.print("Enter the first Number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second Number: ");
        int num2 = scanner.nextInt();

        System.out.println("Sum of two number: "+(num1+num2));
    }
}