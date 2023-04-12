package Coditional_statements.Questions;

import java.util.*;


public class two {
    public static void main ( String args[]){
        Scanner sc = new Scanner ( System.in );
        double temp ;
        System.out.print("Enter The temperature of ur body : ");
        temp = sc.nextInt();
        if  ( temp >= 100.00 ){
            System.out.println("You have fever");
        }else{
            System.out.println("You don't have fever bro");
        }
    }
}
