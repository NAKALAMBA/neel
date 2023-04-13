package Loops_Flow_Control;



import java.util.*;


//Keep entering numbers till users enters a multiple of 10.


public class BKQ {
    public static void main ( String args[] ){
        Scanner sc = new Scanner ( System.in );
        int n ;
        do{
            System.out.println("Enter a number : ");
            n = sc.nextInt();
            if ( n % 10 == 0 ){
                break ;
            }
            System.out.println(n);
        }while(true);
    }
}
