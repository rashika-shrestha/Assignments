package assisgnments;

import java.util.Scanner;

public class Assignment6 {
    /*
    6.	Write a program to find the perimeter of a c
        Circle, triangle, and rectangle.
     */

    public static void main(String[] args) {
    //Perimeter of Circle (2PiR)
        Scanner input = new Scanner(System.in);
        System.out.println("Enter value of Radius R: ");
        double R = input.nextInt();
        double Pi = 3.14, radius;
        double PerOfCircle = 2*Pi*R;
        System.out.println("Perimeter of Circle = " + PerOfCircle);

    //Perimeter pf Triangle (2L+2W) // given L=2.5 W=3.14, expected 5+6.28= 11.28
        System.out.println("Enter value of Length L = ");
        float L = input.nextFloat();
        System.out.println("Enter value of Width W + ");
        float W = input.nextFloat();
        float PerimeterOfTriangle = 2*L + 2*W ;
        System.out.println("Perimeter of Triangle = " + PerimeterOfTriangle);


     //Perimeter of Rectangle (a+b+c)
        System.out.println("Enter Value of A = ");
        double A = input.nextDouble();
        System.out.println("Enter Value of B = ");
        double B = input.nextDouble();
        System.out.println("Enter Value of C = ");
        double C = input.nextDouble();
        double PerimeterOfRectangle = (A + B + C);
        System.out.println("Perimeter of Rectangle = " + PerimeterOfRectangle);

    }

}
