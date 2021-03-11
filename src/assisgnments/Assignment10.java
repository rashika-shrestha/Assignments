package assisgnments;

import java.util.Scanner;

public class Assignment10 {
 /*
     10. Write a Program for the following Mathematical Function.
       10a. s=ut+1/2 x att
       10b. area = square root s(s-a)(s-b)(s-c)
       10c. x = -b+ square root bb-4ac / 2a
  */

    public static void main(String[] args) {
        Scanner functions = new Scanner(System.in);
        questionA(functions);

    }

    public static void questionA(Scanner functions) {
        System.out.println("Enter value of a =");
        double a = functions.nextDouble();
        System.out.println("Enter value of b =");
        double b = functions.nextDouble();
        System.out.println("Enter value of c =");
        double c = functions.nextDouble();
        System.out.println("Enter value of t =");
        double t = functions.nextDouble();
        System.out.println("Enter value of u =");
        double u = functions.nextDouble();

        // Solve of question 10a
        double s = (u * t) + ((a * t * t) / 2);
        //why did not work with (u * t) + ((1/2)*(a*t*t))
        System.out.println("Answer of S is = " + s);

        // Solve of question 10b
        s = (a + b + c) / 2;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.printf("Area is  %.3f", area);
        System.out.println();

        // Solve of question 10c
        double x = (-b + (Math.sqrt((b * b) - (4 * a * c)))) / (2 * a);
        System.out.printf("Answer of x is = %.2f", x);
        System.out.println();

        double z = Math.sqrt(71);
        System.out.printf("Square root of 71 = %.2f", z);
    }
}
