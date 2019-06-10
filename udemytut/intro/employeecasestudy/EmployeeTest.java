import java.io.*;

public class EmployeeTest{

    public static void main(String args[]){
        Employee empOne = new Employee("Abhi Tiwari");
        Employee empTwo = new Employee("Bill Violette");

        empOne.empAge(24);
        empOne.empSalary(500);;
        empOne.empDesignation("Engineer");
        empOne.printEmployee();

        empTwo.empAge(32);
        empTwo.empDesignation("Lead Engineer");
        empTwo.empSalary(2000);;
        empTwo.printEmployee();
    }
}