/*
 * Create a program that takes an integer representing a day of the week (1 for Sunday, 2 for Monday, etc.) and prints whether it is a weekday or a weekend.
 */

import java.util.Scanner;

public class Weekday_or_Weekend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Entera the day of the week (1 for Sunday, 2 for Monday, etc.): ");
        int dayOfTheWeek = sc.nextInt();
        if ((dayOfTheWeek >= 2 && dayOfTheWeek <= 6)) { // Monday - Friday inclusive
            System.out.println("It's a weekday.");
        } else if (dayOfTheWeek == 7 || dayOfTheWeek ==  1) { // Saturday and Sunday        
            System.out.println("It's a weekend. Relax!");
        } else {
            System.out.println("Invalid input" + "Please enter 1-7 only");
        }
    }
}
