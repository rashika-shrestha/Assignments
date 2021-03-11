package assisgnments;

import java.util.Scanner;

public class Assignment30 {
    /*
    30.	Write a program to print the Fibonacci series.0 1 1 2 3 5 8 ….
   */

    public static void main(String[] args) {
        Scanner Fib = new Scanner(System.in);
        // question30a (Fib);
        question30b(Fib);
    }

    public static void question30a(Scanner Fib) {
        System.out.println("Enter the maximum number of fibonacci: ");
        int x = Fib.nextInt();
        int firstSequence = 0;
        int nextSequence = 1;

        System.out.println("Fibonacci series of first " + x + " are : ");

        for (int i = 1; i <= x; ++i) {
            System.out.println(firstSequence + "");

            int sum = firstSequence + nextSequence;
            firstSequence = nextSequence;
            nextSequence = sum;

        }
        System.out.println("Exit of Fibonacci program.");
    }

    public static void question30b(Scanner Fib) {
        // this is asking # to print, ask for first and second number
        //and calculate with fibonacci method, enter 3,2,4 will print 2,4,6
        // 2 (first number), 2+2 = 4 (second number), 2+4 = 6 (third number), stops ask for 3 times
        System.out.println("Enter the max number: ");
        int max = Fib.nextInt();
        System.out.println("Enter the first sequence: ");
        int firstSequence = Fib.nextInt();
        System.out.println("Enter the next sequence: ");
        int secondSequence = Fib.nextInt();

        System.out.println("Fibonacci Series are: ");

        int i = 1;
        while (i <= max) {
            System.out.println(firstSequence + " ");
            int sum = firstSequence + secondSequence;
            firstSequence = secondSequence;
            secondSequence = sum;
            i++;
        }
        System.out.println("Exist from program.");


    }
}
