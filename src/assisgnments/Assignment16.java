package assisgnments;

import java.util.Scanner;

public class Assignment16 {
    /*
    16.	Write a program to find the given number is even or odd.
     */

    public static void main(String[] args) {
        Scanner oddEven = new Scanner(System.in);
        System.out.println("Please enter the Number that you like: ");
        int enteredNumber = oddEven.nextInt();
        if (enteredNumber % 2 == 0) {
            System.out.println("The provided number is even number");
        } else {
            System.out.println("The provided number is odd number");
        }
    }

}
