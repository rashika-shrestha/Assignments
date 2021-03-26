package assisgnments;

import javax.lang.model.util.SimpleAnnotationValueVisitor6;
import java.util.Enumeration;
import java.util.Scanner;

public class Question33 {
    //33.	Write a Program to display numbers in ascending order in array.

    public static void main(String[] args) {
        Scanner asc = new Scanner(System.in);
       // option1();
        option2(asc);

    }

    public static void option1() {
        int[] arr = {8, 40, 19, 20, 5};
        int temp = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int providedNumber = i + 1; providedNumber < arr.length; providedNumber++) {
                if (arr[i] > arr[providedNumber]) {
                    temp = arr[i];
                    arr[i] = arr[providedNumber];
                    arr[providedNumber] = temp;
                }
            }
        }
        System.out.println("Ascending order of array is : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }


    public static void option2(Scanner asc) {
        System.out.println("Enter the total display that you want to order of : "); //5
        int size = asc.nextInt();

        int[] arr = new int[size]; // ERROR CANNOT PUT int []
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the numbers you want in ascending order: "); //8,40,19,50, 5
            arr[i] = asc.nextInt();
        }

        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int compareNumber = i + 1; compareNumber < arr.length; compareNumber++) {
                if (arr[i] > arr[compareNumber]) {
                    temp = arr[i];
                    arr[i] = arr[compareNumber];
                    arr[compareNumber] = temp;

                }
            }
        }

        System.out.println("Ascending order of array is : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

}
