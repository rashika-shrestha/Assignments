package assisgnments;

import java.awt.*;
import java.util.Random;
import java.util.Scanner;

public class Assignment28 {

/*
Prime Numbers from 1 to 100
1 2 3 5 7
11 13 17 19
23 29
31 37
41 43 47
53 59
61 67
71 73 79
83 89
97
101 103

from above chart
prime number of 0 is 1
prime number of 1 is 2
prime number of 3 is 5
prime number of 25 is 97

    28.	Write a program in a single class having the following functions.
    a.	is Prime number(int) - prime number is 2,3,5,7,11, ..
    b.	first Nth Prime(int )
    c.	all Prime between (int start , int  end)
 */

    public static void main(String[] args) {
        Scanner singleClass = new Scanner(System.in);
        //q28a(singleClass);
        q28b(singleClass);
        //q28c(singleClass);
    }

    public static void q28a(Scanner singleClass) {
        // 28a. Write a program in a single class having the following functions.
        // is Prime number(int)
        boolean flag = true;
        System.out.println("Enter the number to check is Prime number or not : ");
        int n = singleClass.nextInt();

        if (n == 0 || n == 1) {
            System.out.println(n + " is not a prime number");
            return;
        }
        for (int i = 2; i <= n / 2; i++) { // if enter 40 , 30 , 20 print double ?
            if (n % i == 0) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println(n + " is a prime number");
        } else {
            System.out.println(n + " is not a prime number");
        }
    }

    public static boolean isPrime(int n) {
        boolean flag = true;
        if (n == 0 || n == 1) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                flag = false;
                break;
            }
        }
        return flag;
    }

    public static void q28b(Scanner singleClass) {
        //b first Nth Prime(int)

        boolean flag = true;
        System.out.println("Enter nth number that you want prime of : ");
        int n = singleClass.nextInt();

        int counter = 0, i = 1;

        while (counter != n) {
            i++;
            if (isPrime(i)) {
                counter++;
            }

        }
        System.out.println("nth prime of " +n+ " is: " + i);
    }

    public static void q28c(Scanner singleClass) {
        // c all Prime between (int start , int  end)
        int i;
        System.out.println("Enter Start number : ");
        int startNumber = singleClass.nextInt();
        int original = startNumber;
        System.out.println("Enter End number: ");
        int endNumber = singleClass.nextInt();

        while (startNumber < endNumber) {
            boolean flag = false;   // ****** why do we give this?
            for (i = 2; i <= startNumber / 2; ++i) {
                if (startNumber % i == 0) {
                    flag = true; // why this flag + true for and break ?
                    break;
                }
            }
            if (!flag && startNumber != 0 && startNumber != 1 && startNumber != 2)
                System.out.println("Prime numbers between " + original + " and " + endNumber + " are : " + startNumber);
            ++startNumber; // why this at the end ?
        }
    }


}
