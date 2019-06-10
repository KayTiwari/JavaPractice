import java.io.*;

public class Employee {
    int age;
    String name;
    String designation;
    double salary;

    public Employee(String name){
        this.name = name;
    }

    public void empAge(int empAge){
        age = empAge;
    }

    public void empDesignation(String empDesig){
        designation = empDesig;
    }

    public void empSalary(double empSalary){
        salary = empSalary;
    }

    public void printEmployee() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(designation);
        System.out.println(salary);
    }
}