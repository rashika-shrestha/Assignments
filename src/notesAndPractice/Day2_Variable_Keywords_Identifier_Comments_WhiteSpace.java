package notesAndPractice;

/*
Input Elements and Tokens
Input Elements: Comments, Whitespace
Token: Keyword, Literal, Operator, Identifier

** INPUT ELEMENTS
* Comments: this is input element
Comments use is java for maintainability.
There are two types of comments
1. double back slash "//", this use for single line comments.
2. Backslash * TEXT * backslash. This is use for multi line comment.
If we have single like comment then we can write  // and write comment (Hint, Note)

* WhiteSpace: This is input element
White space is not allowed in identifier but can separate by under score _
When giving class - start with Capital letter
When giving variable - start with small letter
constant- In constant we need to have final at the beginning and all word should be join, beginning of word should be CAPITAL, have to have value
   final double VALUE_OF)VALUE = 3;

** TOKENS
* Separators: There are 9 characters in separators (punctuator)
1. (
2. )
3. [
4. ]
5. {
6. }
7. ;
8. .
9. .

* Keywords: There are 50 character sequence which is known as keywords.
This is reserved word to be used in keyword and cannot use in identifiers.
If these keywords is use, it will display error.
a. Access Modifier : 1. public 2.class 3. protected 4. default
b. Data type: 1.byte 2.short 3.int 4.long 5.float 6.double 7.char
              8.boolean 9.class 10.interface 11.enum
c. Conditional Statement: 1.if 2.else 3.switch 4.case
d. Looping: 1.while 2.do 3.for 4.break 5.continue
e. Exception Handling: 1.try 2.catch 3.throw 4.throws 5.finally
f. Others: 1.return 2.assert 3.abstract 4.void 5.static 6.import 7.new
           8.extend 9.package 10.super 11.implements 12.volatile 13.const
           14.goto 15.transient 16.synchronised 17.strictfp 18.native
           19.instanceof 20.this 21.transient

Addition to this there is two other words, but not categorized in keyword
1.true 2.false


* LITERALS
There are 6 types of literals and is the primitive type (String type & null type)
which is source code representation.
1. Integer
2. Boolean
3. String
4. Character
5. Null
6. Floating


* OPERATORS
As per ASCII (American Standard Code for Information Interchange), there are 37 tokens
in Operators
1.~ 2.! 3.% 4.^ 5.& 6.* 7.- 8.+ 9.= 10.| 11.: 12.< 13.> 14.? 15./
16.!= 17.%= 18.^= 19.&= 20.*= 21.-= 22.+= 23.== 24.|= 25.<= 26.>= 27./=
28.&& 29.-- 30.++ 31.== 32.<< 33.>> 34.<<= 35.>>= 36.>>> 37.>>>=

* IDENTIFIERS
Rules to
There are three JAVA components/types 1. Class 2. Method 3. Variable.
This is given to identify the purpose. Java letters and Java digits are sequence of identifier.
The first word of JAVA must be Java letter.
1. Class (Public, Default, Private ..)
class < -- >

2. Method
main ()

3. Variable


When we write code, we need to follow
a.rules - we need to follow this is we do not follow, we will get error and program will not run
1. can not use any keyword  2. can not use white space 3. can not use number at the beginning
b.conventions - this is something good practice to follow but will not give error
*/




public class Day2_Variable_Keywords_Identifier_Comments_WhiteSpace {

    public static void main(String[] args) {

    //==> single variable with single initialization
        int a;
        a = 5;

    //==> multiple variable with multiple initialization
        int x,y,z;
        x = 1;
        y = 2;
        z = 3;

    //==> multiple variable with simultaneous initialization
        int d=1, e=2, f=3;

     //==> multiple variable with same value
        int g,h,i;
        g=h=i=2;

     //==> single variable with simultaneous initialization
        int c = 5;
    }
}
