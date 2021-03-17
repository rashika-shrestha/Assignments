package assisgnments;

import java.util.Scanner;

public class Assignment5 {

    /*
    5.	Write a program to find the area of a
        circle, rectangle, and triangle.
     */

    public static void main(String[] args) {
        Scanner area = new Scanner(System.in);

            areaOfCircle (area);
            areaOfRectangle (area);
            areaOfTriangle (area);
    }

    public static void areaOfCircle(Scanner area) {
     //Area of Circle (Pi*R)
        System.out.println("Enter value of Radius: ");
        double Radius = area.nextDouble();
        double Pi = 3.14, AreaCircle;

        AreaCircle =Pi*Radius*Radius;
        System.out.println("Area of Circle= "+AreaCircle);
        }

    public static void areaOfRectangle (Scanner area) {
     //Area of Rectangle (LxW)** When I entered 6.805647076 is gives 46 instead of 46.316832
        System.out.println("Enter value of Length L: ");
        float  L = area.nextFloat(); //when I entered String it gave me error
        System.out.println("Enter value of Width W: ");
        float W = area.nextFloat(); //Can I write double here?
        float AreaOfRectangle = L*W;
        System.out.println("Area of Rectangle: " + AreaOfRectangle);
    }

    public static void areaOfTriangle (Scanner area) {
     //Area of Triangle (1/2 base x height)
        System.out.println("Enter value of Base b : "); // tried to enter 2147483647 and give Value out of range
        int b = area.nextInt();
        System.out.println("Enter value of Height h: ");
        int h = area.nextInt();
        int AreaOfTriangle = (b*h) / 2 ;
        System.out.println("Area of Triangle = " + AreaOfTriangle);
    }

}
