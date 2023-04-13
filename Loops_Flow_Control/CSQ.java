package Loops_Flow_Control;



import java.util.*;

//Display all the numebrs entered by the user except multiples of 10.

public class CSQ {
    public static void main ( String args[] ){
        Scanner sc = new Scanner ( System.in ); 
        int n ;
        do{
            System.out.println("Enter a number : ");
            n = sc.nextInt();
            if ( n % 10 == 0 ){
                continue ;
            }
            System.out.println("Numebr was : " + n );
        }while ( true );
    }
}
