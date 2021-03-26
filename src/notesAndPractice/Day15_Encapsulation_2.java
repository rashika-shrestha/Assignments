package notesAndPractice;

import java.time.LocalDate;
import java.util.Scanner;

public class Day15_Encapsulation_2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Day15_Encapsulation_1 e1 = new Day15_Encapsulation_1 ();

         // option1();
          option2(input);
    }

    public static void option1() {

        /*
         give method name where getter and setter is declare so that
          it can call - method class name is "Day15_Encapsulation_1"
         */
        Day15_Encapsulation_1 e1 = new Day15_Encapsulation_1();  // how can we put this in main below Scanner
        // now when enter el + . it will give option of all three and can give value of each
        e1.setEmpName("Ram");
        e1.setEmpId(10);
        e1.setSalary(1400.56);
        e1.setHireDate(LocalDate.of(2001, 01, 11)); // Date format, see Day15 for link
        // if need to give today's date el.setHireDate (LocalDate.now()) for date only now() for date+time
        //e1.setHireDate (LocalDate.now());

        System.out.println("Name of Employee is: " + e1.getEmpName());
        System.out.println("ID of Employee is: " + e1.getEmpId());
        System.out.println("Salary of Employee is: " + e1.getSalary());
        System.out.println("Hire date of Employee is: " + e1.getHireDate());

    }

    public static void option2(Scanner input) {
        Day15_Encapsulation_1 e1 = new Day15_Encapsulation_1();  // can we put this is main so do not need to add in each method ?

        System.out.println("Enter Employee Name: ");
        String empName = input.next();
        System.out.println("Enter Employee ID: ");
        int empId = input.nextInt();
        System.out.println("Enter Employee Salary: ");
        double salary = input.nextDouble();
        System.out.println("Enter Employee Hire " + "year: " + "month: " + "day: " );
        String  hireDate = input.next();

        e1.setEmpName(empName);
        e1.setEmpId(empId);
        e1.setSalary(salary);
       // e1.setHireDate(hireDate);  // this is giving error, I have ask year, month, day

        System.out.println(e1.getEmpName());
        System.out.println(e1.getEmpId());
        System.out.println(e1.getSalary());
        System.out.println(e1.getHireDate());

    }

}