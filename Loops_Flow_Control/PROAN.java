package Loops_Flow_Control;

import java.util.*;


//Print Reverse of a number is the question.


public class PROAN {
    public static void main ( String args[] ) {
        Scanner sc = new Scanner ( System.in );
        int n , lastdigit ;
        System.out.println ( "Enter a number : ");
        n = sc.nextInt() ;
        while ( n > 0 ){
            lastdigit = n % 10 ; 
            System.out.print(lastdigit);
            n = n/10 ;    // n /= 10
        }
        System.out.println();
    }
}
