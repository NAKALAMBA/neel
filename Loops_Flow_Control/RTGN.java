package Loops_Flow_Control;


import java.util.*;


//Reverse the given number . 


public class RTGN {
    public static void main ( String args[] ){
        Scanner sc = new Scanner ( System.in );
        int n , rev = 0 , lastdigit;
        System.out.println("Enter a number : ");
        n = sc.nextInt();
        while ( n > 0 ){
            lastdigit = n % 10 ;
            n = n/10 ;
            rev = ( rev * 10 ) + lastdigit ;
        }
        System.out.println(rev);
    }
}
