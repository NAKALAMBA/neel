package Jp_Assignment;

import java.util.*;
import java.util.Scanner;

/* 
class employee {
        String name;
        employee()
        {
        String name;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name: ");
        name=sc.nextLine();
        }
    }
        class Teacher extends employee{
        int lec, sal, calc;
        Teacher()
        {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter salary: ");
        sal=sc.nextInt();
        System.out.println("Number of lectures: ");
        lec=sc.nextInt();
        }
        void t_calulate()
        {
        calc=lec*sal;
        }
        void t_display()
        {
        System.out.println("Salary of teacher: "+calc);
        }
        }
        class Manager extends employee{
        int unit, sal,tot, bonus , unit_sales;
        float b = 0.1 , a = 0.15 , c = 0.2 ;
        Manager()
        {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter salary: ");
        sal=sc.nextInt();
        System.out.println("Number of units: ");
        unit_sales=sc.nextInt();
        }
        void m_calculate()
        {
        if(unit<100)
        {
        bonus=sal* b;
        }
        else if(unit>=100 && 200<unit)
        {
        bonus=sal * a ;
        }
        else if(unit>=200)
        {
        bonus=sal * c;
        }
        tot=sal+(sal+bonus);
        }
        void m_display()
        {
        System.out.println("Salary of manager: "+tot);
        }
    }
        public class Q1{
        public static void main(String args[]){
        int lec, tsal, tman, unit_sales;
        Teacher teach = new Teacher();
        teach.t_calculate();
        teach.t_display();
        Manager man = new Manager();
        man.m_calculate();
        man.m_display();
    }
}

*/

/*1.	Create a class Employee having code, name as data members. 
Teacher class inherits Employee class and has number of lecture conducted, 
salary per lecture as data member. 
Include method calculate which calculates total salary on following condition: Number of lecture * salary per lecture. 
Manager class inherits Employee class and has salary and unit of sales as data members. 
Include method calculate which calculates bonus on following condition: if unit of sales <100
then bonus= 10% of salary, else if unit of sales >=100 & <200 bonus=15% of salary,
 else if unit of sales >=200 then bonus= 20% of salary. */
/* 
 abstract class Employee{
    public static void main(String args[]){
    int code;
    String name;
    Scanner sc = new Scanner (System.in);
    System.out.println("--------------------------------------------------------");
    System.out.println("Enter the name of the employee : ");
    name = sc.nextLine();
    System.out.println("enter the code of the employee : ");
    code = sc.nextInt();
    }
}
    class teacher{
        public void Calculation
        int leco , saple ;
        System.out.println("Enter the number of lecture's coducted : ");
        leco = sc.nextInt();

}

*/