package Conditional.If_Else;

import java.util.*;

//Income tax Calculator 


public class Income {
public static void main(String args[]){
    Scanner sc = new Scanner (System.in);
    int income , tax ;
    String person ;
    System.out.println("The name of the user : ");
    person = sc.nextLine();
    System.out.println("Enter the salary : ");
    income = sc.nextInt();
    if (income < 5){
        System.out.println("Your salary after tax deduction will be : " );
        tax = 0 ;
    }
    else if (income >= 6 && income <= 10 ){
        System.out.println("Your salary after Tax deduction will be " );
        tax = (int) (income * 0.2);
    }
    else if ( income > 10 ) {
        System.out.println("The salary after Tax deduction will be : " );
        tax = (int) (income * 0.3);
        }
    else{
        System.out.println("kuch nhi bro paise nahi hai ");
    }
     //   System.out.println("your tax is : " + tax );
    }
}
