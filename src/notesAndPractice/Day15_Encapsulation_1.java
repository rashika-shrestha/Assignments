package notesAndPractice;

import java.time.LocalDate;

public class Day15_Encapsulation_1 {

    /*
    Encapsulation method is use to make the data secure. We user variable as private to make data secure but
    with getter and setter method, data can access. Setter will set the value and getter will get that value.
     */

    //if use void then can call from other

    private String empName;
    private int empId;
    private double Salary;
    private LocalDate HireDate; // Date format https://docs.oracle.com/javase/8/docs/api/java/time/LocalDate.html
    //https://www.javatpoint.com/java-localdate

    /*
    system to automatically generate getter and setter >> right click >> Generate
    >> Getter and Setter if need both otherwise only needed one select all that need to generate
    for this select private String, private int & private double >> click ok
    This will generate below sting get< empName or empId or Salary > + set<empName or empId or Salary
     */

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }

    public LocalDate getHireDate() {
        return HireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        HireDate = hireDate;
    }

    // after this in main class give the value which can be call
}
