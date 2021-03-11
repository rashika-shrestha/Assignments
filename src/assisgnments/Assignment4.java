package assisgnments;

import java.util.Scanner;

public class Assignment4 {
    /*
4.	Write a program to calculate Simple Interest input
    by the user. Simple Interest = P*T*R/100
 */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter value for P: ");
        int P = input.nextInt();
        System.out.println("Enter value for T: ");
        int T = input.nextInt();
        System.out.println("Enter value for R: ");
        int R = input.nextInt();

        int InterestPTR = (P*T*R) / 100;
        System.out.println("Result of Simple Interest = " + InterestPTR);
    }


}