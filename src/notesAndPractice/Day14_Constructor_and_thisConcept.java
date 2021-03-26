package notesAndPractice;

public class Day14_Constructor_and_thisConcept {
/*
Constructor:
constructor is a object that is user to give initial values. this will not have
any return. Here we can user same class name "Day14_Constructor_and_thisConcept"
to create method. this do not have any. There are two types

No argument Constructor
Parameterized Constructor

 */

    public Day14_Constructor_and_thisConcept(){
        System.out.println("This is default constructor.");
    }

    //we can have may method consist of same class name but withing "()",
    //we need to add String or int double float have will be different
    public Day14_Constructor_and_thisConcept(String b){
    }

    public Day14_Constructor_and_thisConcept(String c, int b){
        String name = c;
        c = name;
        b = 20;

    }

    public static void main(String[] args) {

    }

/*
this Concept:

*/

}
