package notesAndPractice;

import assisgnments.Assignment1and2;
import practices.*;

import java.util.Scanner;


public class Day12_Call_Class_Method {

    public static void main(String[] args) {
        System.out.println(Day12_ClassesObjects_Static.staticValue);
        //below is none static therefore can not call (none associated)
        // System.out.println(Day12_ClassesObjects_Static.nonStaticValue);

        Day12_ClassesObjects_Static.sumClass();
        Day11_Method.writeToRun();
        //if method need is in other package and whole package can be call by .* or only
        // calling package of method followed by "." + class
        practice_1.asg4(); // calling class of another package
        Assignment1and2.introduction1();

        //below method has Scanned, how to call this kind of method?
        Day8_If_Statements.elseIfSample2(new Scanner(System.in));
    }
}
