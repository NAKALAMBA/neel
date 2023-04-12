package Coditional_statements;


import java.util.*;

//Largest Of 2 Numbers Is the question.

public class LO2N {
    public static void main( String args[]){
        Scanner sc = new Scanner ( System.in );
        int a , b ;
        System.out.print("Enter the 1st number : ");
        a = sc.nextInt();
        System.out.print("Enter the 1st number : ");
        b = sc.nextInt();
        if ( a >= b ){
            System.out.println("A is greater than B ");
        }else{
            System.out.println("B is greater than A ");
        }
    }
}
