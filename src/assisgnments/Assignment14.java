package assisgnments;

import java.util.Scanner;

public class Assignment14 {
    /*
    14.	Write a program to relate two integers entered
        by the user using == or > or < sign.
     */

    public static void main(String[] args) {
        Scanner twoIntegers = new Scanner(System.in);
        greaterThan(twoIntegers);
        equalTo(twoIntegers);
        lessThan(twoIntegers);

    }

    public static void greaterThan(Scanner twoIntegers) {
        int a = 100;
        int b = 200;
        if (a > b) {
            System.out.println("a is greater than b");
        } else {
            System.out.println("a is smaller than b");
        }
    }

    public static void equalTo(Scanner twoIntegers) {
        int a = 100;
        int b = 200;
        if (a == b) {
            System.out.println("a is equal to b");
        } else {
            System.out.println("a is not equal to b");
        }

    }

    public static void lessThan(Scanner twoIntegers) {
        int a = 100;
        int b = 200;
        if (a < b) {
            System.out.println("b is greater than a");
        } else {
            System.out.println("b is not greater than a");
        }

    }

}

