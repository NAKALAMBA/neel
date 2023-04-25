package Stacks;

import Stacks.One.Stack;

public class two {
    public static void main ( String args[] ){
        stack < Integer > no = new Stack() ;
        
        //Add Elements to the stack 
        for ( int i = 0 ; i <= 10 ; i++ ) {
            System.out.println(i);
        }

        //Remove a Element from the Stack.
        System.out.println("Removed Element is : " + no.pop());
        System.out.println("Stack After The Pop : " + no );

        //Access The Top Element of the stack .
        
    }
}
