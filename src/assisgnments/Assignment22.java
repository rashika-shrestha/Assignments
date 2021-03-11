package assisgnments;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Assignment22 {
    // table of given number
    public static void main(String[] args) {
        Scanner tbl = new Scanner(System.in);
        System.out.println("Enter the number that you want : ");
        int tableFor = tbl.nextInt();
        for (int i = 1; i <= 10; i++) {
            int table = tableFor * i;
            System.out.println(tableFor + " * " + i + " = " + table);
        }
        System.out.println("Exist from table.");
    }
}
