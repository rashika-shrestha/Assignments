package home_Work_GroupWith;

import java.util.Scanner;

public class Q_13_14_15_16_17_18_if_else_ifElse_elseIF {
    public static void QifElse (Scanner Q13_18) {
        Scanner Qif = new Scanner(System.in);
        question13(Qif);
        question14_greaterThan(Qif);
        question14_greaterThan_equalTo(Qif);
        question14_greaterThan_lessThan(Qif);



    }

    public static void question13(Scanner Qif) {
     /*
    13.	Write a program to print the number entered by the
        user only if the number entered is negative.
     */

        Scanner printNegative = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = printNegative.nextInt();
        if (number < 0) {
            System.out.println("Entered number is negative: " + number);
        } else {
            System.out.println("Entered number is not negative number " + number);
        }
    }

/*
14.	Write a program to relate two integers entered
    by the user using ==(equalTo) or > (greaterThan) or < (lessThan) sign.
  */

    public static void question14_greaterThan(Scanner QifElse) {
         int a = 100;
         int b = 200;
          if (a > b) {
             System.out.println("a is greater than b");
          } else {
             System.out.println("a is smaller than b");
          }
    }


    public static void question14_greaterThan_equalTo(Scanner QifElse) {
         int a = 100;
         int b = 200;
         if (a == b) {
              System.out.println("a is equal to b");
          } else {
              System.out.println("a is not equal to b");
           }

       }

    public static void question14_greaterThan_lessThan(Scanner QifElse) {
            int a = 100;
            int b = 200;
            if (a < b) {
                System.out.println("b is greater than a");
            } else {
                System.out.println("b is not greater than a");
            }
    }

}
