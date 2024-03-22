/*
 * Write a program to check if a given integer is even or odd.
 */
import java.util.Scanner;
 public class Even_Odd {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter an integer:");
         int num = sc.nextInt();
         // Checking whether the number is even or not
         if (num % 2 == 0) {
             System.out.println("The number " + num + " is even.");
         } else {
             System.out.println("The number " + num + " is odd.");
         }
     }
 }