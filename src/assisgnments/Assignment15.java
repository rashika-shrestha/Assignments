package assisgnments;

import java.util.Scanner;

public class Assignment15 {
    /*
    15.	Write a program that receives an ASCII code (between 0 – 128)
        and display its character [example: 97 (input) ->a(output)].
     */

    public static void main(String[] args) {
        Scanner asciiCode = new Scanner(System.in);
        System.out.println("Enter ASCII Code: ");
        int n = asciiCode.nextInt();
        if (n >= 0 && n <= 128) {
            char c = (char) n;
            System.out.println("Corresponding characters is: " + c);
        } else {
            System.out.println("You have entered out of range ASCII Code");
        }

    }
}
