package Conditional.If_Else;

import java.util.*;

// Else if ke statements hai bhai 
public class Else_if {
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in );
        int age ;
        System.out.println("Enter the age of the user : ");
        age =sc.nextInt();
        if (age >= 18 ){
            System.out.println("ADULT");
        }
        else if ( age >= 13 && age < 18 ){
            System.out.println("Teenager");
        }
        else{
            System.out.println("CHILD");
        }
    }
}
