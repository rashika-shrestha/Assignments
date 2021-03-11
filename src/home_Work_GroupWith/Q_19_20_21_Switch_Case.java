package home_Work_GroupWith;

import javax.management.MBeanAttributeInfo;
import javax.swing.*;
import java.util.Scanner;

public class Q_19_20_21_Switch_Case {
    /*
    19.	Write a Program to accept three sides of a triangle
        and display which kind of triangle is formed.

    20.	Write a program to create the equivalent of a four-function calculator.
        The program to enter two integer’s numbers and an operator.
        It then carries out the specified arithmetic operator operation:
        addition, subtraction, multiplication or division of the two numbers.
        Finally, it displays the result.
    21.	Program to input the number of (1...7) and translate
        to its equivalent name of the day of the week.
    */

    public static void main(String[] args) {
        Scanner asg = new Scanner(System.in);
        Q19(asg); // if I put Q19 at top it does not run Q20
        Q20();
        Q21();
       // Q19(asg);
    }

    public static void Q19(Scanner asg) {
        int a, b, c;
        System.out.println();
        System.out.println("Enter the value for b: ");
        a = asg.nextInt();
        System.out.println("Enter the value for b: ");
        b = asg.nextInt();
        System.out.println("Enter the value for C: ");
        c = asg.nextInt();

        if (a == b && b == c) {
            System.out.println("This is Equilateral Triangle.");
        } else if (a == b || b == c || a == c) {
            System.out.println("This is Isosceles Triangle.");
        } else if (a != b && a != c && b!=c) {
            System.out.println("This is Scalene Triangle");
        } else {
            System.out.println("This do not Fall in Triangle.");
        }
        System.out.println("==== End of Question 19 =====");
    }

    public static void Q20() {
        String cal = JOptionPane.showInputDialog("Which function to run: + | - | * | / ");
        char choice = cal.charAt(0);

        int a = 0, b = 0;
        if (choice == '+' || choice == '-' || choice == '*' || choice == '/'){
            // if user has entered above four choice then only it will go to next line
            a= Integer.parseInt(JOptionPane.showInputDialog("Enter value for a: "));
            b= Integer.parseInt(JOptionPane.showInputDialog("Enter value for b: "));
        }

        switch (choice){

            case '+':
                int sum= a+b;
                JOptionPane.showMessageDialog(null,"Sum of a and b is: " + sum);
                break;
            case '-':
                int sub = a-b;
                JOptionPane.showMessageDialog(null,"The subtraction of a and b is: "+sub);
                break;
            case '*':
                int mul = a*b;
                JOptionPane.showMessageDialog(null,"multiplication of a and b is: "+ mul);
                break;
            case '/':
                int div = a/b;
                JOptionPane.showMessageDialog(null,"Division of a and b is: "+div);
                break;
            default:
                JOptionPane.showMessageDialog(null,"=== End of Question 20 =====");

        }
    }

    public static void Q21() {
        String number = JOptionPane.showInputDialog("Enter the day in number: " +
                "1Monday |2Tuesday |3Wednesday |4Thursday |5Friday |6Saturday |7Sunday");
        int OutputDay = Integer.parseInt(number);

        switch (OutputDay){
            case 1:
                JOptionPane.showMessageDialog(null,"You entered the number which say today is Monday.");
                break;
            case 2:
                JOptionPane.showMessageDialog(null,"You entered the number which says today is Tuesday.");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "You entered the number which says today is Wednesday.");
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "You entered the number which says today is Thursday.");
                break;
            case 5:
                JOptionPane.showMessageDialog(null,"You entered the number which says today is Friday.");
                break;
            case 6:
                JOptionPane.showMessageDialog(null,"You entered the number which says today is Saturday.");
                break;
            case 7:
                JOptionPane.showMessageDialog(null, "You entered the number which says today is Sunday.");
                break;
            default:
                JOptionPane.showMessageDialog(null,"========= This is end of Question 21. ============");

        }
    }

}
