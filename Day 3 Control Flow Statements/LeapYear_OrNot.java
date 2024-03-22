/*
 *check if a given year is a leap year.
 */

import java.util.Scanner;

public class LeapYear_OrNot {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);  
        System.out.println("Enter the Year:");  
        int yr = sc.nextInt();
        if(yr % 4 == 0){
            if (yr % 100 == 0 ) {
                if (yr % 400 == 0) {
                    System.out.println(yr + " is a Leap Year.");
                } else {
                    System.out.println(yr + " is not a Leap Year.");
                }    
            }else{
                System.out.println(yr + " is a Leap Year.");
            }          
        }else{
            System.out.println(yr + " is not a Leap Year.");
        }          
    
    }
}
