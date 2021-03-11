package notesAndPractice;

import java.util.Scanner;

public class day7_Operators {
    public static void main(String[] args) {
        Scanner sample = new Scanner(System.in);
        sampleArtOperator(sample);
        sampleOperator(sample);
        sampleCompare(sample);
        incDecrement(sample);
        logical(sample);
        conditional(sample);
    }

    /*
    OPERATORS
    As per ASCII (American Standard Code for Information Interchange), there are 37 tokens
    in Operators

                Example:
                =   >   <   !   ~   ?   :
                ==  <=  >=  !=  &&  ||  ++  --
                +   -   *   /   &   |   ^   %   <<   >>   >>>
                +=  -=  *=  /=  &=  |=  ^=  %=  <<=  >>=  >>>=

    JAVA has following groups of operators:
    1. Arithmetic Operators
    2. Assignment Operators
    3. Relation Operator (Comparison Operators)
    4. Increment/Decrement Operator
    5. Logical Operators
    6. Conditional Operators
    7. Bitwise Operators (complex so will not study for now)
    8. Shift Operators  (complex so will not study for now)
*/

    /*
    1. Arithmetic Operators: + - * / %
       When enter 7/3 system will give quotient which is 2
       When enter 7 % 3 system will give remainder which is 1

       When doing math it will page precedence from above Arithmetic Operators : it take precedence on  + - (low) * / % (high)
        AND it goes (associativity) left to right. When solving below equation it flows

     */
    public static void sampleArtOperator(Scanner sample) {
        System.out.println(7 / 3); // this will give 2 quotient
        System.out.println(7 % 3);  // this will give 1 remainder
        System.out.println(7 + 3);
        System.out.println(7 - 3);
        System.out.println(7 * 3);
    }

    /*
    2. Assignment Operators (=): is used to assign values to variable ( + - * / % )
              =
              += (adds value to a variable)
              -= (subtract value to a variable)
              *= (multiply value to a variable)
              /= (divide value to a variable)
              %= (
    */
    public static void sampleOperator(Scanner sample) {
        int i = 3;
        System.out.println(i);
        i += 2; // instead of writing s = i+2
        System.out.println(i); // this is print value of 5

        // in ths associativity will be Right to Left + - * / %
        int a = 3 + 2 - 4 / 2 + 4 * 3 - 7 % 3;
        System.out.println(a);
        a = 3 + 2 - 2 + 4 * 3 - 7 % 3;
        a = 3 + 2 - 2 + 12 - 7 % 3;
        a = 3 + 2 - 2 + 12 - 1;
        a = 5 - 2 + 12 - 1;
        a = 3 + 12 - 1;
        a = 15 - 1;
        a = 14;


        int b = 4 + 2 - 4 / 2 + 7 % 2 - 3 * 2;
        System.out.println(b);
        b = 4 + 2 - 4 / 2 + 7 % 2 - 6;
        b = 4 + 2 - 4 / 2 + 1 - 6;
        b = 4 + 2 - 2 + 1 - 6;
        b = 6 - 2 + 1 - 6;
        b = 4 + 1 - 6;
        b = 5 - 6;
        b = -1;
    }

/*
3. Increment/Decrement Operator (Comparison Operators)
> Greater than
< Less than
>= Greater than or equal to
<=  Less than or equal to
!= Not equal
== Equal to
 */

    public static void sampleCompare(Scanner sample) {
        int x = 2;
        int y = 3;
        System.out.println(x > y); // this will print false
        System.out.println(x < y); // this will print true
        System.out.println(x >= y); // this will print false
        System.out.println(x <= y); // this will print true
        System.out.println(x != y); // this will print true
        System.out.println(x == y); // this will print false
    }
/*
4. Increment/Decrement Operator
This is use when value is increase of decrease by 1
++  --
Pre  m++ n--
Post ++m --n
 */

    public static void incDecrement(Scanner sample) {
        int a = 3;
        int b = 3;
        System.out.println(a); //prints value 3
        ++a; // a= 1+a;
        System.out.println(a); // prints value 4
        --b;  // b = 1-b;
        System.out.println(b); // prints value 2

//******************************** Bujhena, value comes Pre and Post
        int m = 5;
        System.out.println(m); // prints 5
        int n = m++;
        System.out.println(m); // prints 6
        n--;
        System.out.println(n); //prints 4
    }

    /*
    5. Logical Operators : this is used to find logic between variable and values
    && (and) - return true if both are same
    || (or) - return ture if one is true
    !  (not) - return ture if not true
    */
    public static void logical(Scanner sample) {
        System.out.println("Logical operator for && (and)");
        System.out.println(false && false); // false
        System.out.println(false && true); // false
        System.out.println(true && false); // false
        System.out.println(true && true); // true

        System.out.println("Logical operator for || (or)");
        System.out.println(false || false); //false
        System.out.println(false || true); //true
        System.out.println(true || false); //true
        System.out.println(true || true);  //true

        System.out.println("Logical operator for ! (not)");
        System.out.println(!true); //false
        System.out.println(!false); //true
    }


    /*
    6. Conditional Operators
    if else


    */
    public static void conditional(Scanner sample) {
        int a = 3;
        int b = 5;
        if (a<b)
        {
           System.out.println("a is not greater than b");
        }
        else
        {
            System.out.println("a is greater than b.");
        }
    }


}
