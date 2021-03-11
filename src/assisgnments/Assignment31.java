package assisgnments;

import java.util.Scanner;

public class Assignment31 {
    /*
    31.	Write a Program display following patterns.
         1 (0*10+1)
         12 (1*10+2)
         123 (12*10+3)
         1234 (123*10+4)
         12345 (1234*10+5)
     */

    public static void main(String[] args) {
        Scanner times = new Scanner(System.in);
        System.out.println("Enter the number of pattern you want to display: ");
        int total = times.nextInt();
        System.out.println("Display of " + total + " patterns:");
        int a = 0;
        for (int b = 1; b <= total; b++) {
            a = a * 10 + b;
            // 0*10+1=1, 1*10+2=12, 12*10+3=123, 123*10+4=1234, 1234*10+5=12345
            System.out.println(a + " ");
        }
        System.out.println("Exist for program.");
    }

}
