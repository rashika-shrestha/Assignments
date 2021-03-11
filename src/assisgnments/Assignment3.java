package assisgnments;

import java.util.Scanner;

public class Assignment3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        averageOfNumber(input);
        simpleInterest(input);
       }
        /*
    3. Write a program to find sum and average of two
        numbers input by User (using Scanner class).
     */
    public static void averageOfNumber (Scanner input){
        System.out.println("Enter Your First Number a: ");
        int a = input.nextInt();
        System.out.println("Enter Your Second Number b: ");
        int b = input.nextInt();
        int sum = a + b ;
        System.out.println("Sum pf a and b is: " + sum);

        int average = (a + b) / 2;
        System.out.println("Average of a and b is: " + average);
     }

    /*
    4.	Write a program to calculate Simple Interest input
        by the user. Simple Interest = P*T*R/100
     */
    public static void simpleInterest(Scanner input) {
        System.out.println("Enter value for p: ");
        int p = input.nextInt();
        System.out.println("Enter value for t: ");
        int t = input.nextInt();
        System.out.println("Enter value for r: ");
        int r = input.nextInt();

        int InterestPTR = (p*t*r) / 100;
        System.out.println("Result of Simple Interest = " + InterestPTR);

    }


}
