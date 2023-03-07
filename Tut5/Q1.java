
/* 
package Tut5;

import java.util.*;

public class Q1 {
    String name;
    class Employee()
    {
        String name;
        Scanner sc=new Scanner();
        System.out.println("Enter Name:  ");
        name=sc.nextInt();    
    }
}
class Teacher extends Employee{
    int lec, sal, calc;
    Teacher()
    {
        Scanner sc=new Scanner();
        System.out.println("Enter salary:  ");
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
class Manager extends Employee{
    int unit, sal,tot, bonus;
    Manager()
    {
        Scanner sc=new Scanner();
        System.out.println("Enter salary:  ");
        sal=sc.nextInt();
        System.out.println("Number of units: ");
        unit_sales=sc.nextInt();    
    }
    void m_calculate()
    {
        if(unit<100)
        {
            bonus=sal*0.1;
        }
        else if(unit>=100 && 200<unit)
        {
            bonus=sal*0.15;
        }
        else if(unit>=200)
        {    
            bonus=sal*0.2;
        }
        tot=sal+(sal+bonus);    
    }
    void m_display()
    {
        System.out.println("Salary of manager: "+tot);
    }
}
class Q1{
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