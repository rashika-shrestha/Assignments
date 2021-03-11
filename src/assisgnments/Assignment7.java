package assisgnments;

import java.util.Scanner;

public class Assignment7 {

    /*
    7.	Write a program that reads the radius and
        length of a cylinder and computes volume.
     */
    //Volume of Cylinder = Pix(radius of cylinder x2) x height of cylinder
    public static void main(String[] args) {
        Scanner VolOfCylinder = new Scanner(System.in);
        System.out.println("Enter value of Radius R1= ");
        double R1 = VolOfCylinder.nextDouble(); // 2
        System.out.println("Enter value of Height H1=");
        double H1 =VolOfCylinder.nextDouble(); // 5
        double Pi = 3.14;

        double AreaOfCylinder = Pi * R1 * R1;
        double VolumeOfCylinder = AreaOfCylinder * H1 ;

        System.out.println("The Area of Cylinder is = " + AreaOfCylinder);
        System.out.println("The Volume of Cylinder is = " + VolumeOfCylinder); // why it gives 62.800000000000004 ~ 62.80?
        System.out.printf("The Volume of Cylinder is = %.3f",  VolumeOfCylinder);

        System.out.println();
        float n1 = 1234.123456789123456789123456789F;
        double n2 = 1234.123456789123456789123456789;
        System.out.println(n1);
        System.out.println(n2);

    }


}
