package Inheritance;


import java.util.*;

public class Single {
class Employee{
    double salary = 50000;
    void DisplaySalary(){
        System.out.println("Emplyee Salary : " + salary);
    }
}


class FullTimeEmployee extends Employee{
    double hike = 0.50; 

    void IncremeantSalary(){
    salary = salary + ( salary * hike );
    System.out.println("Full Time Employee Salary After Incremeant : " + salary );
    }
}

class InternEmployee extends Employee{
    double hike = 0.25; 

    void IncremeantSalary(){
    salary = salary + ( salary * hike );
    System.out.println("Intern Employee Salary After Incremeant : " + salary );
    }
}


    public static void main ( String args[] ){
        FullTimeEmployee emp = new FullTimeEmployee();
        InternEmployee emp2 = new InternEmployee();
        System.out.println("Salary of a Full Time Employee Before Incremeanting ");
        emp.DisplaySalary();
        emp.IncremeantSalary();
        System.out.println("Salary of an intern before incrementing ");
        emp2.DisplaySalary();
        emp2.IncremeantSalary();
    }
}
