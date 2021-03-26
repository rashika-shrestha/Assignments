package notesAndPractice;


/*
Each package should have main(String[] arg), from where code can be execute. Method will run from main.
 */

/*
See next sample in "Day12_CallFromOtherClass" where below method is call within package. This method can be call outside
of package by giving "import" statement under package
 */

public class Day12_ClassesObjects_Static {
    /*

        Take example of CAR
        CAR - is an object/class - Example above "Day12_ClassesObjects_Static"  & below "sumClass" are CLASS
        Color / Model - attributes which are type/ value  - Example below a & b ATTRIBUTES

       Drive / Break/ Wheel - methods which are parts of class - below block of class main which contains all functions is a method.
       method can be refuse, like write once and use many times.

       If String is declare at class this can be call from all method, like below in String. There static and non-static variable

     */

        String nonStaticValue = "This is call form non Static Value";
        static String staticValue = "This is call from Static Value";

    public static void sumClass() {
        int a = 2;
        int b = 3;
        int sum = a + b;
        System.out.println("The sum of a and b is : " +sum);
     }



    public static void main(String[] args) {
        //Calling static
        System.out.println(Day12_ClassesObjects_Static.staticValue);
        //but we cannot call nonStaticValue by above, it will give error (remove "//" below and check
        // below error display like ".... cannot create ..."
        //System.out.println((Day12_ClassesObjects_Static.nonStaticValue);
        //Also method can be call by calling method directly
        Day12_ClassesObjects_Static.sumClass();

        //Calling non static
        Day12_ClassesObjects_Static ob = new Day12_ClassesObjects_Static();
        System.out.println(ob.nonStaticValue);
        //can call method by same
        Day12_ClassesObjects_Static.sumClass();

        Day12_ClassesObjects_Static.createObject();



        /*
        when run it will run above 4 functions.
         */
     }

     /*
     Types of Object
     */

    public static void createObject() {
        //Sample 1
        int a=2;
        //above by creating object
        Day12_ClassesObjects_Static ob1 = new Day12_ClassesObjects_Static();
        Day12_ClassesObjects_Static ob2 = new Day12_ClassesObjects_Static();
        Day12_ClassesObjects_Static ob3 = new Day12_ClassesObjects_Static();


        //Sample 2
        int b;
        Day12_ClassesObjects_Static obj1;
        Day12_ClassesObjects_Static obj2;
        Day12_ClassesObjects_Static obj3;
        b = 14000;
        obj1 = new Day12_ClassesObjects_Static(); // you call call obj2, obj3, .... many

        //Sample 4 - anonymous object
        //4
        new Day12_ClassesObjects_Static();
        System.out.println(obj1);  // why this is printing
        // notesAndPractice.Day12_ClassesObjects_Static@5f184fc6  NOT 14000 because value of b is 14000
    }




}
