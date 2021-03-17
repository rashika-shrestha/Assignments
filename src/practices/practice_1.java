package practices;

import javax.swing.*;
import java.util.Scanner;

public class practice_1 {
    public static void main(String[] args) {
        Scanner practice = new Scanner(System.in);
        // asg1_2(practice);
        // asg3(practice);
        //asg4();
        //asg5(practice);
        //asg6(practice);
        asg7(practice);



    }

    public static void asg1_2(Scanner practice) {
        System.out.println("Hello World");
        System.out.println("This is practice");
        System.out.println("To print three lines");
    }

    public static void asg3(Scanner practice) {
        System.out.println("Enter the value for a : ");
        int a = practice.nextInt();
        System.out.println("Enter the value for b = ");
        int b = practice.nextInt();

        int sum = a + b;
        float average = (a + b) / 2; //2+3=5 /2 = 2.5 (but coming 2.0)
        System.out.println("Sum of a and b is : " + sum);
        System.out.println("Average of a and b is : " + average);
    }

    public static void asg4() {
        int P, T, R;
        P = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter value for P = "));
        T = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter value for T =  "));
        R = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter value for R = "));

        int simpleInterest = (P * T * R) / 100;
        JOptionPane.showMessageDialog(null, "Simple interest of " + P + "," + T + " and " + R + " is : " + simpleInterest);
    }

    public static void asg5(Scanner practice) {
        //pi = 3.14
        //area of Circle = pi * radius
        //area of rectangle= length * width
        //area of triangle = (base*height) / 2
        System.out.println("**************** Area *************");
        System.out.println("Enter the value of radius: ");
        double r = practice.nextDouble();
        double areaOfCircle = 3.14 * r;
        System.out.println("Area of circle for" + r + " is: " + areaOfCircle);
        System.out.println("***************************");

        System.out.println("Enter the value of length: ");
        float l = practice.nextFloat();
        System.out.println("Enter the value of width: ");
        float w = practice.nextFloat();
        float areOfRectangle = l * w;
        System.out.println("Area of rectangle of " + l + " abd " + w + " is: " + areOfRectangle);
        System.out.println("********************************");

        System.out.println("Enter the value of base: ");
        short b = practice.nextShort();
        System.out.println("Enter the value of height: ");
        short h = practice.nextShort();
        short areaOfTriangle = (short) ((b * h) / 2);
        System.out.println("Area of triangle of " + b + " and " + h + " is " + areaOfTriangle);
    }

    public static void asg6(Scanner practice) {
        //Perimeter of Circle = (2PiR)
        //Perimeter pf Triangle (a+b+c)
        //Perimeter of Rectangle = 2(l+w)
        //pi = 3.14

        System.out.println("******* Perimeter ***** ");
        System.out.println("Enter the value of Radius=  ");
        short R = practice.nextShort();
        short pi = (short) 3.14;
        short perOfCircle = (short) (2 * pi * R);
        System.out.println("Perimeter of Circle for " + R + " is :" + perOfCircle);
        System.out.println("*****************************");

        System.out.println("Enter value of a = " );
        int a = practice.nextInt();
        System.out.println("Enter the value of b = ");
        int b = practice.nextInt();
        System.out.println("Enter the value of c = ");
        int c = practice.nextInt();
        int perOfTriangle = (a + b + c);
        System.out.println("Perimeter of Triangle for "+a+ " , " +b+ " and " +c+ " is: "+perOfTriangle);

        System.out.println("Enter value of Length: ");
        double L = practice.nextDouble();
        System.out.println("Enter value of wight: ");
        double W = practice.nextDouble();
        double perOfRectangle = 2 * (L +  W);
        System.out.println("Perimeter of Rectangle for "+L+ " and "+W+ " is " +perOfRectangle);
        System.out.println("****************************");
    }

    public static void asg7(Scanner practice) {
        //Volume of Cylinder = Area of Cylinder * Height of cylinder
        // Area of Cylinder = pi * radius * radius
        double pi = 3.14;
        System.out.println("Enter the value of length of Cylinder = ");
        double L = practice.nextDouble();
        System.out.println("Enter the value of radius of Cylinder = ");
        double R = practice.nextDouble();
        double AreaOfCylinder = pi * R * R ;
        System.out.println("Area of Cylinder is: " + AreaOfCylinder);
        double VolOfCylinder = AreaOfCylinder * L;
        System.out.println("Volume of Cylinder is : " +VolOfCylinder);
        System.out.println("**************************");
    }

    public static void asg8(Scanner practice) {

    }



}
