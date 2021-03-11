package assisgnments;

import java.util.Scanner;

public class Assignment11 {
   /*
   11.	Write a program to swap two numbers
        a) using temp variable
        b) without temp variable
    */

    public static void main(String[] args) {
        Scanner swapAssignment = new Scanner(System.in);
        Question11a(swapAssignment);
        Question11b(swapAssignment);
    }

    //11a. Swap two number with temp variable
    public static void Question11a(Scanner swapAssignment) {
        int a = 5;
        int b = 3;
        System.out.println("Value of a before swap=  " + a);
        System.out.println("Value of b before swap= " + b);
        //provide value a=b
        a = b; // value of a is making to c
        System.out.println("=== After making value a equals to b === ");
        System.out.println("Value of a will be same as b= " + a);
        System.out.println("Value of b will remain same before swap: " + b);
        int c = 5; // here provide value oa a to C for temporary to swap
        b = c; // value of c which is value a is swap to b
        System.out.println("=== After give temp value and swapping===");
        System.out.println("After swapping, value of a is: " + a);
        System.out.println("After swapping, value of b is: " + b);
    }

    //11b. Swap two numbers without temp variable
    public static void Question11b(Scanner swapAssigment) {
        int c = 1;
        int d = 2;
        System.out.println("Value before swap for a: " + c);
        System.out.println("Value before swap for b: " + d);
        c = c + d; //3
        d = c - d; // 3-2 = 1 (new value for b)
        c = c - d; //3-1 = 2 (new value for a)
        System.out.println("=== Swapping without temp variable===");
        System.out.println("Value after swap for a: " + c);
        System.out.println("Value after swap for b: " + d);
    }

}
