package notesAndPractice.Day18_Inheritance.Single_Level;

public class C_Runner {
/*
1. single-level (Parent -- Child)

 we can run Parent's class by simply giving Child class
 parent has been inheritance by child by giving extends <A_Parent>
 OR directly call from Parent
*/

    public static void main(String[] args) {

/*Sample 1 - non inheritance
//Example directly calling from parent
// <call the parent classname>
        A_Parent p = new A_Parent();

        System.out.println(p.name); // this is String given in Parent
        p.greet(); // this is calling class name method of Parent same way can call child also
*/

/*Sample 2 - single level inheritance
// Now calling value which is in parent by using child class B_Child ob = new B_Child();
*/
        B_Child ob = new B_Child();
        System.out.println(ob.name); //parent value to print
        ob.greet(); // parent value to print



    }

}
