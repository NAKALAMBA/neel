package Coditional_statements.Questions;


import java.util.*;


/*
 * Write a Java program to input week number (1-7)
 *  and print day of week name using switch case.
 */

public class three {
    public static void main ( String args[]){
        Scanner sc = new Scanner ( System.in );
        int val ;
        System.out.print("Enter the numebr of the day : ");
        val = sc.nextInt();
        switch(val){
            case 0 :
            System.out.println("Monday");
            break ;
            case 1 :
            System.out.println("Tuesday");
            break ;
            case 2 :
            System.out.println("Wednesday");
            break ;
            case 3 :
            System.out.println("Thursday");
            break ;
            case 4 :
            System.out.println("Friday");
            break ;
            case 5 :
            System.out.println("Saturday");
            break ;
            case 6 :
            System.out.println("Sunday");
            break ;
            default :
            System.out.println("Invalid Choice");
            break;
        }
    }
}
