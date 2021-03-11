package assisgnments;

import java.util.Scanner;

public class Assignment12 {
    /*
    12.	Write a program to accept the age, name, and
        nationality of the person and display those values in good format.
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Full Name: ");
        String name = input.nextLine();
        System.out.println("Enter Nationality of person: ");
        String nationality = input.nextLine();
        System.out.println("Enter Age of the person: ");
        String age = input.nextLine();

        System.out.println("=== Display the Name, Nationality & Age in good format");
        System.out.println("Name is: " + name);
        System.out.println("Nationality is: " + nationality);
        System.out.println("Age is: " + age);

    }

}
