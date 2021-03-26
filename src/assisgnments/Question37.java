package assisgnments;

import java.util.Scanner;

public class Question37 {
    /* 37.	Write a Program to perform for the following task.
        a   1  2  3     4   5   6     5  7  9
            4  5  6  +  2   7   8  =  6 12  14
            7  8  9     3   1   9    10  9  18

     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Option1(input);
          Option2();
    }

    public static void Option1(Scanner input) {
        System.out.println("Enter size of rows: "); // 3 rows  - 4
        int ROWS = input.nextInt();
        System.out.println("Enter size of columns: "); // 4 columns - 3
        int COLS = input.nextInt();

        int[][] arr1 = new int[ROWS][COLS];
        int[][] arr2 = new int[ROWS][COLS];
        int[][] sumArray = new int[ROWS][COLS];

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                System.out.println("Enter value of array for arr1: ");
                arr1[i][j] = input.nextInt();
            }
        }
        System.out.println("exit from array1 loop....");
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                System.out.println("Enter value of array for arr2: ");
                arr2[i][j] = input.nextInt();
            }
        }

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                sumArray[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        for (int x = 0; x < sumArray.length; x++) {
            for (int y = 0; y < sumArray.length; y++) {
                System.out.print(sumArray[x][y] + " ");
            }
            System.out.println();
        }
    }


    public static void Option2() {
        //when there is mismatch of row and column next of length in sumArray .length + will need
        // +1 if column > length (value greater than)
        // -1 if column <length (value less than)
//         int[][] arr1 = {{1, 2, 3}, {1, 2, 3}, {1, 2, 3}, {1,2,3}}; //
//          int[][] arr2 = {{1, 2, 3}, {1, 2, 3}, {1, 2, 3}, {1,2,3}};

        int[][] arr1 = {{1, 2, 3, 4,5}, {1, 2, 3, 4,5}, {1, 2, 3, 4,5}};  // this will give 2 4 6
        int[][] arr2 = {{1, 2, 3, 4,5}, {1, 2, 3, 4,5}, {1, 2, 3, 4,5}};  // expecting 2 4 6 8 // below gives 2 4 6 8

    //    int[][] arr1 = {{1, 2, 3, 4}, {1, 2, 3, 4}, {1, 2, 3, 4},{1,2,3,4}};
   //     int[][] arr2 = {{1, 2, 3, 4}, {1, 2, 3, 4}, {1, 2, 3, 4},{1,2,3,4}};
        System.out.println(arr1.length);
        int[][] sumArray = new int[arr1.length][arr1.length+2]; // here we can give arr1 or arr2

//        int sum = 0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
//                sum = arr1[i][j] + arr2[i][j];
                sumArray[i][j] = arr1[i][j] + arr2[i][j];
            }
        } // we can use same i and j for sum to print because its in separate {}
        for (int x = 0; x < sumArray.length; x++) {
            for (int y = 0; y < sumArray[x].length; y++) {
                System.out.print(sumArray[x][y] + " ");
            }
            System.out.println();
        }
    }


}

