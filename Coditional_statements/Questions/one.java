package Coditional_statements.Questions;


import java.util.*;

/*Write a Java program to get a number
from the user and print whether it is positive or negative.*/


public class one {
    public static void main ( String args[]){
        Scanner sc = new Scanner ( System.in );
        int num ;
        System.out.print("Enter The number : ");
        num = sc.nextInt();
        if  ( (num%2) == 0 ){
            System.out.println("It's a positive number ");
        }else{
            System.out.println("It's a negative number ");
        }
    }
}
