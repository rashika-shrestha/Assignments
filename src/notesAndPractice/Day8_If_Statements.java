package notesAndPractice;

import java.util.Scanner;

public class Day8_If_Statements {
/*
    if is a conditional statement that we can use for logical conditions like
    1. less than: a > b
    2. greater than: a > b
    3. equal to: a == b
    4. not equal to: a != b
    5. less than or equal to: a <= b
    6. greater than or equal to:  a >= b
*/

/*
 type of if statements:
 1. if : this is use when the condition is true
     if (condition){
        code to execute to say condition is true
    }
 2. if else : this is use when condition is false in another sentence
           for the same condition which is not true
           normally if else start with if ... is not true then .. else .. this
     if (condition){
        code to execute to say condition is true
    } else{
        code to execute to say condition is false
    }
 3. else if : this is use when verifying with set of condition,
              to verify new set of condition when first condition is false
              normally else if start with if ... else if .. and end with else
      if (condition1) {
          code to execute to say condition is true
        } else if (condition2) {
          code to executed if condition1 is false and condition2 is true
          we can have many else if conditions
        } else {
          code to be executed if the condition1 is false and
          all conditions are (last condition is)  false
        }
 4. nested if  else : this is use group of conditions
      if (condition1) {
         if (condition2){
         if (condition3){
               code to execute if condition1 meet
          }else {
                code to execute if condition2 meet
          }else {
                code to execute if condition3 meet
           }
        }

 5. switch case : this is use

*/

    public static void main(String[] args) {
        Scanner demoIFconditions = new Scanner(System.in);
        ifExample1(demoIFconditions); //1
        ifExample2(demoIFconditions); //1
        IfElseExample1(demoIFconditions); //2
        IfElseExample2(demoIFconditions); //2
        elseIfSample1(demoIFconditions); //3
        elseIfSample2(demoIFconditions); //3
        nestedIFexample1 (demoIFconditions); //4
        nestedIFexample2(demoIFconditions); //4
    }

    //1. if
    public static void ifExample1(Scanner demoIFconditions) {
        System.out.println("=== 1a. IfExample1 =====");
        if (40 > 30) {
            System.out.println("40 is greater than 30.");
        }
    }

    //1. if
    public static void ifExample2(Scanner demoIFconditions) {
        System.out.println("=== 1b. IfExample2 =====");
        int a = 40;
        int b = 30;
        if (a > b) ;
        {
            System.out.println("a is greater than b");
        }
    }

    //1.if using JOption Pane instead of System.out.print

    //2. if else
    public static void IfElseExample1(Scanner demoIFconditions) {
        System.out.println("=== 2a. IfElseExample1 =====");
        if (40 > 50) {
            System.out.println("40 is greater than 50");
        } else {
            System.out.println("40 is not greater than 50");
        }
    }

    //2. if else
    public static void IfElseExample2(Scanner demoIFconditions) {
        System.out.println("==== 2b.IfElseExample2 ====");
        int Temperature = 50;
        if (Temperature > 50) {
            System.out.println("Today's weather is nice.");
        } else {
            System.out.println("Today's weather is chilly");
        }
    }

    // 3. else if
    public static void elseIfSample1 (Scanner demoIFconditions) {
        System.out.println("=== 3a. elseIfSample1 ===" );
        int BP = 120;
        if (BP < 120){
            System.out.println("Low Blood Pressure.");
        }
        else if (BP > 120){
            System.out.println("High Blood Pressure");
        }
        else if (BP == 120){
            System.out.println("Normal Blood Pressure");
        }
    }

    // 3. else if
    public static void elseIfSample2(Scanner demoIFconditions) {
        System.out.println("=== 3b. elseIfSample2 ===");
        int BP = 10;
        if (BP >= 110 && BP <= 130)
            System.out.println("Range of BP is normal");
        else if (BP >= 140 && BP <= 150)
            System.out.println("Range of BP is High");
        else if (BP > 160) {
            System.out.println("BP is super High");
        }else {
            System.out.println("No BP range found");
        }
    }

    //4.Nested if
    public static void nestedIFexample1 (Scanner demoIFconditions) {
        System.out.println("===4a. NestedIF1 === ");

    }

    //4.Nested if
    public static void nestedIFexample2(Scanner demoIFconditions) {
        System.out.println("===4b. NestedIF2 === ");

    }

}
