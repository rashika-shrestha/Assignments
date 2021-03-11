package assisgnments;

import java.util.Scanner;

public class Assignment8 {
    /*
         8.	Write a program to convert Fahrenheit to Celsius and Celsius to Fahrenheit
    */

    public static void main(String[] args) {
        Scanner convert = new Scanner(System.in);

        fahrenheitToCelsius (convert);
        celsiusToFahrenheit (convert);
    }

   //convert Fahrenheit to Celsius - (F - 32) x 5/9
    public static void fahrenheitToCelsius (Scanner convert) {
        System.out.println("Enter value of Fahrenheit = ");
        double fahrenheit = convert.nextDouble();

        double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.printf("Celsius of this fahrenheit is = %.3f", celsius);
    }

   //Celsius to Fahrenheit - (C x 9/5) +32
    public static void celsiusToFahrenheit (Scanner convert) {
        System.out.println();
        System.out.println("Enter value of Celsius = ");
        double celsius = convert.nextDouble();

        double fahrenheit = ((celsius * 9)/5) + 32;
        System.out.printf ("Fahrenheit of this Celsius is = %.1f", fahrenheit);
    }
}
