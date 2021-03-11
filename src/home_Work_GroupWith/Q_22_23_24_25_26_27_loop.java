package home_Work_GroupWith;

import javax.swing.*;
import java.util.Scanner;

public class Q_22_23_24_25_26_27_loop {

    public static void main(String[] args) {
        Scanner loopQ = new Scanner(System.in);
        //question22_Option1(loopQ);
        //question22_Option2();
        // question23_1(loopQ);
        //question24_1(loopQ);
        // question25_1(loopQ);
        //question26_1();
        question27_1();
    }

    public static void question22_Option1(Scanner loopQ) {
        //22.	Write a program to print the table of given number.
        // find the multiplication table of given number, if 6 get the table of 6
        // 6*1=6,6*2=12,6*3=18 ... 6*10=60
        System.out.println("Enter number: ");
        int a = loopQ.nextInt();
        for (int i = 1; i <= 10; i++) {
            int t = a * i;
            System.out.println(a + "*" + i + "=" + t);
        }
        System.out.println("Exist from loop");
    }

    public static void question22_Option2() {
        int a;

        a = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the number of loop to go: "));
        for (int i = 1; i <= 10; i++) {
            int t = a * i;
            JOptionPane.showMessageDialog(null, a + "*" + i + "=" + t);
        }
    }


    public static void question23_1(Scanner loopQ) {
        //23. Write a Program to sum 1 to nth natural numbers.
        //if you enter 3 = n loop will find 1 & 2 is less than three therefore once it loop to 3 which
        // is not less than 3 so it stops and calculate  1+2=3
        // if you enter 9 = 1+2+3+4+5+6+7+8 = 36
        int n = Integer.parseInt(JOptionPane.showInputDialog("Enter the number: "));
        int sum = 0;
        for (int i = 1; i < n; i++) {
            sum = sum + i;
        }
        JOptionPane.showMessageDialog(null, "Sum of nth number is: " + sum);
    }


    public static void question24_1(Scanner loopQ) {
        //24.Write a program to print the factorial number of given numbers.
        // If factorial is = 2, and n = 2 >> then it will loop 1,2, stops at 2 because n is 2,
        // therefore  1*2 = 2 * factorial given is 2 = 2*2 = 4
        // If enter 4, if will be 1*2*3*4 = 24, it will loop till it finds the number 4, 24*2 = 48
        int n = Integer.parseInt(JOptionPane.showInputDialog("Enter the number to find factorial of: "));
        int factorial = 1;
        int i = 1;
        while (i <= n) {
            factorial = factorial * i;
            i++;
        }
        JOptionPane.showMessageDialog(null, "The factorial of given number " + n + " is = " + factorial);
    }

    public static void question25_1(Scanner loopQ) {
     /* 25. Write a program that prompts the user to enter the number of
            students and each student’s name and score. Finally display
            the student with the highest score.  */
        System.out.println("Enter number of student: ");
        int studentNo = loopQ.nextInt();
        int maxScore = 0;
        String studentName = "";
        for (int i = 1; i <= studentNo; i++) {
            System.out.println("Enter student name: ");
            String name = loopQ.next();
            System.out.println("Enter score: ");
            int score = loopQ.nextInt();
            if (score > maxScore) {
                maxScore = score;
                studentName = name;
            }
        }
        System.out.println("Student name is: " + studentName);
        System.out.println("Max score is: " + maxScore);
    }


    public static void question26_1() {
        //26. Write a Program to reverse the given number. //123 => 321
        int n, reverse = 0; // Why this reverse = 0 ?
        n = Integer.parseInt(JOptionPane.showInputDialog("Enter the numbers that you want to find reverse: "));

        int original = n;
        while (n != 0) { // is the formula to find reverse ?
            reverse = reverse * 10;
            reverse = reverse + n % 10;
            n = n / 10;
        }
        JOptionPane.showMessageDialog(null, "Reverse of " + original + " is: " + reverse);
    }


    public static void question27_1() {
        //27. Write a Program to sum each digit of given number as well as product. //456 =>4*5*6 and 4+5+6
        int n = Integer.parseInt(JOptionPane.showInputDialog("Enter the numbers that you want to find reverse: "));
        int sum = 0, product = 1;

        int original = n;
        while (n != 0) {
            int temp = n % 10;
            sum = sum + temp;
            product = product * temp;
            n = n / 10;
        }
        JOptionPane.showMessageDialog(null, "Sum of " + original + " is: " + sum);
        JOptionPane.showMessageDialog(null, "Product of " + original + " is: " + product);

    }


}
