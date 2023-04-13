package Loops_Flow_Control;

import java.util.*;

//Break Statement for java 

public class BS {
    public static void main ( String args[] ){
        Scanner sc = new Scanner( System.in );
        int n ;
        for( n = 1 ; n <= 5 ; n++ ){
            if ( n == 3 ){
                break ;
            }
            System.out.println(n);
        }
        System.out.println("I'm out of the loop");
    }
}
