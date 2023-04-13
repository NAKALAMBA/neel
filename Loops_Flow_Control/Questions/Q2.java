package Loops_Flow_Control.Questions;

import java.util.*;


/*
 *  Write a program that reads a set of integers , and then prints 
 *  the sum of the even and odd integers.
 */

public class Q2 {
    public static void main ( String args[] ){
        Scanner sc = new Scanner ( System.in );
        int n ;
        do{
            System.out.print("Enter a number : ");
            n = sc.nextInt();
            if ( n % 2 == 0 ){
                System.out.println("The integer is a Even Numeber");
            }else if ( n % 3 == 0 ){
                System.out.println("The integer is a ODD Number");
            } else{
                System.out.println("Invalid Thing");
            }
        }while (true);
    }
}
