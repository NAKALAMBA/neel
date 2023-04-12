package Coditional_statements;



import java.util.*;

//The Question is about Ternary Operator.


//NOTE
/*
 * Binary was have 2 operands
 * Unary was having 1 operands
 * But Ternary has 3 operands to control
 */




public class TO {
    public static void main ( String args[]){
        Scanner sc = new Scanner ( System.in );
        int a ;
        System.out.println("Ek number dal bhai : ");
        a = sc.nextInt();
        //Ternary Operator
        String type = ( ( a % 2 ) == 0 )? "EVEN" : "ODD" ;
        System.out.println(type);
    }
}
