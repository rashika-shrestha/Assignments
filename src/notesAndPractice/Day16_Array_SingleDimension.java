package notesAndPractice;

import java.util.Scanner;

public class Day16_Array_SingleDimension {
    /*
     Array : is use when there is more than one data need to store.
     Single dimension: <data type> [] <array name > = new <data type > [size of an array];
     Multi dimension: <data type> [] [] <array name> = new <datatype> [size of array in Row] [size of array in Column]

     if there is no value provided, for int it will give default value as "0" and for String "null"
     */

    public static void main(String[] args) {
        Scanner inputArray = new Scanner(System.in);
        singleDim_Sample1();
        singleDim_Sample2();
        singleDim_Sample3(inputArray);
        singleDim_Sample4(inputArray);
        singleDim_Sample5();
        singleDim_Sample6();
        singleDim_Sample7(inputArray);
    }

/*Single Dimension Array
    Single dimension: <data type> [] <array name > = new <data type > [size of an array];
*/

    public static void singleDim_Sample1() {
        //data type> [] <array name > = new <data type > [size of an array];
        String[] names = new String[3]; // here new will create the object, 4 will create 4 elements of array

        System.out.println(names); //this will print proxy (false) value of string I@4dd8dc3
        System.out.println(names.length); // this will print number of size given above
        System.out.println(names[0]); // this will print null bc we have not provide any value
        System.out.println(names[1]); // this will print null bc we have not provide any value
        System.out.println(names[2]); // this will print null bc we have not provide any value
        // int, will print   .. 3 >> 0 >> 0 >> 0 >>0
        // double, will print   3 >> 0.0 >> 0.0 >> 0.0
        // boolean, will print  3 >> false >> false >> false
        System.out.println("==== End of code for singleDim_Sample1 ====");
    }

    public static void singleDim_Sample2() {
        double[] names = new double[3]; // here new will create the object, 4 will create 4 elements of array

        System.out.println(names); //this will print proxy (false) value of string [Ljava.lang.String;@4edde6e5
        System.out.println(names.length); // this will print number of size given above
        System.out.println(names[0]); // this will print null bc we have not provide any value
        System.out.println(names[1]); // this will print null bc we have not provide any value
        System.out.println(names[2]); // this will print null bc we have not provide any value
        //    System.out.println(names [3]);
        // int, will print   [I@70177ecd >> 3 >> 0 >> 0 >> 0 >>0
        // double, will print  [D@70177ecd >> 3 >> 0.0 >> 0.0 >> 0.0
        // boolean, will print [Z@70177ecd >> 3 >> false >> false >> false
        // if we give fourth println, system will give error  Exception in thread but if we give 2 system will print two only
        System.out.println("==== End of code for singleDim_Sample2 ====");
    }

    public static void singleDim_Sample3(Scanner inputArray) {
        String[] names = new String[3];

        System.out.println(names);
        System.out.println(names.length);

        //give value of name for each string, when String is given 3 it will expect to have 3
        // if we give 4, system will give error message but can print 2
        // row and column start with 0,1,2,3 ...

        names[0] = "Ram";
        names[1] = "Bharat";
        names[2] = "Laxman";
        //   names[3] = "Satrudhan"; // this will give error but if String given 4 then it will print

        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        //  System.out.println(names[3]);// before this when come to names[3], it will give error
        System.out.println("==== End of code for singleDim_Sample1 3====");
    }

    public static void singleDim_Sample4(Scanner inputArray) {
        String [] arr = new String[3]; //input value should be character inputArray should change next()
       // int [] arr = new int [3]; // input value should be number inputArray should change to nextInt()

        //below will input the data in array which need to run in for loop. int so input should be number
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the value for elements: "); // system will ask 3 value because asking [3]
            arr[i] = inputArray.next(); //if String
           // arr[i] = inputArray.nextInt(); //if int

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println();
        System.out.println("==== End of code for singleDim_Sample4 ====");
    }


    public static void singleDim_Sample5() {
        double[] arr = {10, 20, 30, 40};

        double sum = 0;
        for (double i = 0; i < arr.length; i++) {
            sum = sum + arr[(int) i]; // if int we can just put sum = sum + arr [i];
        }
        System.out.println("Sum to given array is : " + sum);
    }

    public static void singleDim_Sample6() {
        int[] arr = new int[]{1, 2, 3, 4, 5};

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("Sum of given array is: " + sum);
        System.out.println("==== End of code for singleDim_Sample6 ====");
    }


    public static void singleDim_Sample7(Scanner inputArray) {
        System.out.println("Enter size of an array: ");
        int size = inputArray.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter value of array: ");
            arr[i] = inputArray.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("Sum of provided value of array is : " + sum);
        System.out.println("==== End of code for singleDim_Sample7 ====");
    }


}
