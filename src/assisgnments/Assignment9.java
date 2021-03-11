package assisgnments;

import java.util.Scanner;

public class Assignment9 {
    /*
    9.	Write a program that converts pounds into kg.
        The program prompts the user to enter a number of
        pounds, converts it to kg and displays the result [1 pound is 0.454 kg].
     */

    public static void main(String[] args) {
        Scanner poundToKg = new Scanner(System.in);

        System.out.println("Enter value of pound = ");
        double pound = poundToKg.nextInt();
        double conv1PoundToKG = 0.454;
        double kg =  pound * conv1PoundToKG;
        System.out.println(pound + " pound equals to " + kg + " kg");
    }

}
