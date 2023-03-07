package Tut4;

import java.util.*;
class employee{
    int code;
    String name;
}
class teacher extends employee{
    int lecture,salary,total;
    Scanner sc=new Scanner(System.in);
    teacher(){
        System.out.println("Enter name");
        name= sc.next();
        System.out.println("Enter code");
        code= sc.nextInt();
        System.out.println("Enter number of lectures");
        lecture= sc.nextInt();
        System.out.println("Enter salary per lecture");
        salary= sc.nextInt();
    }
    void calc(){
        total=lecture*salary;
    }
    void display(){
        System.out.println("Your name is:"+name);
        System.out.println("Code is"+code);
        System.out.println("number of lectures are:"+lecture);
        System.out.println("Salary per lecture is:"+salary);
        System.out.println("total salary is:"+total);
        }    
}
class manager extends employee{
    double msalary,sales,bonus;
 
    Scanner sc=new Scanner(System.in);
    manager(){
        System.out.println("Enter name");
        name= sc.next();
        System.out.println("Enter code");
        code= sc.nextInt();
        System.out.println("Enter salary:");
        msalary= sc.nextInt();
        System.out.println("Enter unit of sales");
        sales= sc.nextInt();
    }
     void calc(){
        if(sales<100){
            bonus = msalary * 0.1;
        }
        else if(sales>=100&&sales<200){
            bonus=msalary*0.15;
            }
            else {
                bonus=msalary*0.2;
                }
     }
     void display(){
        System.out.println("Your name is:"+name);
        System.out.println("Code is"+code);
        System.out.println("Salary is:"+msalary);
        System.out.println("unit of sales is :"+sales);
        System.out.println(" bonus is:"+bonus);
        }    
     }
public class Q1 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        teacher obj=new teacher();
        obj.calc();
        obj.display();
        manager obj1=new manager();
        obj1.calc();
        obj1.display();
  
     }
}
