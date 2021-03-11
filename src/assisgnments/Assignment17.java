package assisgnments;

import java.util.Scanner;

public class Assignment17 {
    /*
    17.	Write a program to calculate leap year. Year%4==0
     */

    public static void main(String[] args) {
        Scanner CheckYear = new Scanner(System.in);
        leapYearCal1(CheckYear);
    }

    public static void leapYearCal1(Scanner CheckYear) {
        System.out.println("Enter the Year to check leap year with method 1: ");
        int enteredYear = CheckYear.nextInt();

        if ((enteredYear % 4 == 0) && (enteredYear % 100 != 0) || (enteredYear % 400 == 0)) {
            System.out.println("Provided year is leap year");
        } else {
            System.out.println("Provided year is not leap year");
        }
    }

}
