package Loops_Flow_Control;


import java.util.*;


//Find the sum of First N naztural numbers 

public class SOFNNN {
    public static void main ( String args[] ){
        Scanner sc = new Scanner ( System.in );
        int n , i = 1 , sum = 0 ;
        System.out.println("Enter a number : ");
        n = sc.nextInt();
        while ( i <= n ){
            sum += i ;
            i ++ ;
        }
        System.out.println("Sum is : " + sum);
    }
}
