package assisgnments;

import java.util.Scanner;

public class Question32 {
    /*
    32.	Write a Program to accept 5 values in an array and display their sum.
     */

    public static void main(String[] args) {
        Scanner value5 = new Scanner(System.in);
        option1();
        option2(value5);  // error in line 37
    }


    public static void option1() {
        int[] array = {1, 2, 3, 4, 5};

        int sum = 0;
        for (int i = 0; i < array.length; i ++) {
            sum = sum + array[i];
        }
        System.out.println("Sum of given array is = " + sum);

    }


    public static void option2(Scanner value5) {
       System.out.println("====== second option with request for input =======");
        int[] array = new int[5];
        int sum = 0;

        System.out.println("Give 5 values that you want to add: ");
        for (int i = 0; i < array.length; i++)
       {
           array [i] = value5.nextInt();
        }
        for (int add : array) {
            sum = sum + add;
        }
           System.out.println("Sum of above is: " + sum);
    }


    }
