package notesAndPractice;

public class Day11_Method {


/*
Method
public class nameThatYouProvide {
public class Main {
  static void myMethod() {
    // code to be executed
  }
}
Public void learningJavaLanguage (String a, int b, doble c){
		=== code
		=== code
	}

Method has Method Header and Method body
Method Header contains following: Access Specifier, Return Type, Method Name, Parameter List
 Access Modifiers (Specifiers):
1)	Public (we give this method when we need to accessible by all classes)
2)	Private (we give this method which will be accessible only in class which is defined)
3)	Protected (this is accessible within same package or subclass of different package)
4)	Default (this is visible only form same package) - implicit (default) and explicit
Return Type: most used is void, this is use when we do not need to have anything to return.
Method Name: this is a unique name for the method which is normally give to specify what is this method for. As per industry standard initial letter should be small letter and each word will be capital letter. There should not be any space, but underscore, hyphen is allowed to spate the word.
Parameter List: always will be inside parentheses, if so parameter it will leave blank. String, int, float, double etc are parameter list and separate with comma.

Method Body contains all the action that to take place. Code need to write within open and end of {}

Pre-defined Method – already defined and will be in Java class libraries
User-defined Methods – method which is written by user.

Method can be call multiple times
*/

    public static void writeToRun () {
        System.out.println("This is to call from main method to run");

    }

    public static void main(String[] args) {
        /*
        We can call method to run here which is written in other method by calling that method.
         */
        writeToRun();
        secondMethodToCall();
    }

    public static void secondMethodToCall(){
        System.out.println("To print second call");
           }


}
