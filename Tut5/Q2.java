

/* 
package Tut5;

import java.util.*;

public class Q2 {
    
class Student{

    int rollno;
    
    String name;

}
    
    class test extends Student{
    
    int mark1,mark2,total,sport_point;
    
    Scanner sc=new Scanner(System.in);
    
    void ip(){
    
    System.out.println("Enter name:");
    
    name= sc.next();
    
    System.out.println("enter roll number:");
    
    rollno= sc.nextInt();
    
    System.out.println("enter mark 1:");
    
    mark1= sc.nextInt();
    
    System.out.println("enter mark 2:");
    
    mark2= sc.nextInt();
    
    System.out.println("enter sport point:");
    
    sport_point= sc.nextInt();
    
    }
    
    }
    
    interface Sport{
    
    void calculate();
    
    }
    
    class result extends test{
    
    class test implements Sport{
    
    void Calculate(){
    
    System.out.println("Name:"+name);
    
    System.out.println("Roll number:"+rollno);
    
    System.out.println("Mark 1:"+mark1);
    
    System.out.println("Mark 2"+mark2);
    
    total=mark1+mark2+sport_point;
    
    System.out.println("the total is "+total);
    
    }
    
    }
    
    }
    
    class Q2{
    
    public static void main(String args[]){
    
    Scanner sc=new Scanner(System.in);
    
    test obj=new test();
    
    obj.ip();

    obj.calculate();
    
        }
    
    }
}

*/