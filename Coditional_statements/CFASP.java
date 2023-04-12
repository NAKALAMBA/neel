package Coditional_statements;


import java.util.*;

//Check if a student Pass or fail

public class CFASP {
    public static void main ( String args[]){
    Scanner sc = new Scanner ( System.in );
    int mark ;
        System.out.print("Enter the marks mr.Student : ");
        mark = sc.nextInt();
        if ( mark >=85 ){
            System.out.println("Distinction Baby ");
        }else if ( mark > 60 && mark <85 ){
            System.out.println("Can do it better man " + "Next time for sure");
        } else {
            System.out.println("Are you really gonna make cry ");
            System.out.println("Administration : YES");
            System.out.println("UGGGGHHHH");
        }
    }
}