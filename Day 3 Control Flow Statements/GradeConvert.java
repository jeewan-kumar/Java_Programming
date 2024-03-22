/*
 * Write a program that takes a numerical grade as input and prints the corresponding letter grade (e.g., A, B, C, D, F).
 */

import java.util.Scanner;

public class GradeConvert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the grade in number:");
        int num = sc.nextInt();
        String letterGrade;
        
        if (num >= 90 && num <=100){
            letterGrade = "A";
        } else if (num >=80 && num < 90){
            letterGrade = "B";
        }else if (num >=70 && num < 80){    
            letterGrade = "C";
        }else if (num >=60 && num < 70){    
            letterGrade = "D";
        } else {
            letterGrade = "F";
        }
        System.out.println("The corresponding letter grade is: " + letterGrade);
    }
}
