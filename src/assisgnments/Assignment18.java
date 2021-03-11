package assisgnments;

public class Assignment18 {
    /*
    18.	Write a program to display the largest number from given three values.
     Nested if else
     */

    public static void main(String[] args) {
        int a = 4;
        int b = 13;
        int c = 13;

        if (a > b && a > c) {
            System.out.println("a is largest among three");
        } else if (b > a && b > c) {
            System.out.println("b is largest among three");
        } else if (c > a && c > b) {
            System.out.println("c is largest among three");
        } else {
            System.out.println("condition not met.");
        }

    }


}
